import java.util.Scanner;

public class LatihanSederhana{

    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        int nilaiAwal, nilaiAkhir, total = 0;
        
        System.out.print("Masukan Nilai awal : ");
        nilaiAwal = Input.nextInt();
        System.out.print("Masukan Nilai akhir : ");
        nilaiAkhir = Input.nextInt();

        /*if (nilaiAwal < nilaiAkhir){
            for (int a = nilaiAwal; a <= nilaiAkhir; a++){

                if (a == nilaiAwal){
                    System.out.print(nilaiAwal);
                }else{
                    System.out.print(" + " +a);
                }  
                total = total + a;
            }
        }*/
        

        /*while(nilaiAwal <= nilaiAkhir){

            if (nilaiAwal == nilaiAkhir){
                System.out.print(nilaiAkhir);
            }else{
                System.out.print(nilaiAwal + " + ");
            }        
            total = nilaiAwal + total;
            nilaiAwal ++;
        }*/

        do{
            
            if (nilaiAwal == nilaiAkhir){
                System.out.print(nilaiAkhir);
            }else{
                System.out.print(nilaiAwal + " + ");
            } 
            total = nilaiAwal + total;
            nilaiAwal ++;

        }while(nilaiAwal <= nilaiAkhir);

        System.out.print(" = " +total);
    }
}