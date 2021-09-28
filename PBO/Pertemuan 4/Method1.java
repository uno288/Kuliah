public class Method1{
    
    // deklarasi method
    static void methodKu(){

        int i = 0;        
        System.out.println("Methodku di panggil");

        while (i <= 5){
            System.out.println("Nilai ke " +i);
            i++;
        }
    }

    public static void main(String[] args) {
        
        //pemanggilan method static
        methodKu();
    }
}