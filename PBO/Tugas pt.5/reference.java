
class Buku{ 

    String judul;
    String penulis; 

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\njudul : " + this.judul);
        System.out.println("Penulis  : " + this.penulis);
    }
}


public class reference{

    public static void main(String[] args) {
        Buku buku1 = new Buku("Killing Comandantore", "Harukami Murakami");
        buku1.display();

        // menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        //assignment object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        //karena buku1 berada pada address atau referensi yang sama
        buku2.judul = "Membunuh komandantur";
        buku1.display();
        buku2.display();

        //kita akan memasukan object keadalam methods
        fungsi(buku2);
       
    }

    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi " + addressDataBuku);
    }
}

