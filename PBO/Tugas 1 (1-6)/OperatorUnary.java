public class OperatorUnary{

    public static void main(String[] args) {
        
        //unary = operasi yang dilakukan pada satu variabel

        //unary - dan +
        int angka = 1; 
        System.out.printf("Unary '-' %d menjadi %d\n", angka, -angka);
        System.out.printf("Unary '+' %d menjadi %d\n", angka, +angka);

        //unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.printf("nilai dengan '++' menjadi =\n",angka2);

        int angka3 = 30;
        angka3--;
        System.out.printf("nilai dengan '--' menjadi = \n",angka3);

        int a = 4;
        System.out.printf("nilai dengan '++' prefix menjadi = %d\n", ++a);
        int b = 4;
        System.out.printf("nilai dengan '++' postfix menjadi = %d\n", b++);
        System.out.printf("nilai dengan '++' prefix menjadi = %d\n", b);

        // unary boolean dengan ! negasi

        boolean ucup = true;
        System.out.println("nilai boolean = "+ ucup);
        System.out.println("nilai boolean = "+ !ucup);
    }
}