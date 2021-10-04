class Polos{

    String dataString;
    int dataInteger;
}

class Mahasiswa{

    String nama;
    String NIM;
    String jurusan;
    Double IPK;
    int umur; 

    /*Mahasiswa(){
        System.out.println("ini adalah constructor");
        
    }*/

    Mahasiswa(String inputnama, String inputNIM, String inputJurusan){

        nama = inputnama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class construction{

    public static void main(String[] args) {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "12345", "Teknik 1");
        Mahasiswa mahasiswa2 = new Mahasiswa("otong", "`123456", "teknik 2");
        
        /*Polos objekPolos = new Polos();
        objekPolos.dataString = "polos";
        objekPolos.dataInteger = 0;

        System.out.println(objekPolos.dataString);
        System.out.println(objekPolos.dataInteger);*/

    }
}