package com.francisco.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminScreen extends javax.swing.JFrame {

    Connection connection;

    public AdminScreen(Connection connection) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.connection = connection;
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
        disconnectJMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRÁCTICA JDBC ACCESO A DATOS");

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        queryUno.setText("QUERY 1");
        queryUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryUnoActionPerformed(evt);
            }
        });
        queryMenu.add(queryUno);

        queryDos.setText("QUERY 2");
        queryDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryDosActionPerformed(evt);
            }
        });
        queryMenu.add(queryDos);

        queryTres.setText("QUERY 3");
        queryTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryTresActionPerformed(evt);
            }
        });
        queryMenu.add(queryTres);

        jMenuBar1.add(queryMenu);

        insertMenu.setText("INSERTAR");

        insertarUno.setText("INSERTAR 1");
        insertarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarUnoActionPerformed(evt);
            }
        });
        insertMenu.add(insertarUno);

        insertarDos.setText("INSERTAR 2");
        insertarDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarDosActionPerformed(evt);
            }
        });
        insertMenu.add(insertarDos);

        insertarTres.setText("INSERTAR 3");
        insertarTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarTresActionPerformed(evt);
            }
        });
        insertMenu.add(insertarTres);

        jMenuBar1.add(insertMenu);

        updateMenu.setText("ACTUALIZAR");

        actualizarUno.setText("ACTUALIZAR 1");
        actualizarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarUnoActionPerformed(evt);
            }
        });
        updateMenu.add(actualizarUno);

        actualizarDos.setText("ACTUALIZAR 2");
        actualizarDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDosActionPerformed(evt);
            }
        });
        updateMenu.add(actualizarDos);

        jMenuBar1.add(updateMenu);

        deleteDataMenu.setText("ELIMINAR DATO");

        eliminarUno.setText("ELIMINAR 1");
        eliminarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUnoActionPerformed(evt);
            }
        });
        deleteDataMenu.add(eliminarUno);

        eliminarDos.setText("ELIMINAR 2");
        eliminarDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDosActionPerformed(evt);
            }
        });
        deleteDataMenu.add(eliminarDos);

        jMenuBar1.add(deleteDataMenu);

        queryLibre.setText("CONSULTA LIBRE");
        queryLibre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                queryLibreMouseClicked(evt);
            }
        });
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

        String query
                = "CREATE TABLE ALUMNO (id INTEGER PRIMARY KEY, nombre VARCHAR(255), telefono INTEGER,direccion VARCHAR(255));\n"
                + "CREATE TABLE DIRECCION (id INTEGER PRIMARY KEY, idAlumno INTEGER,direccion VARCHAR(255), FOREIGN KEY (idAlumno) REFERENCES Alumno(id));\n"
                + "CREATE TABLE FAMILIAR (id INTEGER PRIMARY KEY,idAlumno INTEGER, nombre VARCHAR(255),sexo VARCHAR(1),telefono INTEGER,custodia BOOLEAN,FOREIGN KEY (idAlumno) REFERENCES Alumno(id));\n"
                + "CREATE TABLE ASIGNATURA (id INTEGER PRIMARY KEY,idAlumno INTEGER,nombreAsignatura VARCHAR(255),curso VARCHAR(255),notas INTEGER,FOREIGN KEY (idAlumno) REFERENCES Alumno(id));";
        try {
            JDBCOperations.createTable(connection, query);
            textArea.append("Tablas y referencias creadas con exito.");
            textArea.append("\n----------------------------------------------------\n");
        } catch (SQLException ex) {
            textArea.append("No se ha podido ejecutar la consulta: " + query + "\n");
            textArea.append(ex.getMessage() + "\n");
            textArea.append("-1");
            textArea.append("\n----------------------------------------------------\n");

        }
    }//GEN-LAST:event_creationTableMenuMouseClicked

    private void deleteTableMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTableMenuMouseClicked

        String query = "DROP TABLE IF EXISTS ASIGNASTURA;\n"
                + "DROP TABLE IF EXISTS FFAMILIAR;\n"
                + "DROP TABLE IF EXISTS DDIRECCION;\n"
                + "DROP TABLE IF EXISTS ALUMNO;";

        try {
            JDBCOperations.dropTable(connection, query);
            textArea.append("Tabla ALUMNO eliminada con exito.");
            textArea.append("\n----------------------------------------------------\n");
        } catch (SQLException ex) {
            textArea.append("No se ha podido ejecutar la consulta: " + query + "\n");
            textArea.append(ex.getMessage() + "\n");
            textArea.append("-2");
            textArea.append("\n----------------------------------------------------\n");

        }
    }//GEN-LAST:event_deleteTableMenuMouseClicked

    private void queryUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryUnoActionPerformed

        String query = "SELECT * FROM ALUMNO WHERE nombre = Carlos;\n"
                + "SELECT * FROM ALUMNO WHERE nombre = Pedro;\n"
                + "SELECT * FROM ALUMNO WHERE nombre = Javier;";

        try {
            ResultSet queryOneResult = JDBCOperations.query(connection, query);
            textArea.append(queryOneResult.toString());
            textArea.append("\n----------------------------------------------------\n");
        } catch (SQLException ex) {
            textArea.append("No se ha podido ejecutar la consulta: " + query + "\n");
            textArea.append(ex.getMessage() + "\n");
            textArea.append("-3");
            textArea.append("\n----------------------------------------------------\n");

        }

    }//GEN-LAST:event_queryUnoActionPerformed

    private void queryDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryDosActionPerformed

        String query = "SELECT * FROM ALUMNO;";

        try {
            ResultSet queryTwoResult = JDBCOperations.query(connection, query);
            textArea.append(queryTwoResult.toString());
            textArea.append("\n----------------------------------------------------\n");
        } catch (SQLException ex) {
            textArea.append("No se ha podido ejecutar la consulta: " + query + "\n");
            textArea.append(ex.getMessage() + "\n");
            textArea.append("-3");
            textArea.append("\n----------------------------------------------------\n");
        }
    }//GEN-LAST:event_queryDosActionPerformed

    private void queryTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryTresActionPerformed

        String query = "SELECT a.id AS alumno_id,a.nombre AS alumno_nombre,f.nombre AS familiar_nombre,f.sexo AS familiar_sexo,"
                + "f.telefono AS familiar_telefono, f.custodia AS familiar_custodiaFROM ALUMNO a JOIN FAMILIAR f "
                + "ON a.id = f.idAlumno WHERE a.id IN (1, 2, 3, 4);";

        try {
            ResultSet queryThreeResult = JDBCOperations.query(connection, query);
            textArea.append(queryThreeResult.toString());
            textArea.append("\n----------------------------------------------------\n");
        } catch (SQLException ex) {
            textArea.append("No se ha podido ejecutar la consulta: " + query + "\n");
            textArea.append(ex.getMessage() + "\n");
            textArea.append("-3");
            textArea.append("\n----------------------------------------------------\n");
        }
    }//GEN-LAST:event_queryTresActionPerformed

    private void insertarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertarUnoActionPerformed

    private void insertarDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertarDosActionPerformed

    private void insertarTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarTresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertarTresActionPerformed

    private void actualizarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarUnoActionPerformed

    private void actualizarDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarDosActionPerformed

    private void eliminarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarUnoActionPerformed

    private void eliminarDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarDosActionPerformed

    private void queryLibreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_queryLibreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_queryLibreMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarDos;
    private javax.swing.JMenuItem actualizarUno;
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
