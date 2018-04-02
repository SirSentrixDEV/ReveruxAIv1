package net.reverux.reveruxai.core.storage;

public class MySQLConnection {

    private String host;
    private int port;
    private String username;
    private String database;
    private String password;

    public MySQLConnection(String host, int port, String username, String database, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.database = database;
        this.password = password;


    }
}
