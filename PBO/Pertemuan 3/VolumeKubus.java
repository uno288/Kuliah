import java.util.Scanner;

public class VolumeKubus{

    static int rumus(int panjang){
        int volume;
        volume  = panjang * panjang * panjang;
        return volume;
    }

    public static void main(String[] args) {
        
        int panjang;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan panjang : ");
        panjang = input.nextInt();
        System.out.println("Volume : " +rumus(panjang));
    }
}