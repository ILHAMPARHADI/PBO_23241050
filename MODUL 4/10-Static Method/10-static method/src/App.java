import java.util.ArrayList;

class Player {
    // Variabel objek
    private String nama;

    // Variabel static
    private static int numberOfPlayer = 0;

    // ArrayList untuk menyimpan nama pemain
    private static ArrayList<String> namaList = new ArrayList<>();

    // Konstruktor
    Player(String nama) {
        this.nama = nama;
        Player.numberOfPlayer++;
        Player.namaList.add(this.nama);
    }

    // Method static untuk mencetak jumlah pemain
    static void showNumberOfPlayer() {
        System.out.println("Number of Players: " + Player.numberOfPlayer);
    }

    // Method untuk mencetak nama pemain
    void cetak() {
        System.out.println("Player name: " + this.nama);
    }

    // Method static untuk mendapatkan daftar nama pemain
    static ArrayList<String> getNameList() {
        return new ArrayList<>(Player.namaList); // Return salinan untuk menghindari modifikasi langsung
    }
}

public class App {
    public static void main(String[] args) {
        // Membuat beberapa objek Player
        Player player1 = new Player("Ilham");
        Player player2 = new Player("Arbiyan");
        Player player3 = new Player("Adin");
        Player player4 = new Player("Eril");
        Player player5 = new Player("Mesud");
        Player player6 = new Player("Azam");

        // Menampilkan jumlah pemain
        Player.showNumberOfPlayer();

        // Mencetak nama setiap pemain
        player1.cetak();
        player2.cetak();
        player3.cetak();
        player4.cetak();
        player5.cetak();
        player6.cetak();

         // Panggil array nama obejek
        System.out.println("List of Player Names: " + Player.getNameList());
    }
}
