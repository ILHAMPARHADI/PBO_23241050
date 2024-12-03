package com.tutorial;
import com.terminal.Console;

// visibiliti  default hanya bisa diakses oleh package yang sama 
class Player {
    //variabel objek
    private String nama ;

    //konstruktor
    Player(String nama){
        this.nama = nama;

    }

    //method nama 
    void cetak(){
        System.out.println("nama : " + this.nama);
        Console.log("Mengunakan Console");
        Console.log("Nama : " + this.nama );
    }

    //method getter
    String getName(){
        return this.nama;
    }
    
}
