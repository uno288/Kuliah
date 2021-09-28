public class LoopBersarang{

    public static void main(String[] args) {
        

        for (int i = 0; i <= 4; i++){
            for (int j = 0; j <= 4; j++){

                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 0; i <= 5; i++){
            for (int j = 0; j <= 5; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 0; i <= 5; i++){
            for (int j = 0; j <= 5; j++){
                System.out.print("* ");
                if ((i + j) == 5){
                    break;
                }
            }
            System.out.print(" \n");
        }
        System.out.print("\n");

        for (int i = 0; i <= 8; i++){
            for (int j = 0; j <= 8; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }else if ((i + j) == 8){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

}