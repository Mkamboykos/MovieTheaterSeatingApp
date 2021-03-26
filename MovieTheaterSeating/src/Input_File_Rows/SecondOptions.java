
package Input_File_Rows;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.io.BufferedWriter;
        import java.io.FileWriter;
        import java.io.IOException;

public class SecondOptions implements ActionListener {

    JFrame frame = new JFrame("Make a Reservation");

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();

    JLabel topLabel = new JLabel("Please fill the the boxes with your infomation below.", JLabel.CENTER);

    JLabel firstNameDescription = new JLabel("First Name: ");
    JTextField firstNameInput = new JTextField();

    JLabel lastNameDescription = new JLabel("Last Name: ");
    JTextField lastNameInput = new JTextField();

    JLabel MovieDescription = new JLabel("Select a Movie: ");
    JComboBox movies;

    JLabel seatRowDescription = new JLabel("Select the seat row: ");
    JComboBox rows;

    JLabel seatColumnDescription = new JLabel("Select the seat column: ");
    JComboBox columns;

    JLabel dateDescription = new JLabel("Pick a date: ");
    JComboBox daySelect;
    JLabel slash1 = new JLabel("/");
    JComboBox monthSelect;
    JLabel slash2 = new JLabel("/");
    JComboBox yearSelect;

    JLabel timeDescription = new JLabel("Pick a movie time: ");
    JComboBox timeSelect;

    JButton button = new JButton("Submit");

    SecondOptions(){

        //frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,450);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));


        //panels
        panel1.setPreferredSize(new Dimension(465,450));
        //panel1.setBackground(Color.lightGray);
        panel1.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));

        panel2.setPreferredSize(new Dimension(375,290));
        //panel2.setBackground(Color.blue);
        panel2.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));

        panel3.setPreferredSize(new Dimension(450,65));
        //panel3.setBackground(Color.green);
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));


        //layout
        topLabel.setFont(new Font(null, Font.PLAIN, 20));

        firstNameDescription.setFont(new Font(null, Font.PLAIN, 20));
        firstNameInput.setPreferredSize(new Dimension(220,30));

        lastNameDescription.setFont(new Font(null, Font.PLAIN, 20));
        lastNameInput.setPreferredSize(new Dimension(220,30));

        MovieDescription.setFont(new Font(null, Font.PLAIN, 20));
        String[] moviesArr = {"Movies Available", "Memoirs of a Geisha", "C", "D", "E", "F", "G", "H", "I", "J"};
        movies = new JComboBox(moviesArr);
        movies.addActionListener(this);
        movies.setPreferredSize(new Dimension(185, 30));
        movies.setBackground(Color.white);
        ((JLabel)movies.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        seatRowDescription.setFont(new Font(null, Font.PLAIN, 20));
        String[] letter = {"Rows", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        rows = new JComboBox(letter);
        rows.addActionListener(this);
        rows.setPreferredSize(new Dimension(145, 30));
        rows.setBackground(Color.white);
        ((JLabel)rows.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        seatColumnDescription.setFont(new Font(null, Font.PLAIN, 20));
        String[] n = {"Columns", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20"};
        columns = new JComboBox(n);
        columns.addActionListener(this);
        columns.setPreferredSize(new Dimension(117, 30));
        columns.setBackground(Color.white);
        ((JLabel)columns.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        dateDescription.setFont(new Font(null, Font.PLAIN, 20));
        String[] dayArr = {"dd","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        daySelect = new JComboBox(dayArr);
        daySelect.addActionListener(this);
        daySelect.setPreferredSize(new Dimension(50, 30));
        daySelect.setBackground(Color.white);
        ((JLabel)daySelect.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        slash1.setFont(new Font(null, Font.PLAIN, 20));

        String[] monthArr = {"mm","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        monthSelect = new JComboBox(monthArr);
        monthSelect.addActionListener(this);
        monthSelect.setPreferredSize(new Dimension(50, 30));
        monthSelect.setBackground(Color.white);
        ((JLabel)monthSelect.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        slash2.setFont(new Font(null, Font.PLAIN, 20));

        String[] yearArr = {"yyyy","2021"};
        yearSelect = new JComboBox(yearArr);
        yearSelect.addActionListener(this);
        yearSelect.setPreferredSize(new Dimension(65, 30));
        yearSelect.setBackground(Color.white);
        ((JLabel)yearSelect.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        timeDescription.setFont(new Font(null, Font.PLAIN, 20));
        String[] timesArr = {"hh:mm","11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM",
                "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM",
                "6:30 PM", "7:00 PM", "7:30 PM"};
        timeSelect = new JComboBox(timesArr);
        timeSelect.addActionListener(this);
        timeSelect.setPreferredSize(new Dimension(162, 30));
        timeSelect.setBackground(Color.white);
        ((JLabel)timeSelect.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        button.addActionListener(this);


        //order of layout added to panels
        panel1.add(topLabel); //Added top label to panel1 (outter panel)

        panel2.add(firstNameDescription);
        panel2.add(firstNameInput);
        panel2.add(lastNameDescription);
        panel2.add(lastNameInput);
        panel2.add(MovieDescription);
        panel2.add(movies);
        panel2.add(seatRowDescription);
        panel2.add(rows);
        panel2.add(seatColumnDescription);
        panel2.add(columns);
        panel2.add(dateDescription);
        panel2.add(daySelect);
        panel2.add(slash1);
        panel2.add(monthSelect);
        panel2.add(slash2);
        panel2.add(yearSelect);
        panel2.add(timeDescription);
        panel2.add(timeSelect);

        panel3.add(button);


        //order of panels added to frame
        panel1.add(panel2);
        panel1.add(panel3);
        frame.add(panel1);

        //made everything in frame visible
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {

            String fName = firstNameInput.getText();
            String lName = lastNameInput.getText();
            String movie = String.valueOf(movies.getSelectedItem());
            String row = String.valueOf(rows.getSelectedItem());
            String column = String.valueOf(columns.getSelectedItem());
            String day = String.valueOf(daySelect.getSelectedItem());
            String month = String.valueOf(monthSelect.getSelectedItem());
            String year = String.valueOf(yearSelect.getSelectedItem());
            String time = String.valueOf(timeSelect.getSelectedItem());

            String receipt = ("Movie Reservation:" + "\n" +
                    " Name: " + fName + " " + lName + "\n" +
                    "Movie: " + movie + "\n" +
                    " Seat: " + row + column + "\n" +
                    " Date: " + day + "/" + month + "/" + year + "\n" +
                    " Time: " + time + "\n");
            System.out.println(receipt);


            try {
                FileWriter fw = new FileWriter("output.txt",true); // A stream that connects to the text file
                BufferedWriter file_out = new BufferedWriter(fw);// Connect the FileWriter to the BufferedWriter

                file_out.write(receipt);
                file_out.newLine();
                file_out.close();

                frame.dispose();
                PopUpDialogBox popUpDialogBox = new PopUpDialogBox();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            firstNameInput.setText("");
            lastNameInput.setText("");


        }

    }
}