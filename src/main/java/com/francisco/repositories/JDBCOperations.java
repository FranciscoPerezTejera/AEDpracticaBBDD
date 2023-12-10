package com.francisco.repositories;

import com.francisco.entities.Alumno;
import com.francisco.entities.Direccion;
import com.francisco.entities.Familiar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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

    public static ArrayList<Alumno> query(Connection con, String query) throws SQLException {

        Statement newStatement = createSentence(con);
        ResultSet executeQuery = newStatement.executeQuery(query);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        while (executeQuery.next()) {

            Alumno nuevoAlumno = new Alumno(
                    executeQuery.getInt("id"),
                    executeQuery.getString("nombre"),
                    executeQuery.getInt("telefono"),
                    executeQuery.getString("direccion"));

            alumnos.add(nuevoAlumno);

        }
        newStatement.close();

        return alumnos;
    }

    public static ArrayList<Direccion> ListaDirecciones(Connection con, String query) throws SQLException {

        Statement newStatement = createSentence(con);
        ResultSet executeQuery = newStatement.executeQuery(query);
        ArrayList<Direccion> newDireccions = new ArrayList<>();

        while (executeQuery.next()) {

            Direccion newDireccion = new Direccion();
            newDireccion.setId(executeQuery.getInt("id"));
            newDireccion.setIdAlumno(executeQuery.getInt("idAlumno"));
            newDireccion.setDireccion(executeQuery.getString("Direccion"));

        }

        return newDireccions;
    }

    public static void queryInsercion(Connection con, String query) throws SQLException {

        PreparedStatement newStatement = con.prepareStatement(query);
        newStatement.executeUpdate();
        newStatement.close();
    }

    public static void queryInsercionAlumno(Connection con, String query, Alumno alumno) throws SQLException {

        PreparedStatement newStatement = con.prepareStatement(query);
        newStatement.setString(1, alumno.getNombre());
        newStatement.setInt(2, alumno.getTelefono());
        newStatement.setString(3, alumno.getDireccion());

        newStatement.executeUpdate();

        newStatement.close();

    }

    public static void queryInsercionDireccion(Connection con, String query, Direccion direccion) throws SQLException {

        PreparedStatement newStatement = con.prepareStatement(query);
        newStatement.setInt(1, direccion.getIdAlumno());
        newStatement.setString(2, direccion.getDireccion());

        newStatement.executeUpdate();

        newStatement.close();

    }

    public static void queryInsercionFamiliar(Connection con, String query, Familiar nuevoFamiliar) throws SQLException {

        PreparedStatement newStatement = con.prepareStatement(query);
        newStatement.setInt(1, nuevoFamiliar.getIdAlumno());
        newStatement.setString(2, nuevoFamiliar.getNombre());
        newStatement.setString(3, nuevoFamiliar.getSexo());
        newStatement.setInt(4, nuevoFamiliar.getTelefono());
        newStatement.setBoolean(5, nuevoFamiliar.isCustodia());

        newStatement.executeUpdate();

        newStatement.close();
    }

    public static void queryUpdateAsignatura(Connection con, String query, int idAlumno, String asignaturaAntigua, String asignaturaNueva) throws SQLException {

        PreparedStatement newStatement = con.prepareStatement(query);
        newStatement.setString(1, asignaturaNueva);
        newStatement.setInt(2, idAlumno);
        newStatement.setString(3, asignaturaAntigua);
        newStatement.executeUpdate();

        newStatement.close();
    }

    public static void queryUpdateCustodia(Connection con, String query, boolean custodia, int idFamiliar) throws SQLException {

        PreparedStatement newStatement = con.prepareStatement(query);
        newStatement.setBoolean(1, custodia);
        newStatement.setInt(2, idFamiliar);
        newStatement.executeUpdate();

        newStatement.close();
    }

    public static void queryElimiarAlumno(Connection con, String query, int idAlumno) throws SQLException {

        PreparedStatement newStatement = con.prepareStatement(query);
        newStatement.setInt(1, idAlumno);
        newStatement.executeUpdate();

        newStatement.close();

    }

    public static void queryElimiarAsignatura(Connection con, String query, int id, String nombreAsignatura) throws SQLException {

        PreparedStatement newStatement = con.prepareStatement(query);
        newStatement.setInt(1, id);
        newStatement.setString(2, nombreAsignatura);
        newStatement.executeUpdate();

        newStatement.close();
    }

    public static void queryInsercionProfesor(Connection con, String query, String nombre, String apellidos, int idAsignatura) throws SQLException {

        PreparedStatement newStatement = con.prepareStatement(query);
        newStatement.setString(1, nombre);
        newStatement.setString(2, apellidos);
        newStatement.setInt(3, idAsignatura);
        newStatement.executeUpdate();

        newStatement.close();
    }
}
