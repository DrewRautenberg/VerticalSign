package verticalsign;

class Chars {
    static void show0(int ht, int wid) {
        Draw.printMixedHor(1, wid - 2);
        Draw.printLRVer(ht - 4, wid);
        Draw.printMixedHor(1, wid - 2);
    }

    static void show1(int ht, int wid) {
        Draw.printMVer(ht, wid);
    }

    static void show2(int ht, int wid) {
        int segHt;
        segHt = (ht - 6) / 2;
        Draw.printHor(wid - 1);
        Draw.printRVer(segHt, wid);
        Draw.printMixedHor(1, wid - 2);
        Draw.printLVer(segHt);
        Draw.printHor(wid);
    }

    static void show3(int ht, int wid) {
        int segHt;
        segHt = (ht - 6) / 2;
        Draw.printHor(wid - 1);
        Draw.printRVer(segHt, wid);
        Draw.printMixedHor(wid / 3, wid - 1);
        Draw.printRVer(segHt, wid);
        Draw.printHor(wid - 1);
    }

    static void show4(int ht, int wid) {
        int segHt;
        segHt = (ht - 2) / 2;
        Draw.printLRVer(segHt, wid);
        Draw.printHor(wid);
        Draw.printRVer(segHt, wid);
    }

    static void show5(int ht, int wid) {
        int segHt;
        segHt = (ht - 6) / 2;
        Draw.printHor(wid);
        Draw.printLVer(segHt);
        Draw.printHor(wid - 1);
        Draw.printRVer(segHt, wid);
        Draw.printHor(wid - 1);
    }

    static void show6(int ht, int wid) {
        int segHt;
        segHt = (ht - 6) / 2;
        Draw.printLVer(segHt + 2);
        Draw.printHor(wid - 1);
        Draw.printLRVer(segHt, wid);
        Draw.printMixedHor(1, wid - 1);
    }

    static void show7(int ht, int wid) {
        Draw.printHor(wid);
        Draw.printRVer(ht - 2, wid);
    }

    static void show8(int ht, int wid) {
        int segHt;
        segHt = (ht - 6) / 2;
        Draw.printMixedHor(1, wid - 1);
        Draw.printLRVer(segHt, wid);
        Draw.printMixedHor(1, wid - 1);
        Draw.printLRVer(segHt, wid);
        Draw.printMixedHor(1, wid - 1);
    }

    static void show9(int ht, int wid) {
        int segHt;
        segHt = (ht - 4) / 2;
        Draw.printMixedHor(1, wid - 1);
        Draw.printLRVer(segHt, wid);
        Draw.printMixedHor(1, wid);
        Draw.printRVer(segHt, wid);
    }

    static void showC(int ht, int wid) {
        Draw.printHor(wid);
        Draw.printLVer(ht - 4);
        Draw.printHor(wid);
    }

    static void showE(int ht, int wid) {
        int segHt;
        segHt = (ht - 6) / 2;
        Draw.printHor(wid);
        Draw.printLVer(segHt);
        Draw.printHor(wid / 2);
        Draw.printLVer(segHt);
        Draw.printHor(wid);
    }

    static void showF(int ht, int wid) {
        int segHt;
        segHt = (ht - 4) / 2;
        Draw.printHor(wid);
        Draw.printLVer(segHt);
        Draw.printHor(wid / 2);
        Draw.printLVer(segHt);
    }

    static void showH(int ht, int wid) {
        int segHt;
        segHt = (ht - 2) / 2;
        Draw.printLRVer(segHt, wid);
        Draw.printHor(wid);
        Draw.printLRVer(segHt, wid);
    }

    static void showI(int ht, int wid) {
        Draw.printHor(wid);
        Draw.printMVer(ht - 4, wid);
        Draw.printHor(wid);
    }

    static void showL(int ht, int wid) {
        Draw.printLVer(ht - 2);
        Draw.printHor(wid);
    }

    static void showO(int ht, int wid) {
        Draw.printHor(wid);
        Draw.printLRVer(ht - 4, wid);
        Draw.printHor(wid);
    }

    static void showP(int ht, int wid) {
        int segHt;
        segHt = (ht - 4) / 2;
        Draw.printHor(wid);
        Draw.printLRVer(segHt, wid);
        Draw.printHor(wid);
        Draw.printLVer(segHt);
    }

    static void showS(int ht, int wid) {
        int segHt;
        segHt = (ht - 6) / 2;
        Draw.printHor(wid);
        Draw.printLVer(segHt);
        Draw.printHor(wid);
        Draw.printRVer(segHt, wid);
        Draw.printHor(wid);
    }

    static void showT(int ht, int wid) {
        Draw.printHor(wid);
        Draw.printMVer(ht - 2, wid);
    }

    static void showU(int ht, int wid) {
        Draw.printLRVer(ht - 2, wid);
        Draw.printHor(wid);
    }

    static void showSpace(int ht, int wid) {
        for (int i = 0; i < ht; i++) {
            for (int j = 0; j < wid; j++) {
                System.out.print("");
            }
            System.out.println();
        }
    }

    static void showNonPrintable(int ht, int wid) {
        for (int i = 0; i < (ht / 2); i++) {
            Draw.printHor(wid);
        }
    }
}