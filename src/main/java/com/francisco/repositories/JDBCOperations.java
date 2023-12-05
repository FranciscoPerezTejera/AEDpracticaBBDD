package com.francisco.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCOperations {

    private JDBCOperations() {
    }

    private static Statement createSentence(Connection connection) {
        try {
            return connection.createStatement();
        } catch (SQLException ex) {
            System.err.println("No se ha podido crear la sentencia");
            System.err.println(ex.getMessage());
            System.exit(-1);
        }
        return null;
    }

    public static void createTable(Connection con, String query) throws SQLException {

        Statement newStatement = createSentence(con);
        newStatement.execute(query);
        newStatement.close();
    }

    public static void dropTable(Connection con, String query) throws SQLException {

        Statement newStatement = createSentence(con);
        newStatement.execute(query);
        newStatement.close();

    }
    
    public static ResultSet query(Connection con, String query) throws SQLException {

        Statement newStatement = createSentence(con);
        ResultSet executeQuery = newStatement.executeQuery(query);
        newStatement.close();
        return executeQuery;
    }
}
