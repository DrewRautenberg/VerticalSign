package verticalsign;

import javax.swing.*;

public class VerticalSign {
    public static void main(String[] args) {
        int ht=11;
        int wid=10;
        String userInput;
        String numIn;
        userInput=JOptionPane.showInputDialog("Please enter phrase to display");
        numIn=JOptionPane.showInputDialog("Height:");
        ht=Integer.parseInt(numIn);
        numIn=JOptionPane.showInputDialog("Width:");
        wid=Integer.parseInt(numIn);

    }
}
