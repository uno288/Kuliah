import java.util.Scanner;

public class TernaryOperator{

    public static void main(String[] args) {
        
        //ternary operator


        int input,x;

        Scanner Userinput = new Scanner(System.in);

        System.out.println("Masukan nilai: ");
        input = Userinput.nextInt();

        // variabel x = ekspresi? statement_true : statement_ false

        x = (input == 10 ) ? (input*input) : (input/2);

        System.out.println("Hasilnya adalah "+ x);
    }
}