package com.belanja;

public class PelangganMember extends Pelanggan {
    public PelangganMember(String nama) {
        super(nama);
    }

    @Override
    public double hitungDiskon() {
        double totalBelanja = getTotalBelanja();
        if (totalBelanja > 500000) {
            return 0.1; // 10% diskon
        } else if (totalBelanja >= 100000) {
            return 0.05; // 5% diskon
        } else {
            return 0.03; // 3% diskon
        }
    }
}