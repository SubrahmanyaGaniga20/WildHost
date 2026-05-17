package com.wild_tour.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {

    public static Connection requestConnection() {

        Connection con = null;

        try {

            String url = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7827092?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

            String user = "sql7827092";

            String password = "yCNp96RBIT";

            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("TRYING DB CONNECTION");

            con = DriverManager.getConnection(url, user, password);

            System.out.println("DB CONNECTED SUCCESSFULLY");

        } catch (Exception e) {

            System.out.println("DB CONNECTION FAILED");

            e.printStackTrace();
        }

        return con;
    }
}