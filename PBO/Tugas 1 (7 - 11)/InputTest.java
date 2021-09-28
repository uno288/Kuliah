import java.util.Scanner;

public class InputTest{

    public static void main(String[] args) {
    
        Scanner InputUser = new Scanner(System.in);

        //int input = InputUser.nextInt();
        //System.out.println("Input = "+ input);

        //Membuat perhitungan luas persegi panjang
        System.out.print("Panjang : ");
        int panjang = InputUser.nextInt(); 
        System.out.print("lebar : ");
        int lebar = InputUser.nextInt();

        int luas = panjang*lebar;
        System.out.printf("Luas : %d", luas);


        //Membuat perhitungan Volume Kubik
        System.out.print("Panjang : ");
        int panjang = InputUser.nextInt(); 
        System.out.print("lebar : ");
        int lebar = InputUser.nextInt();
        System.out.print("tinggi : ");
        int tinggi = InputUser.nextInt();

        int volume = panjang*lebar*tinggi;
        System.out.printf("Luas : %d", volume);
    }
}