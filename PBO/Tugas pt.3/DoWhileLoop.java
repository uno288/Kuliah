import java.util.Scanner;

public class DoWhileLoop{

    public static void main(String[] args) {
        
        /*do{
            aksi
        }while (kondisi)
        */

        System.out.print("Awal Program");

        int a = 5;
        boolean kondisi = true;

        do{
            a++;
            System.out.println("do while ke-" +a);
            
            if (a == 10){
                kondisi = false;
            }
        }while(kondisi);

        System.out.println("Ini adalah akhir dari program");
    }
}