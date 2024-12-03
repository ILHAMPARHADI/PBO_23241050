package com.tutorial;

import com.terminal.Console;
import static com.terminal.Console.log;

class Main {
    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("kona");
        player1.cetak();

        Console.log("Menampilkan data dari console");
        Console.log("Player Name : " + player1.getName());

        log("Mengunakan stattic method");
        log("Player Name : " + player1.getName());
    }

}
