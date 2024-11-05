class Kalkulator {
    // Atribut untuk menyimpan dua angka
    private double angka1;
    private double angka2;

    // Setter untuk mengatur nilai
    public void setAngka1(double angka) {
        this.angka1 = angka;
    }
    public void setAngka2(double angka) {
        this.angka2 = angka;
    }
    // Metode untuk operasi kalkulasi
    public double tambah() {
        return angka1 + angka2;
    }
    public double kurang() {
        return angka1 - angka2;
    }
    public double kali() {
        return angka1 * angka2;
    }
    public double bagi() {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            throw new IllegalArgumentException("Pembagi tidak boleh nol.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Kalkulator tanpa konstruktor
        Kalkulator kalkulator = new Kalkulator();
        
        // Mengatur nilai
        kalkulator.setAngka1(19);
        kalkulator.setAngka2(5);
        
        // Melakukan operasi
        System.out.println("Tambah: " + kalkulator.tambah());
        System.out.println("Kurang: " + kalkulator.kurang());
        System.out.println("Kali: " + kalkulator.kali());
        System.out.println("Bagi: " + kalkulator.bagi());
    }
}