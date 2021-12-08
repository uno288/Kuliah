import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception3 {

    public int InputBilangan(int i){

        int bil;
        while(true){
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Masukan bilangan Bulat ke -" + i + " :");
                bil = input.nextInt();

                // Cara 1
                /*
                if (bil != 0){
                    break;
                }else{
                    System.out.println("Bilangan tidak boleh nol");
                }
                */

                // Cara 2
                if (bil == 0){
                    throw new ArithmeticException("Bilangan tidak boleh nol");
                }
                break;
            }catch(InputMismatchException e){
                System.out.println("Input data harus berupa bilangan bulat");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        return bil;
    }

    public static void main(String[] args) {

        Exception3 obj = new Exception3();

        int bil1 = obj.InputBilangan(1);
        int bil2 = obj.InputBilangan(2);
        int hasil = bil1/bil2;
        System.out.println("hasil = " + hasil);
    }
}
