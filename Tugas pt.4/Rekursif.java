import java.util.Scanner;

public class Rekursif{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("test");
        System.out.println("Masukan Nilai : ");
        int nilai = input.nextInt();
        System.out.println("Anda memasukan nilai = " +nilai);

        printNilai(nilai);
        
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah : " +jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("Faktorial : " +faktorial);
    }

    private static void printNilai(int parameter){

        System.out.println("nilai = " +parameter); 

        if (parameter == 0){
            return;
        }

        parameter--;
        printNilai(parameter);
    }

    private static int jumlahNilai(int parameter){

        System.out.println("parameter = " +parameter); 
        
        if (parameter == 0){
            return parameter;
        }
        return parameter + jumlahNilai(parameter - 1);
    }

    private static int hitungFaktorial(int parameter){

        System.out.println("parameter = " +parameter); 
        
        if (parameter == 1){
            return parameter;
        }
        return parameter * hitungFaktorial(parameter - 1);
    }
}