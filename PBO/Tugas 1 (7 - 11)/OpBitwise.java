public class OpBitwise{

    public static void main(String[] args) {
        
        //operator bitwise --> operasi untuk melakukan operasi pada nilai bit

        byte a = 2;
        byte b,c;
        String a_bits,b_bits,c_bits;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);

        //operator SHIFT Left  
        b = (byte)(a << 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);

        //operator SHIFT RIGHT
        a = 3;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = (byte)(a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", b_bits,b);

        //operator bitwise OR
        a = 9;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 5;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.printf("------------------\n");
        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", c_bits,c);
        
        //operator bitwise AND (&)
        a = 23;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 20;        
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        c = (byte)(a & b);
        System.out.printf("------------------\n");
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", c_bits,c);

        //operator bitwise XOR (^)
        a = 23;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 20;        
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        c = (byte)(a ^ b);
        System.out.printf("------------------\n");
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n\n", c_bits,c);
    }
}