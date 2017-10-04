package verticalsign;

class Draw {
    static void printHor(int wid) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < wid; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    //printMixedHor
    static void printLVer(int ht) {
        for (int i = 0; i < ht; i++) {
            System.out.println("XX");
        }
    }

    static void printRVer(int wid, int ht) {
        int distRight = wid - 2;
        for (int i = 0; i < ht; i++) {

            for (int j = 0; j < distRight; j++) {
                System.out.print(" ");
            }
            System.out.println("XX");
        }
    }

    static void printLRVer(int wid, int ht) {
        int dis = wid - 4;
        for (int i = 0; i < ht; i++) {
            System.out.print("XX");
            for (int j = 0; j < dis; j++) {
                System.out.print(" ");
            }
            System.out.println("XX");
        }

    }

}
