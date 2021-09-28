import java.util.Scanner;

public class OpLogika{

    public static void main(String[] args) {
        

        //membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner (System.in);

        //sebuah program sederhana untuk menangkap input dari user
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukan nilai tebakan anda :");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah " + nilaiTebakan);

        //operasi logika 
        statusTebakan = (nilaiBenar == nilaiTebakan);
        System.out.println("Tebakan anda " + statusTebakan);

        //operasi aljabar boolean (and/or)
        System.out.print("masukan nilai diantara 4 dan 9: ");
        nilaiTebakan = inputUser.nextInt();

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);

        System.out.println("tebakan anda :" +statusTebakan);

    }
}
