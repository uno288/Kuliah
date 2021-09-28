import java.util.Scanner;

public class MethodRerata{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double angka, total = 0;
        double rata = 0;
        char jawaban;

        do{

            System.out.println("Masukan bilangan : ");
            angka = input.nextDouble();
            total = angka + total;
            
            System.out.println("Ingin memasukan bilangan lagi? [y/t]");
            jawaban = input.next().charAt(0);     
        }
        while (jawaban == 'y');
        
        rata = total / 2;
        System.out.println("Total : " +total);
        System.out.println("Rata - rata: " +rata);
    }
}