public class OpKomparasi{

    public static void main(String[] args) {
    
        //operator komparasi (boolean)
        int a,b;
        boolean hasilkomparasi;
        
        //operator equal atau persamaan
        a = 11;
        b = 10;
        hasilkomparasi = (a == b);
        System.out.printf("%d apakah sama dengan %d? %s \n", a,b,hasilkomparasi);

        a = 11;
        b = 11;
        hasilkomparasi = (a == b);
        System.out.printf("%d apakah sama dengan %d? %s \n", a,b,hasilkomparasi);

        //operator not equal atau pertidaksamaan
        a = 11;
        b = 11;
        hasilkomparasi = (a != b);
        System.out.printf("%d apakah tidaksama dengan %d? %s \n", a,b,hasilkomparasi);

        //operator not equal atau pertidaksamaan
         a = 10;
         b = 11;
         hasilkomparasi = (a != b);
         System.out.printf("%d apakah tidaksama dengan %d? %s \n", a,b,hasilkomparasi);

        //operator kurang dari atau less than
        a = 10;
        b = 11;
        hasilkomparasi = (a < b);
        System.out.printf("%d apakah kurang dari dengan %d? %s \n", a,b,hasilkomparasi);

        //operator lebih dari atau greater than
         a = 10;
         b = 11;
         hasilkomparasi = (a > b);
         System.out.printf("%d apakah lebih besar dengan %d? %s \n", a,b,hasilkomparasi);

        //operator kurang dari sama dengan atau less than equal
        a = 10;
        b = 11;
        hasilkomparasi = (a <= b);
        System.out.printf("%d apakah kurang dari sama dengan %d? %s \n", a,b,hasilkomparasi);

        //operator lebih besar dari sama dengan atau greater than equal
        a = 18;
        b = 11;
        hasilkomparasi = (a >= b);
        System.out.printf("%d apakah lebih besar dari sama dengan %d? %s \n", a,b,hasilkomparasi);


    }
}