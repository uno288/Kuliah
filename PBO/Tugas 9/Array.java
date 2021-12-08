import java.util.Scanner;

public class Array {

    int[] nilai = new int[10];
    Scanner input = new Scanner(System.in);

    public void array(){

        for(int i = 0; i < 10; i++){
            System.out.print("Masukan Nilai ke-" + (i + 1) + ":  ");
            nilai[i] = input.nextInt();
        }
    }

    public int[] getNilai(){
        return nilai;
    }
}
