package Input_File_Rows;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Test implements ActionListener {

    JFrame frame;
    JMenuBar menuBar;
    JMenu menu, menu2;
    JMenu subMenu;
    JMenuItem menuItem1, menuItem2, menuItem3;
    JCheckBoxMenuItem checkItem1, checkItem2;
    File file;
    File outputFile = new File("C:/output.txt");
    Scanner fileIn;
    int response;
    JFileChooser chooser = new JFileChooser(".");


    char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};




//    public reservation(String s, int n){
//
//
//
//    }



    public Test(){

        menuBar = new JMenuBar();

        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(menu);

        menu2 = new JMenu("Edit");
        menu2.setMnemonic(KeyEvent.VK_E);
        menuBar.add(menu2);

        menuItem1 = new JMenuItem("Load");//, new ImageIcon("file.png"));
        menuItem1.setMnemonic(KeyEvent.VK_L);
        menuItem1.addActionListener(this);
        menu.add(menuItem1);

        menuItem2 = new JMenuItem("Save");//, new ImageIcon("save.png"));
        menuItem2.setMnemonic(KeyEvent.VK_S);
        menuItem2.addActionListener(this);
        menu.add(menuItem2);

        menuItem3 = new JMenuItem("Options");//, new ImageIcon("options.png"));
        menuItem3.setMnemonic(KeyEvent.VK_O);
        menuItem3.addActionListener(this);
        menu.add(menuItem3);

        subMenu = new JMenu("submenu");
        menu.add(subMenu);

        checkItem1 = new JCheckBoxMenuItem("item #1");
        checkItem1.addActionListener(this);
        subMenu.add(checkItem1);

        checkItem2 = new JCheckBoxMenuItem("item #2");
        checkItem2.addActionListener(this);
        subMenu.add(checkItem2);

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == menuItem1){
            JFileChooser chooser = new JFileChooser(".");
            chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            response = chooser.showOpenDialog(null);

            if(response == JFileChooser.APPROVE_OPTION){
                try {
                    FileReader fr = new FileReader(chooser.getSelectedFile().getPath()); //connect chooser to file reader
                    BufferedReader file_in = new BufferedReader(fr); //connects file reader to bufferedreader

                    FileWriter fw = new FileWriter("output.txt"); // A stream that connects to the text file
                    BufferedWriter file_out = new BufferedWriter(fw);// Connect the FileWriter to the BufferedWriter

                    //ArrayList<String> seatReservations = new ArrayList<String>();
                    String line = null; //to  skip over the first line
                    int count = 0;

                    while ((line = file_in.readLine()) != null){
                        if (count == 0){
                            file_out.write("Example Output File Rows:");
                            file_out.newLine();
                        }

                        if(count != 0) { // count == 0 means the first line

                            String reservation = line.substring(0,5);
                            String numSeats = line.substring(5,6);
                            int num = Integer.parseInt(numSeats); //int that will be used to make seating assigning

                            file_out.write(reservation);
                            file_out.write(String.valueOf(num));
                            file_out.newLine();
                        }
                        count++;
                    }
                    file_in.close(); // Close the stream
                    file_out.close();
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
        if(e.getSource() == menuItem2){
            System.out.println("You have saved the file");
        }
        if(e.getSource() == menuItem3){
            System.out.println("You have opened the options menu");
        }
        if(e.getSource() == checkItem1 && checkItem1.isSelected()){
            System.out.println("you have selected Item #1");
        }
    }
}
