package verticalsign;

public class Draw {
    public static void printHor(int wid){
        for (int i=0; i<2;i++){
            for (int j=0; j<wid;j++){
                System.out.print("X");
            }
            System.out.println();
        }
    }

}
