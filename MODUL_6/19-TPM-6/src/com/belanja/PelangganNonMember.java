package com.belanja;

public class PelangganNonMember extends Pelanggan {
    public PelangganNonMember(String nama) {
        super(nama);
    }

    @Override
    public double hitungDiskon() {
        return getTotalBelanja() > 100000 ? 0.03 : 0; // 3% diskon jika > 100000
    }
}