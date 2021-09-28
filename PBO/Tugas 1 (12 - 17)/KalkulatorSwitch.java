import java.util.Scanner;

public class KalkulatorSwitch{


    public static void main(String[] args) {
        

        Scanner Input;
        float a,b,hasil;
        String operator;

        Input = new Scanner(System.in);

        System.out.println("nilai a = ");
        a = Input.nextFloat();
        System.out.println("operator = ");
        operator = Input.next();
        System.out.println("Nilai b = ");
        b = Input.nextFloat();

        switch (operator) {
            case "+":
                
                hasil = a + b;
                System.out.println("Hasil "+ hasil);
                break;

            case "-":
                
                hasil = a - b;
                System.out.println("Hasil "+ hasil);
                break;

            case "*":
                
                hasil = a * b;
                System.out.println("Hasil "+ hasil);
                break;

            case "/":
                
                hasil = a / b;
                System.out.println("Hasil "+ hasil);
                break;
                
            default:
                System.out.print("Selesai");
                break;
        }
    }
}