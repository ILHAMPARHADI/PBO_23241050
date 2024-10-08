//class polos atau tanpa contruktor 
class Polos{
    //Atribut objek
    String dataString;
    int dataInteger;

}


//class dengan construktor
class Mahasiswa{
    //atribut
    String nama;
    String NIM;
    String Prodi;

    //construktor
    //namanya harus sama dengan nama kelass
    //tidak memeiliki return value atau nilai balik
    //metod yang pertama kali didipanggil saat objek pertama kali dipanggil saat objek pertama kali di buat
    Mahasiswa(String inputNama, String inputNIM, String inputProdi){
        nama = inputNama;
        NIM = inputNIM;
        Prodi = inputProdi;

        System.out.println("nama mahasiswa : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Prodi : " + Prodi);


    }
}



public class App {
    public static void main(String[] args) throws Exception {
       //pembuatan objek atau intaranisasi objek
       Polos polos_1 = new Polos();

       //isi atribut
       polos_1.dataString = "polos";
       polos_1.dataInteger = 10;

       //cetak objek
       System.out.println(polos_1.dataString);
       System.out.println(polos_1.dataInteger);

       //pembuatan objek mahasiswa
       Mahasiswa mhs_1 = new Mahasiswa("ilham","1234567874","pti");
    }
}

