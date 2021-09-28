public class NestedIF{

    public static void main(String[] args) {
        
        //nested if atau if bersarang

        int a = 5;
        int b = 2;

        if (a == 5){
            if (b == 2){

                System.out.println("Ini adalah dimana a = 5 dan b = 2");

            }else if (b == 4){

                System.out.println("Ini adalah dimana a = 5 dan b = 4");

            }else{

                System.out.println("Ini adalah dimana a = 5 dan b bukan 2 atau 4");
            }
        }else {

            System.out.println("Ini adalah dimana a dan b tidak sesuai");
        }
        System.out.println("Ini adalah akhir dari program");
    }
}