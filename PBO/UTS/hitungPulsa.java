/*
Buatlah sebuah program dengan OOP menghitung biaya percakapan di Smartphone Anda. Inputan ke 
program adalah waktu awal dan waktu selesai percakapan (jam, menit, detik). Keluaranya adalah 
lama dan biaya percakapan. Satu pulsa = 5 detik dan ongkos per pulsa adalah Rp. 150.-. Untuk 
tampilan dan konsep programming bebas dan tidak boleh sama.
*/

import java.util.Scanner;

class Pulsa{

    private double pulsa = 150;
    public double bayar;
    public double waktuJam, waktuMenit, waktuDetik;
    public double totalWaktu;

    Pulsa(double waktuJam, double waktuMenit, double waktuDetik){
        
        this.waktuJam = waktuJam;
        this.waktuMenit = waktuMenit;
        this.waktuDetik = waktuDetik;
    }

    public double KonversiJam(){
        return this.waktuJam * 3600;
    }

    public double KonversiMenit(){
        return this.waktuMenit * 60;
    }

    public double Waktu(){
        return KonversiJam() + KonversiMenit() + this.waktuDetik;
    }

    public double Bayar(){
        return  Waktu() * this.pulsa;
    }

    public void display(){
        System.out.println("\nTotal Pemakaian : " + Waktu() + " Detik");
        System.out.println("\nTotal Pembayaran : " + Bayar() + " Ribu");
    }
}


public class hitungPulsa{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("\nBerapa total Pemakaian Pulsa ");
        System.out.print("\nJam :  ");
        double jam = input.nextDouble();
        System.out.print("\nmenit :  ");
        double menit = input.nextDouble();
        System.out.print("\ndetik :  ");
        double detik = input.nextDouble();

        Pulsa pemakaian = new Pulsa(jam, menit, detik);

        pemakaian.display();

    }
}