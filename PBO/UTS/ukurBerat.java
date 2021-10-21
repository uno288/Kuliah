import java.util.Scanner;

class BeratIdeal{

    public double berat, tinggi, ukur;

    BeratIdeal(double berat, double tinggi){
        this.berat = berat;
        this.tinggi = tinggi;
    }

    public double BMI(){       
        return this.berat/this.tinggi*this.tinggi;
    }

    public void tampilan(){
        System.out.println("\nBerat : " + this.berat);
        System.out.println("\nTinggi: " + this.tinggi);
        System.out.println("\nBMI : " + BMI());

        if(BMI()< 18.5){
            System.out.println("\nUnder Weight");
        }else if (BMI() > 22.9){
            System.out.println("\nOver Weight");
        }else{
            System.out.println("\nIdeal Weight");
        }
    }

}

public class ukurBerat{

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        System.out.print("\nBerat :  ");
        int berat = input.nextInt();
        System.out.print("\nTinggi :  ");
        int tinggi = input.nextInt();

        BeratIdeal pengguna = new BeratIdeal (berat, tinggi);

        pengguna.tampilan();
    }
}