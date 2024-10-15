// Kelas Kalkulator
class Kalkulator {
    // Variabel untuk menyimpan nilai
    double angka1, angka2;

    // Constructor untuk inisialisasi angka
    public Kalkulator(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    // Method untuk operasi penjumlahan
    public double tambah() {
        return angka1 + angka2;
    }

    // Method untuk operasi pengurangan
    public double kurang() {
        return angka1 - angka2;
    }

    // Method untuk operasi perkalian
    public double kali() {
        return angka1 * angka2;
    }

    // Method untuk operasi pembagian
    public double bagi() {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }
}

// Kelas utama untuk menjalankan program
public class App {
    public static void main(String[] args) {
        // Membuat objek kalkulator dengan angka-angka tertentu
        Kalkulator kalkulator = new Kalkulator(50, 2);

        // Melakukan operasi kalkulator
        System.out.println("Penjumlahan: " + kalkulator.tambah());
        System.out.println("Pengurangan: " + kalkulator.kurang());
        System.out.println("Perkalian: " + kalkulator.kali());
        System.out.println("Pembagian: " + kalkulator.bagi());
    }
}