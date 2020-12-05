
package com.netit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseManager {

    private static DatabaseManager instance;

    public static DatabaseManager getInstance() {
        if(instance == null) instance = new DatabaseManager();
        return instance;
    }

    private Connection conn;

    private DatabaseManager() {
        setupDbConnection();
    }

    private void setupDbConnection() {
        try {
            String url = "jdbc:postgresql://localhost/library";
            Properties props = setLoginForDB();
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, props);
        } catch (Exception e) {
            System.out.print("Opa");
            e.printStackTrace();
        }
    }

    private Properties setLoginForDB() {
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "admin");
        props.setProperty("ssl", "false");
        return props;
    }

    public void createTable(String tableName, String...columnNames) {
        try {
            Statement stmt = conn.createStatement();
            StringBuilder sql = new StringBuilder();
            sql.append("CREATE TABLE " + tableName + " (");
            sql.append("id SERIAL PRIMARY KEY NOT NULL,");
            for(String colName : columnNames) {
                sql.append(colName);
                sql.append(" TEXT NOT NULL,");
            }
            sql.append(")");
            stmt.executeUpdate(sql.toString());
            stmt.close();
        } catch (Exception e) {
        }
    }


    public void insert(String tableName, String...args) {
        try {
            Statement stmt = conn.createStatement();
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO ");
            sql.append(tableName);
            sql.append(" (");
            for (int i = 0; i < args.length; i = i+2) {
                sql.append(args[i] + ", ");
            }
            sql.append(") VALUES(");
            for (int i = 1; i < args.length; i = i+2) {
                sql.append("'" + args[i] + "', ");
            }
            sql.append(")");
            stmt.executeUpdate(sql.toString());
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}