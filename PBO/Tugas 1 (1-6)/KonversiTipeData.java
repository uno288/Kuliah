public class KonversiTipeData{

    public static void main(String[] args) {

        //Value
        System.out.println("byte : "+Byte.MAX_VALUE);
        System.out.println("int : "+Integer.MAX_VALUE);
        System.out.println("Long : "+Long.MAX_VALUE);

        //Program konversi data
        int nilaiInt = 450; //32-bit
        System.out.println("nilai int = " + nilaiInt);

        //Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt; 
        System.out.println("nilai int = " + nilaiLong);
        System.out.println(Byte.MAX_VALUE);

        //Memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt; 
        System.out.println("nilai int = " + nilaiByte);

        //Casting Pembagian
        int a = 10;
        float b = 4, c = a/b;

        System.out.printf("%d / %f = %f\n",a,b,c);

        int x = 10;
        int y = 4;
        
        float z = (float) x/y;
        System.out.printf("%d / %d = %f\n",a,b,c);
    }    
}    