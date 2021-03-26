package Input_File_Rows;

import javax.swing.*;

public class PopUpDialogBox {

    PopUpDialogBox(){
       // JOptionPane.showMessageDialog(null, "Your reservation has been made. \n Would you like to make another reservation?",
       //        "Success!", JOptionPane.PLAIN_MESSAGE);

        int selectedOption = JOptionPane.showConfirmDialog(null, "Your reservation has been made. \n Would you like to make another reservation?",
                "Success!", JOptionPane.YES_NO_OPTION);

        if (selectedOption == JOptionPane.YES_OPTION) {
            SecondOptions secondOptions = new SecondOptions();
        }
        if (selectedOption == JOptionPane.NO_OPTION) {
            FinalWindow finalWindow = new FinalWindow();
        }
    }
}
