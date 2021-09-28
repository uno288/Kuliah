import java.util.Scanner;
import java.lang.String;

public class rekursifBercabang{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai : " );
        int n = input.nextInt();

        int nilaiFibonacci = fibonacci(n, "atas");
        System.out.println("nilai Fibonacci : " +nilaiFibonacci);
    }

    private static int fibonacci (int nilai, String daun){
        //System.out.println("daun " +daun);
        //System.out.println("Fibonacci ke - " +nilai);
        if (nilai == 1 || nilai == 0){
            return nilai;
        }
        return fibonacci(nilai -1, "kiri") + fibonacci(nilai -2, "kanan");
    }
}