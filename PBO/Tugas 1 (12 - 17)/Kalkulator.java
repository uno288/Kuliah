import java.util.Scanner;

public class Kalkulator{

    public static void main(String[] args) {
        
        //operator a dan b 
        Scanner InputUser;
        float a,b, hasil;
        char operator;

        InputUser = new Scanner(System.in);

        System.out.println("nilai a = ");
        a = InputUser.nextFloat();
        System.out.println("operator = ");
        operator = InputUser.next().charAt(0);
        System.out.println("Nilai b = ");
        b = InputUser.nextFloat();

        System.out.println("Input User " + a + " " + operator + " " + b);

        // operator tersedia * / + -

        if (operator == '+'){

            hasil = a + b;
            System.out.print("hasil = " + hasil);

        }else if (operator == '-'){

            hasil = a - b;
            System.out.print("hasil = " + hasil);

        }else if (operator == '*'){

            hasil = a * b;
            System.out.print("hasil = " + hasil);
        
        }else if (operator == '/'){
            if (b == 0){

                System.out.println("Nilai Tak hingga");
                
            }else{
                
                hasil = a / b;
                System.out.print("hasil = " + hasil);
            }
        }else{ 

            System.out.println("Operator tidak diemukan");
        }    
    }
}