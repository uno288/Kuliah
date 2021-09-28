public class overloadMethod{

    public static void main(String[] args) {
        
        int hasilInteger;
        hasilInteger = tambah(4,5);
        printAngka(hasilInteger);

        float hasilFloat;
        hasilFloat = tambah(4.5f, 4);
        printAngka(hasilFloat);
        
        //printAngka(10);
        //printAngka(10.6f);
    }

    private static int tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2;
    }
    
    private static float tambah(float angkaInt1, float angkaInt2){
        return angkaInt1 + angkaInt2;
    }

    private static void printAngka(float angkaFloat){

        System.out.println(" angka ini adalah Float dengan nilai " +angkaFloat);
    }

    private static void printAngka(int angkaInteger){

        System.out.println(" angka ini adalah integer dengan nilai " +angkaInteger);
    }
}