package com.belanja;

public class Barang {
    private String nama;
    private double harga;
    private int kuantitas;

    public Barang(String nama, double harga, int kuantitas) {
        this.nama = nama;
        this.harga = harga;
        this.kuantitas = kuantitas;
    }

    public double getTotalHarga() {
        return harga * kuantitas;
    }
}