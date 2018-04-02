package net.reverux.reveruxai.main;

import net.reverux.reveruxai.core.storage.MySQLConnection;

public class Main {

    private static MySQLConnection mySQLConnection;


    public static void main(String[] args) {
         mySQLConnection = new MySQLConnection("HOST", 3306, "USERNAME", "DATABASE", "PASSWORD");
    }

}
