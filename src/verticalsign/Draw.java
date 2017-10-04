package verticalsign;

 class Draw {
     static void printHor(int wid){
        for (int i=0; i<2;i++){
            for (int j=0; j<wid;j++){
                System.out.print("X");
            }
            System.out.println();
        }
    }
    //printMixedHor
    static void printLVer(int height){
         for (int i=0; i<height;i++){
             System.out.println("XX");
         }
    }
    static void printRVer(int width, int height){
        int distRight = width-2;
        for (int i=0; i<height;i++) {

            for (int j = 0; j < distRight; j++) {
                System.out.print(" ");
            }
            System.out.println("XX");
        }
    }

}
