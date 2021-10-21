import java.util.Scanner;

class Ukuran{

    private double phi = 3.14;
    public double jari;

    Ukuran(double jari){
        this.jari = jari;
    }

    void display(){
        
    }
}

class Luas extends Ukuran{

    Luas(double jari){
        super(jari);
    }

    void display(){
        System.out.println("Hasil Luas Lingkaran : " + jari);
    }

}

class Keliling extends Ukuran{

    Keliling(double jari){
        super(jari);
    }
}

public class lingkaran{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("\nInput Jari :  ");
        double jari = input.nextDouble();
        Ukuran masukan1 = new Ukuran(jari);

        Luas masukan2 = new Luas();
        masukan2.display();
    }
}