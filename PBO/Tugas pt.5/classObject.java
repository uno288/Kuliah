class Mahasiswa{

    String nama;
    String NIM;
    String jurusan;
    Double IPK;
    int umur; 
}

public class classObject{

    public static void main(String[] args) {
        
        //Instansiasi / membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "ucup";
        mahasiswa1.NIM = "123456";
        mahasiswa1.jurusan = "Teknik";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 18;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "otong";
        mahasiswa2.NIM = "123456";
        mahasiswa2.jurusan = "Teknik";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 32;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
    
}