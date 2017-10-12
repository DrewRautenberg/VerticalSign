package verticalsign;

import javax.swing.*;

public class VerticalSign {
    public static void main(String[] args) {
        int ht;
        int wid;
        int htIn;
        int widIn;
        String userInput;
        String numIn;
        String outPut;

        numIn=JOptionPane.showInputDialog("Height:");
        htIn=Integer.parseInt(numIn);
        if ((htIn<=20) && (htIn>=10)){
            ht=htIn;
        }
        else {
            ht=10;
            JOptionPane.showMessageDialog(null,"Height not in acceptable range, " +
                    "set to default value of 10.");
        }
        if (ht%2 !=0){
            ht=ht+1;
            JOptionPane.showMessageDialog(null,"Height is not an even number, set to "+ht+".");
        }
        numIn=JOptionPane.showInputDialog("Width:");
        widIn=Integer.parseInt(numIn);
        if ((widIn<=16) && (widIn>=8)){
            wid=widIn;
        }
        else {
            wid=10;
            JOptionPane.showMessageDialog(null,"Width not in acceptable range, " +
                    "set to default value of 10.");
        }
        if (wid%2 !=0){
            wid=wid+1;
            JOptionPane.showMessageDialog(null,"Width is not an even number, set to "+ht+".");
        }
        userInput=JOptionPane.showInputDialog("Please enter phrase to display");

        outPut=userInput.toUpperCase();
        for (int i=0;i<outPut.length();i++){
            char car=outPut.charAt(i);
            switch (car){
                case '0':
                    Chars.show0(ht, wid);
                    break;
                case '1':
                    Chars.show1(ht, wid);
                    break;
                case '2':
                    Chars.show2(ht, wid);
                    break;
                case '3':
                    Chars.show3(ht, wid);
                    break;
                case '4':
                    Chars.show4(ht, wid);
                    break;
                case '5':
                    Chars.show5(ht, wid);
                    break;
                case '6':
                    Chars.show6(ht, wid);
                    break;
                case '7':
                    Chars.show7(ht, wid);
                    break;
                case '8':
                    Chars.show8(ht, wid);
                    break;
                case '9':
                    Chars.show9(ht, wid);
                    break;
                case 'C':
                    Chars.showC(ht, wid);
                    break;
                case 'E':
                    Chars.showE(ht, wid);
                    break;
                case 'F':
                    Chars.showF(ht, wid);
                    break;
                case 'H':
                    Chars.showH(ht, wid);
                    break;
                case 'I':
                    Chars.showI(ht, wid);
                    break;
                case 'L':
                    Chars.showL(ht, wid);
                    break;
                case 'O':
                    Chars.showO(ht, wid);
                    break;
                case 'P':
                    Chars.showP(ht, wid);
                    break;
                case 'S':
                    Chars.showS(ht, wid);
                    break;
                case 'T':
                    Chars.showT(ht, wid);
                    break;
                case 'U':
                    Chars.showU(ht, wid);
                    break;
                case ' ':
                    Chars.showSpace(ht, wid);
                    break;
                default:
                    Chars.showNonPrintable(ht, wid);
                    break;
            }
            System.out.println();
        }
    }
}
