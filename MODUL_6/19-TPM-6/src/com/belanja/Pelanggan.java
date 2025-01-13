package com.belanja;

import java.util.ArrayList;
import java.util.List;

public abstract class Pelanggan {
    private String nama;
    private List<Barang> daftarBarang = new ArrayList<>();

    public Pelanggan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public double getTotalBelanja() {
        double total = 0;
        for (Barang barang : daftarBarang) {
            total += barang.getTotalHarga();
        }
        return total;
    }

    public abstract double hitungDiskon();

    public double getTotalSetelahDiskon() {
        return getTotalBelanja() - (getTotalBelanja() * hitungDiskon());
    }

    public void tampilkanInfo() {
        double totalBelanja = getTotalBelanja();
        double diskon = hitungDiskon();
        double diskonRupiah = totalBelanja * diskon;
        double totalSetelahDiskon = getTotalSetelahDiskon();

        System.out.println("Nama Pelanggan: " + getNama());
        System.out.println("Status Member: " + this.getClass().getSimpleName()); // Menampilkan tipe pelanggan
        System.out.println("Total Belanja Sebelum Potongan: " + totalBelanja);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Diskon (Rupiah): " + diskonRupiah);
        System.out.println("Total Belanja Setelah Potongan: " + totalSetelahDiskon);
        System.out.println("----------------------------------------------------");
    }
}