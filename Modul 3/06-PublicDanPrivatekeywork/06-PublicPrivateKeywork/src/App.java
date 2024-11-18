class Player {
    // Data member atau variabel instance
    String nama; // default, bisa diakses dari luar class
    public int exp; // public, bisa diakses dari luar class
    private int health; // private, hanya bisa diakses dari dalam class

    // Konstruktor, tanpa modifier access
    Player(String nama, int exp) {
        this.nama = nama;
        this.exp = exp;
        this.health = 100; // nilai default health
    }

    // Method cetak, default tanpa parameter dan return
    void cetak() {
        System.out.println("Player: " + this.nama);
        System.out.println("Exp: " + this.exp);
        System.out.println("Health: " + this.health);
    }

    // Method untuk mengubah nilai health
    public void ubahHealth(int health) {
        this.health = health;
    }

    // Method untuk mendapatkan nilai health
    public int getHealth() {
        return this.health;
    }

    // Method untuk mengurangi nilai health
    public void kurangiHealth(int nilai) {
        this.health -= nilai;
        if (this.health < 0) {
            this.health = 0; // memastikan health tidak negatif
        }
    }
}

public class App {
    public static void main(String[] args) {
        // Membuat objek Player
        Player player1 = new Player("John", 10);
        
        // Memanggil method cetak untuk menampilkan informasi player
        player1.cetak();
        
        // Mengubah nilai health
        player1.ubahHealth(80);
        System.out.println("Updated Health: " + player1.getHealth());
        
        // Mengurangi nilai health
        player1.kurangiHealth(30);
        System.out.println("Health after reduction: " + player1.getHealth());
        
        // Mengurangi nilai health hingga nol
        player1.kurangiHealth(100);
        System.out.println("Health after excessive reduction: " + player1.getHealth());
    }
}

