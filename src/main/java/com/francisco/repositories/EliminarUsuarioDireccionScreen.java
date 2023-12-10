package com.francisco.repositories;

import java.sql.Connection;
import java.sql.SQLException;

public class EliminarUsuarioDireccionScreen extends javax.swing.JFrame {

    public Connection con;

    public EliminarUsuarioDireccionScreen(Connection con) {
        initComponents();
        this.con = con;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idAlumno = new javax.swing.JTextField();
        onElimiarAlumnoDirecciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ID DEL ALUMNO:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ELIMINAR ALUMNO Y DIRECCIONES ASOCIADAS");

        idAlumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        onElimiarAlumnoDirecciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        onElimiarAlumnoDirecciones.setText("ELIMIAR");
        onElimiarAlumnoDirecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onElimiarAlumnoDireccionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(idAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(onElimiarAlumnoDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(onElimiarAlumnoDirecciones)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onElimiarAlumnoDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onElimiarAlumnoDireccionesActionPerformed

        String query = "DELETE FROM DIRECCION WHERE idAlumno = ?;";
        String query2 = "DELETE FROM ASIGNATURA WHERE idAlumno = ?;";
        String query3 = "DELETE FROM FAMILIAR WHERE idAlumno = ?;"; 
        String query4 = "DELETE FROM ALUMNO WHERE id= ?;";

        StringBuilder posibleError = new StringBuilder("Operación realizada con exito, Alumno eliminado.\n");
        int idAlumno = Integer.parseInt(this.idAlumno.getText());

        try {
            JDBCOperations.queryElimiarAlumno(con, query, idAlumno);
            JDBCOperations.queryElimiarAlumno(con, query2, idAlumno);
            JDBCOperations.queryElimiarAlumno(con, query3, idAlumno);
            JDBCOperations.queryElimiarAlumno(con, query4, idAlumno);
        } catch (SQLException ex) {
            posibleError.append("No se ha podido ejecutar la consulta: " + query + "\n");
            posibleError.append(ex.getMessage() + "\n");
        }

        AdminScreen nuevaAdminScreen = new AdminScreen(con, posibleError);
        this.dispose();
        nuevaAdminScreen.setVisible(true);
    }//GEN-LAST:event_onElimiarAlumnoDireccionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idAlumno;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton onElimiarAlumnoDirecciones;
    // End of variables declaration//GEN-END:variables
}
