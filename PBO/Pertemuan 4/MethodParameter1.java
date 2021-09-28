public class MethodParameter1{

    static void methodKu(String namaDepan, String namaBelakang){       //nama adalah parameter
       
        String nama = namaDepan + " " + namaBelakang;
        System.out.println("Selamat datang " +nama);
    }
     
    public static void main(String[] args) {

        methodKu("Uno", "keren");    //pemanggilan argument
    }
}