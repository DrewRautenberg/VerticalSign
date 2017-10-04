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

    static void printMixedHor(int wid, int numSpaces){
        int printWid = wid - numSpaces;
        for (int i=0;i<2;i++){
            for (int j=0;j<numSpaces;j++){
                System.out.print(" ");
            }
            for (int k=0; k<printWid;k++){
                System.out.print("X");
            }
            System.out.println();
        }

    }
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

    static void printMVert(int wid, int ht) {
        int dis = (wid - 2) / 2;
        for (int i = 0; i < ht; i++) {
            for (int j = 0; j < dis; j++) {
                System.out.print(" ");
            }
            System.out.println("XX");
        }
    }

}
