public class Aritmatika{

   public static void main(String[] args) {
       
    // Operasi Aritmatika

    int variable1 = 11, variable2 = 3, hasil;

    // 1. Penjumlahan 
    hasil = variable1 + variable2;
    System.out.println(variable1 + " + " + variable2 + " = " + hasil);

    //2. Pengurangan
    hasil = variable1 - variable2;
    System.out.printf("%d - %d = %d \n",variable1, variable2, hasil);

    //3. Perkalian 
    hasil = variable1 * variable2;
    System.out.printf("%d x %d = %d \n",variable1, variable2, hasil);

    //4. Pembagian
    hasil = variable1 / variable2;
    System.out.printf("%d / %d = %d \n",variable1, variable2, hasil);

    float a = 5,b = 6, hasilfloat = a/b;

    //5. Modulus 
    hasil = variable1 % variable2;
    System.out.printf("%d %% %d = %d \n",variable1, variable2, hasil);
   }
}