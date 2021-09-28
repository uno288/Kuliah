import java.util.Scanner;

public class DeretFibonaci{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0, b = 1, c = 1, d;
        System.out.print("Deret ke : ");
        d = input.nextInt();
        System.out.print(a + " ");

        for(int f = 1; f <= d; f++){
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}