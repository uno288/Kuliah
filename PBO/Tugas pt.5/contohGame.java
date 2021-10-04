
// player
class Player{

    String nama;
    double darah;
    int level; 
    
    // objek member 
    Senjata weapon;
    Pelindung armor;

    Player(String nama, double darah){
        this.nama = nama;
        this.darah = darah;
    }

    void equipWeapon(Senjata weapon){
        this.weapon = weapon;
    }

    void equipArmor(Pelindung armor){
        this.armor = armor;
    }

    void attack(Player opponent){
        double kekuatan = this.weapon.kekuatan;
        System.out.println(this.nama + " attacking " + opponent.nama + " with power " + kekuatan);
        opponent.defence(kekuatan);
    }

    void defence(double kekuatan){
        // akan mengambil damage
        double damage;
        if (this.armor.bertahan < kekuatan){
            damage = kekuatan - this.armor.bertahan;
        }else {
            damage = 0;
        }

        this.darah -= damage;
        System.out.println(this.nama + " gets damage " + kekuatan);
    }

    void display(){

        System.out.println("\nNama : " + this.nama);
        System.out.println("Darah : " + this.darah + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// senjata
class Senjata{

    String nama;
    double kekuatan;

    Senjata(String nama, double kekuatan){
        this.nama = nama;
        this.kekuatan = kekuatan;
    }

    void display(){
        System.out.println("Weapon : " + this.nama + ", power : " + this.kekuatan);
    }
}

// armor
class Pelindung{

    double bertahan;
    String nama;

    Pelindung(String nama, double bertahan){
        this.nama = nama;
        this.bertahan = bertahan;
    }

    void display(){
        System.out.println("Pelindung : " + this.nama + ", defence : " + this.bertahan);
    }
}

public class contohgame{

    public static void main(String[] args) {
        
        //membuat objek player
        Player player1 = new Player("ucup", 100);
        Player player2 = new Player("otong", 90);

        //membuat objek senjata
        Senjata pedang = new Senjata("pedang", 15);
        Senjata ketapel = new Senjata("ketapel", 1);
        
        //membuat objek armor
        Pelindung bajuBesi = new Pelindung("Baju Besi", 40);
        Pelindung bajuKayu = new Pelindung("Baju Kayu", 10);

        //equip senjata dan armor player1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();
       
        //equip senjata dan armor player1
        player2.equipWeapon(ketapel);
        player2.equipArmor(bajuKayu);
        player2.display();

        System.out.println("\n\nPertempuran");
        System.out.println("\nepisode - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        
        
        System.out.println("\nepisode - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}