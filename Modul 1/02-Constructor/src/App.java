// class Polos atau tanpa construktor
class Polos{
    // atribut objek 
    String dataString;
    int dataInteger;
}
 // class dengan construktor
 class mahasiswa{
    // atribut 
    String Nama;
    String Nim;
    String Prodi;

    //constructor
    // nama sama dengan nama class
    // tidak memiliki return velue/nilai balik
    // method yang pertama kali yang dipangill saat objek pertama kali dipanggil
    mahasiswa(String inputNama, String inputNim, String inputProdi){
        // mengisi data
    Nama = inputNama;
    Nim = inputNim;
    Prodi = inputProdi;

    // mencetak data 
    System.out.println("Nama Mahasiswa : " + Nama);
    System.out.println("Nim : " + Nim);
    System.out.println("Prodi : " + Prodi);

    }
 }


public class App {
    public static void main(String[] args) throws Exception {
        // pembuatan objek atau instasiasi objek 
        Polos polos_1 = new Polos();

        // isi atribut 
        polos_1.dataString = "Polos";
        polos_1.dataInteger = 10;

        // cetak objek 
        System.out.println(polos_1.dataString);
        System.out.println(polos_1.dataInteger);

        // pembuatan objek mahasiswa
        mahasiswa mhs_1 = new mahasiswa("adins", "2324000", "PTI");

        // pembuatan objek mahasiswa
        mahasiswa mhs_2 = new mahasiswa("asep", "2324001", "PTI");
        mahasiswa mhs_3 = new mahasiswa("syahrial", "23567763", "PTI");
    }
 }
