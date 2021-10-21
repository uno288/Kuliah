import java.util.Scanner;


class Penjumlahan{

    int i, bilangan, total;

    Penjumlahan(int i, int bilangan){
        this.i = i;
        this.bilangan = bilangan;
    }

    // public void getPenjumlahan(){
    //     return this.i + this.bilangan;
    // }

    public void penjumlahan(){
        total = this.i + this.bilangan;
    }

    public void display(){
        System.out.print("\nPenjumlahan ke-" + i + " : " + total);
    }
}


public class inputBil{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.print("\nInput nilai :  ");
        int jumlah = input.nextInt();

        for(int i=1; i <= jumlah; i++){
            System.out.print("\nBIl :  " );
            int bilangan = input.nextInt();
            System.out.print("\n" + bilangan);
            Penjumlahan masukan = new Penjumlahan(i, bilangan);
            masukan.display();

        }
    }
}