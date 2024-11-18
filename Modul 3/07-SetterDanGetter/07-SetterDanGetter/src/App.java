class Mahasiswa {
    // Data member private untuk encapsulation
    private String nama;
    private int umur;

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama
    public String getNama() {
        return this.nama;
    }

    // Setter untuk umur
    public void setUmur(int umur) {
        // Validasi sederhana
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur harus positif!");
        }
    }

    // Getter untuk umur
    public int getUmur() {
        return this.umur;
    }
}

public class App {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();

        // Menggunakan setter untuk mengatur nilai
        mhs1.setNama("Andi");
        mhs1.setUmur(20);

        // Menggunakan getter untuk mengambil nilai
        System.out.println("Nama Mahasiswa: " + mhs1.getNama());
        System.out.println("Umur Mahasiswa: " + mhs1.getUmur());

        // Contoh validasi umur
        System.out.println("Mengatur umur dengan nilai negatif:");
        mhs1.setUmur(-5); // Akan menampilkan pesan error
    }
}
