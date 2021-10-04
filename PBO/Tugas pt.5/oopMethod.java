class mhs{
   
    // Data member
    String nama;
    String NIM;

    mhs(String inputNama, String inputNIM){
       
        // construction
        nama = inputNama;
        NIM = inputNIM;
        System.out.println(nama);
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){

        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama){

        this.nama = nama;
    }

    // method tanpa parameter tapi dengan return
    String getNama(){
        return this.nama = nama;
    }

    String getNIM(){
        return this.NIM = NIM;
    }

    String sayHi(String message){
        return message + "juga, nama saya adalah" + this.nama;
    }
}

public class oopMethod{

    public static void main(String[] args) {
        
        mhs mahasiswa3 = new mhs("ucup", "1234567");

        //method
        mahasiswa3.show();
        mahasiswa3.setNama("tutung");
        mahasiswa3.show();

        System.out.println(mahasiswa3.getNama());
        System.out.println(mahasiswa3.getN());

        String data = mahasiswa3.sayHi("ganteng");
        System.out.println(data)
    }
}
