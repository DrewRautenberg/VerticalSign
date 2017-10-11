package verticalsign;

import javax.swing.*;

public class VerticalSign {
    public static void main(String[] args) {
        int ht;
        int wid;
        String userInput;
        String numIn;
        String outPut;
        userInput=JOptionPane.showInputDialog("Please enter phrase to display");
        numIn=JOptionPane.showInputDialog("Height:");
        ht=Integer.parseInt(numIn);
        numIn=JOptionPane.showInputDialog("Width:");
        wid=Integer.parseInt(numIn);

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
