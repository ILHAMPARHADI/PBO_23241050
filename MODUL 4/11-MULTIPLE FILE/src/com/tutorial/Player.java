package com.tutorial;

class Player {
     //variabel
     private String nama;

     //konstruktor
     Player(String nama){
         this.nama = nama;
     }
 
     //method cetak
     void cetak(){
         System.out.println("Nama : " + this.nama);
     }
}
