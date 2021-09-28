import java.util.Scanner;

public class InputAritmatika{

    public static void main(String[] args) {
        
        //operasi akan dilakukan dari kiri ke kanan
        //perkalian dan pembagian dilakukan dahulu
        //Dalam kurung akan dilakukan terlebih dahulu sebelum perkalian dan pembagian

        int hasil = 5 * 10 / 2;
        System.out.println(hasil);

        Scanner useriput = new Scanner(System.in);
        //perthitungan persamaan kuadrat
        System.out.println("Menghitung persamaan Kuadrat");
        int m,x,c;

        System.out.println("Nilai x = ");
        x = useriput.nextInt();
        System.out.println("Nilai m = ");
        m = useriput.nextInt();
        System.out.println("Nilai c = ");
        c = useriput.nextInt();
        int y = (m*x*x) + c;

        System.out.println("Nilai y = " +y);
    }
}