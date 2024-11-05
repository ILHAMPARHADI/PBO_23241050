//membuat class sebagai template
class Mahasiswa{
    // membuat ciri-ciri atau atribut objek 
    String nama;
    String nim;
    String prodi;
    double IPK;
    int umur;

}




public class App {
    public static void main(String[] args) throws Exception {
       
        // instansiasi atau membuat objek 
        Mahasiswa mhs_1 = new Mahasiswa();
        // instansiasi atau membuat objek 
        Mahasiswa mhs_2 = new Mahasiswa();


        // pengisian data objek 
        mhs_1. nama = "asep";
        mhs_1. nim = "12345678";
        mhs_1. prodi = "PTI";
        mhs_1. IPK = 5.0;
        mhs_1. umur = 21;
        
        mhs_2. nama = "yalil yalil";
        mhs_2. nim = "12345678";
        mhs_2. prodi = "PTI";
        mhs_2. IPK = 3.0;
        mhs_2. umur = 21;
        
        // cetak data 
        System.out.println("nama Mahasiswa : " + mhs_1.nama);
        System.out.println("nim : " + mhs_1.nim);
        System.out.println("prodi : " + mhs_1.prodi);
        System.out.println("IPK : " + mhs_1.IPK);
        System.out.println("umur : " + mhs_1.umur);
        
        // cetak data 
        System.out.println("nama Mahasiswa : " + mhs_2.nama);
        System.out.println("nim : " + mhs_2.nim);
        System.out.println("prodi : " + mhs_2.prodi);
        System.out.println("IPK : " + mhs_2.IPK);
        System.out.println("umur : " + mhs_2.umur);
    }
}
