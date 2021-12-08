class BangunDatar{
    protected double s1;
    protected double s2;

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }
}

class Lingkaran extends BangunDatar{
    public double getLuas(){
        double luas = 3.14 * this.s1 * this.s1;
        return luas;
    }
    public double getKeliling(){
        double keliling = 3.14 * this.s1 * 2;
        return keliling;
    }
}

public class LingkaranInheritance {

    public static void main(String[] args){
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setS1(5);
        double luasLingkaran = lingkaran.getLuas();
        double kelilingLingkaran = lingkaran.getKeliling();
        System.out.println("Luas : " + luasLingkaran);
        System.out.println("Keliling : " + kelilingLingkaran);
    }
}
