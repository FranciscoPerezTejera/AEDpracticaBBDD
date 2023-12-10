package com.francisco.repositories;

import com.francisco.entities.Alumno;
import com.francisco.entities.Familiar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminScreen extends javax.swing.JFrame {

    Connection connection;
    StringBuilder posibleError;

    public AdminScreen(Connection connection) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.connection = connection;
        this.posibleError = new StringBuilder();
    }

    public AdminScreen(Connection con, StringBuilder posibleError) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.connection = con;
        this.posibleError = posibleError;

        textArea.append(posibleError.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        creationTableMenu = new javax.swing.JMenu();
        deleteTableMenu = new javax.swing.JMenu();
        queryMenu = new javax.swing.JMenu();
        queryUno = new javax.swing.JMenuItem();
        queryDos = new javax.swing.JMenuItem();
        queryTres = new javax.swing.JMenuItem();
        insertMenu = new javax.swing.JMenu();
        insertarUno = new javax.swing.JMenuItem();
        insertarDos = new javax.swing.JMenuItem();
        insertarTres = new javax.swing.JMenuItem();
        updateMenu = new javax.swing.JMenu();
        actualizarUno = new javax.swing.JMenuItem();
        actualizarDos = new javax.swing.JMenuItem();
        deleteDataMenu = new javax.swing.JMenu();
        eliminarUno = new javax.swing.JMenuItem();
        eliminarDos = new javax.swing.JMenuItem();
        queryLibre = new javax.swing.JMenu();
        crearTablaProfesores = new javax.swing.JMenuItem();
        añadirProfesor = new javax.swing.JMenuItem();
        disconnectJMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRÁCTICA JDBC ACCESO A DATOS");

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setMinimumSize(new java.awt.Dimension(700, 30));

        creationTableMenu.setText("CREAR TABLAS");
        creationTableMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creationTableMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(creationTableMenu);

        deleteTableMenu.setText("ELIMINAR TABLA");
        deleteTableMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteTableMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(deleteTableMenu);

        queryMenu.setText("CONSULTAS");

        queryUno.setText("1.- Consultas de 3 alumnos por nombre");
        queryUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryUnoActionPerformed(evt);
            }
        });
        queryMenu.add(queryUno);

        queryDos.setText("2.- Consultar todos los alumnos");
        queryDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryDosActionPerformed(evt);
            }
        });
        queryMenu.add(queryDos);

        queryTres.setText("3.-  Consultar 4 alumnos para saber que familiares tiene la custodia");
        queryTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryTresActionPerformed(evt);
            }
        });
        queryMenu.add(queryTres);

        jMenuBar1.add(queryMenu);

        insertMenu.setText("INSERTAR");

        insertarUno.setText("1.- Insertar un Alumno");
        insertarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarUnoActionPerformed(evt);
            }
        });
        insertMenu.add(insertarUno);

        insertarDos.setText("2.- Insertar una Dirección");
        insertarDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarDosActionPerformed(evt);
            }
        });
        insertMenu.add(insertarDos);

        insertarTres.setText("3.- Insertar un Familiar");
        insertarTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarTresActionPerformed(evt);
            }
        });
        insertMenu.add(insertarTres);

        jMenuBar1.add(insertMenu);

        updateMenu.setText("ACTUALIZAR");

        actualizarUno.setText("1.- Modificar asignatura de un Alumno");
        actualizarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarUnoActionPerformed(evt);
            }
        });
        updateMenu.add(actualizarUno);

        actualizarDos.setText("2.- Modificar el estado de custodia de un Familiar");
        actualizarDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDosActionPerformed(evt);
            }
        });
        updateMenu.add(actualizarDos);

        jMenuBar1.add(updateMenu);

        deleteDataMenu.setText("ELIMINAR DATO");

        eliminarUno.setText("1.- Elimina un Alumno y su Dirección");
        eliminarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUnoActionPerformed(evt);
            }
        });
        deleteDataMenu.add(eliminarUno);

        eliminarDos.setText("2.- Elimina una asignatura del alumno");
        eliminarDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDosActionPerformed(evt);
            }
        });
        deleteDataMenu.add(eliminarDos);

        jMenuBar1.add(deleteDataMenu);

        queryLibre.setText("CONSULTA LIBRE");

        crearTablaProfesores.setText("1.- Crea la tabla Pofresor, referenciada con asignatura");
        crearTablaProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTablaProfesoresActionPerformed(evt);
            }
        });
        queryLibre.add(crearTablaProfesores);

        añadirProfesor.setText("2.- Añade un profesor");
        añadirProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirProfesorActionPerformed(evt);
            }
        });
        queryLibre.add(añadirProfesor);

        jMenuBar1.add(queryLibre);

        disconnectJMenu.setText("SALIR");
        disconnectJMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        disconnectJMenu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        disconnectJMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disconnectJMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(disconnectJMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disconnectJMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disconnectJMenuMouseClicked

        try {
            connection.close();
            System.out.println("Conexión con el servidor cerrada.");
        } catch (SQLException ex) {

            textArea.append("No se ha podido cerrar la conexion con el servidor\n");
            textArea.append(ex.getMessage() + "\n");
            textArea.append("-1");
            textArea.append("\n----------------------------------------------------\n");

        }
        this.dispose();
    }//GEN-LAST:event_disconnectJMenuMouseClicked

    private void creationTableMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creationTableMenuMouseClicked

        String query = """
                       CREATE TABLE ALUMNO (id INTEGER AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(255), telefono INTEGER,direccion VARCHAR(255));
                       CREATE TABLE DIRECCION (id INTEGER AUTO_INCREMENT PRIMARY KEY, idAlumno INTEGER,direccion VARCHAR(255), FOREIGN KEY (idAlumno) 
                       REFERENCES Alumno(id));
                       CREATE TABLE FAMILIAR (id INTEGER AUTO_INCREMENT PRIMARY KEY,idAlumno INTEGER, nombre VARCHAR(255),sexo VARCHAR(1),telefono INTEGER,
                       custodia BOOLEAN,FOREIGN KEY (idAlumno) REFERENCES Alumno(id));
                       CREATE TABLE ASIGNATURA (id INTEGER AUTO_INCREMENT PRIMARY KEY,idAlumno INTEGER,nombreAsignatura VARCHAR(255),curso VARCHAR(255),notas INTEGER,
                       FOREIGN KEY (idAlumno) REFERENCES Alumno(id));
                       """;

        String queryInsercionInicial = """
                                       INSERT INTO ALUMNO (nombre, telefono, direccion) VALUES ('Pedro', 123456789, 'Dirección Pedro');
                                       INSERT INTO ALUMNO (nombre, telefono, direccion) VALUES ('Samuel', 987654321, 'Dirección Samuel');
                                       INSERT INTO ALUMNO (nombre, telefono, direccion) VALUES ('Roberto', 555555555, 'Dirección Roberto');
                                       INSERT INTO ALUMNO (nombre, telefono, direccion) VALUES ('Martina', 888888888, 'Dirección Martina');
                                       INSERT INTO ALUMNO (nombre, telefono, direccion) VALUES ('Carlos', 111111111, 'Dirección Carlos');
                                       INSERT INTO ALUMNO (nombre, telefono, direccion) VALUES ('Xavi', 999999999, 'Dirección Xavi');
                                       INSERT INTO ALUMNO (nombre, telefono, direccion) VALUES ('Javier', 444444444, 'Dirección Javier');
                                       INSERT INTO ALUMNO (nombre, telefono, direccion) VALUES ('Soraya', 666666666, 'Dirección Soraya');
                                       INSERT INTO ALUMNO (nombre, telefono, direccion) VALUES ('Tatiana', 222222222, 'Dirección Tatiana');
                                       INSERT INTO ALUMNO (nombre, telefono, direccion) VALUES ('Marta', 777777777, 'Dirección Marta');
                                       INSERT INTO DIRECCION (idAlumno, direccion) VALUES (1, 'Dirección Pedro');
                                       INSERT INTO FAMILIAR (idAlumno, nombre, sexo, telefono, custodia) VALUES (1, 'Padre de Pedro', 'M', 111111111, true);
                                       INSERT INTO ASIGNATURA (idAlumno, nombreAsignatura, curso, notas) VALUES (1, 'Matemáticas', '1º ESO', 80);
                                       INSERT INTO DIRECCION (idAlumno, direccion) VALUES (5, 'Dirección de Carlos 2');
                                       INSERT INTO FAMILIAR (idAlumno, nombre, sexo, telefono, custodia) VALUES (5, 'Madre Carlos', 'F', 222222222, false);
                                       INSERT INTO ASIGNATURA (idAlumno, nombreAsignatura, curso, notas) VALUES (5, 'Lengua', '2º ESO', 85);
                                       INSERT INTO DIRECCION (idAlumno, direccion) VALUES (7, 'Dirección Javier 2');
                                       INSERT INTO FAMILIAR (idAlumno, nombre, sexo, telefono, custodia) VALUES (7, 'Abuelo Javier', 'M', 333333333, true);
                                       INSERT INTO ASIGNATURA (idAlumno, nombreAsignatura, curso, notas) VALUES (7, 'Historia', '3º ESO', 75);
                                       """;

        try {
            JDBCOperations.createTable(connection, query);
            JDBCOperations.queryInsercion(connection, queryInsercionInicial);
            textArea.append("Tablas, referencias y primeras inserciones creadas con exito.");
            textArea.append("\n----------------------------------------------------\n");
        } catch (SQLException ex) {
            textArea.append("No se ha podido ejecutar la consulta: " + queryInsercionInicial + "\n");
            textArea.append(ex.getMessage() + "\n");
            textArea.append("-1");
            textArea.append("\n----------------------------------------------------\n");
        }
    }//GEN-LAST:event_creationTableMenuMouseClicked

    private void deleteTableMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTableMenuMouseClicked

        String query = """
                       DROP TABLE IF EXISTS PROFESOR;
                       DROP TABLE IF EXISTS ASIGNATURA;
                       DROP TABLE IF EXISTS FAMILIAR;
                       DROP TABLE IF EXISTS DIRECCION;
                       DROP TABLE IF EXISTS ALUMNO;
                       """;

        try {
            JDBCOperations.dropTable(connection, query);
            textArea.append("Todas las tablas han sido eliminadas con exito.");
            textArea.append("\n----------------------------------------------------\n");
        } catch (SQLException ex) {
            textArea.append("No se ha podido ejecutar la consulta: " + query + "\n");
            textArea.append(ex.getMessage() + "\n");
            textArea.append("-2");
            textArea.append("\n----------------------------------------------------\n");

        }
    }//GEN-LAST:event_deleteTableMenuMouseClicked

    private void queryUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryUnoActionPerformed

        String query = "SELECT * FROM ALUMNO WHERE nombre in('Carlos','Pedro','Javier');";
        String texto = "";
        try {
            ArrayList<Alumno> queryOneResult = JDBCOperations.query(connection, query);

            for (Alumno alumno : queryOneResult) {
                textArea.append(alumno.toString());
                textArea.append("\n-----------------------------------\n");
            }

        } catch (SQLException ex) {

        }


    }//GEN-LAST:event_queryUnoActionPerformed

    private void queryDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryDosActionPerformed

        String query = "SELECT * FROM ALUMNO;";

        try {
            ArrayList<Alumno> alumnos = JDBCOperations.query(connection, query);

            for (Alumno alumno : alumnos) {
                textArea.append(alumno.toString());
                textArea.append("\n----------------------------------------------------\n");
            }
        } catch (SQLException ex) {
            textArea.append("No se ha podido ejecutar la consulta: " + query + "\n");
            textArea.append(ex.getMessage() + "\n");
            textArea.append("-3");
            textArea.append("\n----------------------------------------------------\n");
        }
    }//GEN-LAST:event_queryDosActionPerformed

    private void queryTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryTresActionPerformed

        String query = "SELECT ALUMNO.nombre,FAMILIAR.nombre,FAMILIAR.custodia "
                + "FROM ALUMNO JOIN FAMILIAR ON ALUMNO.id = FAMILIAR.idAlumno;";

        try {
            ArrayList<Alumno> alumnos = JDBCOperations.query(connection, query);

            for (Alumno alumno : alumnos) {
                textArea.append(alumno.toString());
                textArea.append("\n----------------------------------------------------\n");
            }
        } catch (SQLException ex) {
            textArea.append("No se ha podido ejecutar la consulta: " + query + "\n");
            textArea.append(ex.getMessage() + "\n");
            textArea.append("-3");
            textArea.append("\n----------------------------------------------------\n");
        }
    }//GEN-LAST:event_queryTresActionPerformed

    private void insertarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarUnoActionPerformed

        InserccionScreen newInserccionScreen = new InserccionScreen(connection);
        newInserccionScreen.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_insertarUnoActionPerformed

    private void insertarDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarDosActionPerformed

        DirectionScreen newDirectionScreen = new DirectionScreen(connection);
        newDirectionScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_insertarDosActionPerformed

    private void insertarTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarTresActionPerformed

        InserccionFamiliarScreen newInserccionFamiliarScreen = new InserccionFamiliarScreen(connection);
        newInserccionFamiliarScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_insertarTresActionPerformed

    private void actualizarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarUnoActionPerformed

        ActualizarAsignaturaScreen newActualizarAsignaturaScreen = new ActualizarAsignaturaScreen(connection);
        newActualizarAsignaturaScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_actualizarUnoActionPerformed

    private void actualizarDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDosActionPerformed

        ActualizarCustodiaScreen newActualizarCustodiaScreen = new ActualizarCustodiaScreen(connection);
        newActualizarCustodiaScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_actualizarDosActionPerformed

    private void eliminarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUnoActionPerformed
        
        EliminarUsuarioDireccionScreen newEliminarUsuarioDireccionScreen = new EliminarUsuarioDireccionScreen(connection);
        newEliminarUsuarioDireccionScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eliminarUnoActionPerformed

    private void eliminarDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDosActionPerformed
        EliminarAsignaturaScreen newEliminarAsignaturaScreen = new EliminarAsignaturaScreen(connection);
        newEliminarAsignaturaScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eliminarDosActionPerformed

    private void crearTablaProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTablaProfesoresActionPerformed
        
        String query ="""
                      CREATE TABLE PROFESOR ( 
                      id INTEGER AUTO_INCREMENT PRIMARY KEY, 
                      nombre VARCHAR(255),
                      apellidos VARCHAR(255), 
                      idAsignatura INTEGER UNIQUE, 
                      FOREIGN KEY (idAsignatura) REFERENCES ASIGNATURA(id));
                      """;
        
        try {
            JDBCOperations.createTable(connection, query);
            textArea.append("Tablas, referencias y primeras inserciones creadas con exito.");
            textArea.append("\n----------------------------------------------------\n");
        } catch (SQLException ex) {
            textArea.append("No se ha podido ejecutar la consulta: " + query + "\n");
            textArea.append(ex.getMessage() + "\n");
            textArea.append("-1");
            textArea.append("\n----------------------------------------------------\n");
        }
    }//GEN-LAST:event_crearTablaProfesoresActionPerformed

    private void añadirProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirProfesorActionPerformed
        
        InserccionProfesorScreen newAñadirProfesorScreen = new InserccionProfesorScreen(connection);
        newAñadirProfesorScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_añadirProfesorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarDos;
    private javax.swing.JMenuItem actualizarUno;
    private javax.swing.JMenuItem añadirProfesor;
    private javax.swing.JMenuItem crearTablaProfesores;
    private javax.swing.JMenu creationTableMenu;
    private javax.swing.JMenu deleteDataMenu;
    private javax.swing.JMenu deleteTableMenu;
    private javax.swing.JMenu disconnectJMenu;
    private javax.swing.JMenuItem eliminarDos;
    private javax.swing.JMenuItem eliminarUno;
    private javax.swing.JMenu insertMenu;
    private javax.swing.JMenuItem insertarDos;
    private javax.swing.JMenuItem insertarTres;
    private javax.swing.JMenuItem insertarUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem queryDos;
    private javax.swing.JMenu queryLibre;
    private javax.swing.JMenu queryMenu;
    private javax.swing.JMenuItem queryTres;
    private javax.swing.JMenuItem queryUno;
    private javax.swing.JTextArea textArea;
    private javax.swing.JMenu updateMenu;
    // End of variables declaration//GEN-END:variables
}
