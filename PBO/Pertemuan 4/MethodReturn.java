public class MethodReturn {

    static double nilaiTugas (int x){

        double nilai = 0.2 * x;
        return nilai;
    }

    public static void main(String[] args) {
        
        //cara 1
        System.out.println("NIlai Tugas = " +nilaiTugas(80));

        //cara 2
        double nilai;
        nilai = nilaiTugas(80);
        System.out.println("NIlai Tugas = " +nilai);

        //cara 3
        if (nilaiTugas(80) > 10){

            System.out.println("Anda Lulus");
        }
    }
}