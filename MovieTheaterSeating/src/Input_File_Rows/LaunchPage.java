package Input_File_Rows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame("Welcome!");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Would you like to make a reservation?");
    JButton button = new JButton("Make a Reservation");

    LaunchPage(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,230);
        frame.setLayout(new FlowLayout());

        panel.setPreferredSize(new Dimension(350,100));
        //panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout(FlowLayout.LEADING,10,50));

        button.setBounds(100,160,150,40);
        button.setFocusable(false); //sometimes buttons are highlighted and its annoying
        button.addActionListener(this);

        label.setBounds(10,10,500, 25);
        label.setFont(new Font(null, Font.PLAIN, 20));


        panel.add(label); //add label
        frame.add(panel);
        frame.add(button); //add button

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button){
            frame.dispose();
            OptionsWindow optionsWindow = new OptionsWindow();
        }
    }
}