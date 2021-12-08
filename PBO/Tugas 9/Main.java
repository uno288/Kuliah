import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Array nilai = new Array();
        nilai.array();

        int[] listArray = nilai.getNilai();
        
        System.out.println("\nApakah ingin mencari data? [y/t]");
        char jawaban = input.next().charAt(0);

        if(jawaban == 'y'){       
            System.out.println("\nMasukan Angka yang ingin dicari : ");
            int angka = input.nextInt();

            Search cariNilai = new Search(listArray, angka);
            cariNilai.mencari();

            if(cariNilai.mencari() == false){
                System.out.println("\nAngka yang dicari tidak ada ");
            }
        }
    }
}
