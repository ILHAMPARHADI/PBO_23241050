package com.tutorial;

//keyword untuk import package eksternal
import com.terminal.Console;

class Main {
    public static void main(String[] args) {
        //membuat objek

        Player player1 = new Player("kona");
        Player player2 = new Player("dhot");
        Player player3 = new Player("robi");
        player1.cetak();
        player2.cetak();
        player3.cetak();

        Console.log("Hello");

    }
    
}
