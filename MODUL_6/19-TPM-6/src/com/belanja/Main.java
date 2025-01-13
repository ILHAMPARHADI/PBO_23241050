package com.belanja;

public class Main {
    public static void main(String[] args) {
        PelangganMember member1 = new PelangganMember("Bella");
        member1.tambahBarang(new Barang("Barang A", 100000, 6)); // Total 600000

        PelangganMember member2 = new PelangganMember("Ani");
        member2.tambahBarang(new Barang("Barang B", 50000, 2)); // Total 100000

        PelangganNonMember nonMember1 = new PelangganNonMember("Cici");
        nonMember1.tambahBarang(new Barang("Barang C", 150000, 1)); // Total 150000

        PelangganNonMember nonMember2 = new PelangganNonMember("sendy");
        nonMember2.tambahBarang(new Barang("Barang D", 50000, 1)); // Total 50000

        member1.tampilkanInfo();
        member2.tampilkanInfo();
        nonMember1.tampilkanInfo();
        nonMember2.tampilkanInfo();
    }
}