public class OperatorLogika{

    public static void main(String[] args) {
    
    //Operator Logika --> operasi yang bisa kita lakukan kepada tipe data boolean
    // AND, OR, XOR, negasi
    
    boolean a,b,c;
    //OR / atau (||)
    a = false;
    b = true;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);
    a = false;
    b = false;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);
    a = true;
    b = true;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);

    //AND / dan (&&)
    a = false;
    b = true;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);
    a = true;
    b = false;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);
    a = true;
    b = true;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);
    a = false;
    b = false;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);

    //XOR / exclusive or (^)
    a = false;
    b = true;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);
    a = true;
    b = false;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);
    a = true;
    b = true;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);
    a = false;
    b = false;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);

     //NOT / Negasi (!)
     a = false;
     c = !a;
     System.out.println(a + " ==> (!) "  + c);
     a = true;
     c = !a;
     System.out.println(a + " ==> (!) "  + c);
    
    }
}