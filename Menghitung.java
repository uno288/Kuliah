import java.util.Scanner;

public class Menghitung{

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("panjang :");
        int inputPanjang = input.nextInt();
        
        System.out.print("Lebar : ");
        int inputLebar = input.nextInt();
        System.out.println("\n");
        
        gambar(inputPanjang, inputLebar);
        System.out.println("Luas " + luas(inputPanjang, inputLebar));
        System.out.println("keliling = " + keliling(inputPanjang, inputLebar));

        kedua(inputPanjang, inputLebar);
        
    }

    private static void kedua(int panjang, int lebar){
        System.out.println("Luas " + luas(panjang, lebar));
        System.out.print("keliling = " + keliling(panjang, lebar)); 
    }

    private static int keliling(int panjang, int lebar){

        int hasil = (panjang + lebar)*2;
        return hasil;
    }

    private static int luas (int panjang, int lebar){

        int hasil = panjang * lebar;
        return hasil;
    }

    private static void gambar (int panjang, int lebar){

        for(int i =0; i < lebar; i ++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}