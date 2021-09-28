import java.util.Scanner;

public class SwitchCase{

    public static void main(String[] args) {
        
        //Switch Case 

        //ekspresi berupa satuan (int,long,byte,short) atau Stsring atau enum

        String input;
        Scanner Userinput = new Scanner(System.in);
        input = Userinput.next();

        switch (input){
            case "belajar":
                System.out.println("Saya belajar");
                break;
            case "Malas":
                System.out.println("Saya tidak belajar");
                break;
            default:
                System.out.println("Tidak jelas");
        }

        System.out.println("akhir dari program");
    }
}