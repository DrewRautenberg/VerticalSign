package verticalsign;

public class Chars {
    //*************************************************************** 10 DIGITS
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 0
    public static void show0(int ht, int wid) {
        Draw.printMixedHor(1,wid -2);
        Draw.printLRVer(ht-4, wid);
        Draw.printMixedHor(1,wid-2);
    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 1
    public static void show1(int ht, int wid) {
        Draw.printMVert(ht,wid);

    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 2
    public static void show2(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 3
    public static void show3(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 4
    public static void show4(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 5
    public static void show5(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 6
    public static void show6(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 7
    public static void show7(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 8
    public static void show8(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 9
    public static void show9(int ht, int wid) {


    }
    //***************************************************** 11 SQUARISH LETTERS
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - C
    public static void showC(int ht, int wid) {
        Draw.printHor(wid);
        Draw.printLVer(ht-4);
        Draw.printHor(wid);
    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - E
    public static void showE(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - F
    public static void showF(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - H
    public static void showH(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - I
    public static void showI(int ht, int wid) {
        Draw.printHor(wid);
        Draw.printMVert(ht-4,wid);
        Draw.printHor(wid);
    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - L
    public static void showL(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - O
    public static void showO(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - P
    public static void showP(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - S
    public static void showS(int ht, int wid) {


    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - T
    public static void showT(int ht, int wid) {
        Draw.printHor(wid);
        Draw.printMVert(ht-2, wid);
    }
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - U
    public static void showU(int ht, int wid) {
        Draw.printLRVer(ht-2,wid);
        Draw.printHor(wid);
    }
    //******************************************************************* SPACE
    public static void showSpace(int ht, int wid) {


    }
    //********************************************************** NON-PRINTABLES
    public static void showNonPrintable(int ht, int wid) {
        for (int i=0; i<(ht/2); i++){
            Draw.printHor(wid);
        }
    }
    //*************************************************************************
}
