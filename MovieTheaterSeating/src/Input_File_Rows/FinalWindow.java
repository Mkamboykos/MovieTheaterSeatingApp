package Input_File_Rows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalWindow implements ActionListener {

    JFrame frame = new JFrame("All Done!");
    JPanel panel = new JPanel();
    JLabel label1 = new JLabel("Check out your reservation on your desktop");
    JLabel label2 = new JLabel("Have a nice day! :)");
    JButton button = new JButton("Exit");

    FinalWindow(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,250);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));

        panel.setPreferredSize(new Dimension(400,120));
        //panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));

        button.setBounds(100,160,150,40);
        button.setFocusable(false); //sometimes buttons are highlighted and its annoying
        button.addActionListener(this);

        label1.setBounds(10,10,500, 25);
        label1.setFont(new Font(null, Font.PLAIN, 20));

        label2.setBounds(10,10,500, 25);
        label2.setFont(new Font(null, Font.PLAIN, 20));


        panel.add(label1); //add label
        panel.add(label2); //add label
        frame.add(panel);
        frame.add(button); //add button

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button){
            frame.dispose();
            System.exit(0);
        }
    }
}