package com.francisco.connection;

import com.francisco.repositories.AdminScreen;
import java.nio.file.Path;
import java.sql.Connection;


public class Main {

    public static void main(String[] args) {
        
        String urlH2 = "jdbc:h2:"+Path.of("instituto").toAbsolutePath().toString();
        String username = "root";
        String password = "1234";
        
        System.out.println("Iniciando conexion con el servidor");
        Connection newConnection = H2Connection.newInstance(urlH2, username, password);
        
        AdminScreen newAdminScreen = new AdminScreen(newConnection);
        newAdminScreen.setVisible(true);
        
    }
}
