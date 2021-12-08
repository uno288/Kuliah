abstract class Hewan{

    // Abstract Method (tidak memiliki body)
    public abstract void suara();

    // Regular Method 
    public void tidur(){

        System.out.println("ZZZZZ");
    }
}

class Ayam extends Hewan{

    public void suara(){

        System.out.println("Suara AYAM : kukuruyuk...");
    }
}

class abstrak1{

    public static void main(String[] args) {
        
        // Membuat Objek
        Ayam ayam = new Ayam();
        ayam.suara();
        ayam.tidur();
    }
}