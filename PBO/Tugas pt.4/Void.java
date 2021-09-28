public class Void{

    public static void main(String[] args) {
        
        System.out.println(simpel());
        fungsiVoid("apapun");
        SelamatPagi("emak");
        SelamatPagi("Abah");
    }


    private static void SelamatPagi(String nama){

        System.out.println("Selamat Pagi " + nama);
    }

    private static void fungsiVoid(String input){

        System.out.println(input);
    }

    private static float simpel(){
        return 10.5f;
    }
} 