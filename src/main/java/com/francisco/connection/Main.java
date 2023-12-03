package com.francisco.connection;

import com.francisco.repositories.LoginScreen;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) {
        
        String urlH2 = "jdbc:h2:"+Path.of("myBBDD").toAbsolutePath().toString();
        String username = "root";
        String password = "1234";
        
        System.out.println("Iniciando conexion con el servidor");
        Connection newConnection = H2Connection.newInstance(urlH2, username, password);
        
        try {
            newConnection.close();
        } catch (SQLException ex) {
            System.err.println("No se ha podido cerrar la conexion con el servidor");
            System.err.println(ex.getMessage());
            System.exit(-1);
        }
        System.out.println("Finalizando conexion con el servidor");
        
        LoginScreen newLoginScreen = new LoginScreen();
        newLoginScreen.setVisible(true);
    }
}
