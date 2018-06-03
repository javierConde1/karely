package Ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Entregas extends javax.swing.JFrame {

    public static final String user = "root";
    public static final String pass = "";
    public static final String URL = "jdbc:mysql://localhost:3306/proyecto";

    PreparedStatement ps;
    PreparedStatement ps0;
    PreparedStatement ps1;
    PreparedStatement ps2;
    PreparedStatement ps3;
    PreparedStatement ps4;
    PreparedStatement ps5;

    ResultSet rs0;
    ResultSet rs1;
    ResultSet rs2;
    ResultSet rs3;
    ResultSet rs4;
    ResultSet rs5;

    int filas = 0;
    int columnas = 0;

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, user, pass);
        } catch (Exception e) {
            System.err.println(e);
        }
        return con;
    }

    private void limpiarCajas() {
        jComboBox1.setSelectedItem("--SELECCIONA--");
        jComboBox2.setSelectedItem("--SELECCIONA--");
        jSpinner1.setValue(1);
        limpiarTabla();
    }

    private void limpiarTabla() {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 5; j++) {
                jTable1.setValueAt("", j, i);
            }
        }
        jTable1.setValueAt(0, 0, 3);
        jTable1.setValueAt(0, 1, 3);
        jTable1.setValueAt(0, 2, 3);
        jTable1.setValueAt(0, 3, 3);
        jTable1.setValueAt(0, 4, 3);
        jTable1.setValueAt(0, 5, 3);
    }

    public Entregas() {
        initComponents();
        setLocation(480, 120);
        setIconImage(new ImageIcon(getClass().getResource("/Reportes/1.png")).getImage());
        jTable1.setValueAt(0, 0, 3);
        jTable1.setValueAt(0, 1, 3);
        jTable1.setValueAt(0, 2, 3);
        jTable1.setValueAt(0, 3, 3);
        jTable1.setValueAt(0, 4, 3);
        jTable1.setValueAt(0, 5, 3);
        jComboBox1.addItem("--SELECCIONA--");
        jComboBox1.addItem("1111");
        jComboBox1.addItem("1112");
        jComboBox1.addItem("1113");
        jComboBox1.addItem("1114");
        jComboBox1.addItem("1115");
        jComboBox1.addItem("1116");
        jComboBox1.addItem("1117");
        jComboBox1.addItem("1118");
        jComboBox1.addItem("1119");
        jComboBox1.addItem("1120");
        jComboBox1.addItem("1121");
        jComboBox1.addItem("1122");
        jComboBox1.addItem("1123");
        jComboBox1.addItem("1124");
        jComboBox1.addItem("1125");
        jComboBox1.addItem("1126");
        jComboBox1.addItem("1127");
        jComboBox1.addItem("1128");
        jComboBox1.addItem("1129");
        jComboBox1.addItem("1130");
        jComboBox1.addItem("1131");
        jComboBox1.addItem("1132");
        jComboBox1.addItem("1133");
        jComboBox1.addItem("1134");
        jComboBox1.addItem("1135");
        jComboBox1.addItem("1136");
        jComboBox1.addItem("1137");
        jComboBox1.addItem("1138");
        jComboBox1.addItem("1139");
        jComboBox1.addItem("4948");
        jComboBox1.addItem("5050");
        jComboBox1.addItem("7979");
        jComboBox1.addItem("8989");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton5.setText("SALIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("TOTAL COMPRA:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("0");

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("ENTREGAS");

        jButton2.setText("AGREGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre/Codigo Producto:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONA--", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2034", "5052", "7890" }));

        jLabel2.setText("No. Proveedor");

        jLabel7.setText("Cantidad:");

        jButton3.setText("CONFIRMAR PRODUCTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Precio Unitario", "Cantidad", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("NUEVA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)
                        .addGap(121, 121, 121)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addComponent(jButton2)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jComboBox2.getSelectedItem().equals("--SELECCIONA--")) {
            JOptionPane.showMessageDialog(null, "CAMPOS EN BLANCO");
        } else if (jLabel5.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "CANTIDAD EN 0");
        } else {
            Connection con = null;
            String sql = "insert into entregas(proveedor_id,costo,fecha) values(?,?,now())";
            String sql2 = "select aumenta_stock(?,?)";
            try {
                con = getConnection();
                ps = con.prepareStatement(sql);
                ps.setString(1, jComboBox2.getSelectedItem().toString());
                ps.setString(2, jLabel5.getText());

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "VENTA REGISTRADA");
                    filas = 0;
                    columnas = 0;

                    if (!jTable1.getValueAt(0, 0).equals("")) {
                        ps0 = con.prepareStatement(sql2);
                        ps0.setString(1, jTable1.getValueAt(0, 0).toString());
                        ps0.setString(2, jTable1.getValueAt(0, 2).toString());
                        rs0 = ps0.executeQuery();
                    }

                    if (!jTable1.getValueAt(1, 0).equals("")) {
                        ps1 = con.prepareStatement(sql2);
                        ps1.setString(1, jTable1.getValueAt(1, 0).toString());
                        ps1.setString(2, jTable1.getValueAt(1, 2).toString());
                        rs1 = ps1.executeQuery();
                    }

                    if (!jTable1.getValueAt(2, 0).equals("")) {
                        ps2 = con.prepareStatement(sql2);
                        ps2.setString(1, jTable1.getValueAt(2, 0).toString());
                        ps2.setString(2, jTable1.getValueAt(2, 2).toString());
                        rs2 = ps2.executeQuery();
                    }

                    if (!jTable1.getValueAt(3, 0).equals("")) {
                        ps3 = con.prepareStatement(sql2);
                        ps3.setString(1, jTable1.getValueAt(3, 0).toString());
                        ps3.setString(2, jTable1.getValueAt(3, 2).toString());
                        rs3 = ps3.executeQuery();
                    }

                    if (!jTable1.getValueAt(4, 0).equals("")) {
                        ps4 = con.prepareStatement(sql2);
                        ps4.setString(1, jTable1.getValueAt(4, 0).toString());
                        ps4.setString(2, jTable1.getValueAt(4, 2).toString());
                        rs4 = ps4.executeQuery();
                    }

                    if (!jTable1.getValueAt(5, 0).equals("")) {
                        ps5 = con.prepareStatement(sql2);
                        ps5.setString(1, jTable1.getValueAt(5, 0).toString());
                        ps5.setString(2, jTable1.getValueAt(5, 2).toString());
                        rs5 = ps5.executeQuery();
                    }

                    rs0 = ps0.executeQuery();
                    rs0 = ps0.executeQuery();
                    rs0 = ps0.executeQuery();
                    rs0 = ps0.executeQuery();
                    rs0 = ps0.executeQuery();
                    rs0 = ps0.executeQuery();

                    limpiarCajas();
                    limpiarTabla();

                } else {
                    JOptionPane.showMessageDialog(null, "ERROR");
                    limpiarCajas();
                    filas = 0;
                    columnas = 0;
                }
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int iPrecioTot;
        String sPrecioTot;

        if (jComboBox1.getSelectedItem().equals("1111")) {
            jTable1.setValueAt("LAPTOP DELL", filas, columnas);
            jTable1.setValueAt("5000", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);

        } else if (jComboBox1.getSelectedItem().equals("1112")) {
            jTable1.setValueAt("Laptop Imac", filas, columnas);
            jTable1.setValueAt("18000", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);

        } else if (jComboBox1.getSelectedItem().equals("1113")) {
            jTable1.setValueAt("USB 4", filas, columnas);
            jTable1.setValueAt("20", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1114")) {
            jTable1.setValueAt("USB 8", filas, columnas);
            jTable1.setValueAt("70", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1115")) {
            jTable1.setValueAt("USB 16", filas, columnas);
            jTable1.setValueAt("75", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1116")) {
            jTable1.setValueAt("USB 32", filas, columnas);
            jTable1.setValueAt("100", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1117")) {
            jTable1.setValueAt("TERABYTE", filas, columnas);
            jTable1.setValueAt("800", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1118")) {
            jTable1.setValueAt("DISCO DURO", filas, columnas);
            jTable1.setValueAt("570", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1119")) {
            jTable1.setValueAt("ADAPTADOR USB", filas, columnas);
            jTable1.setValueAt("20", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1120")) {
            jTable1.setValueAt("MOUSE AL", filas, columnas);
            jTable1.setValueAt("120", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1121")) {
            jTable1.setValueAt("MOUSE INAL", filas, columnas);
            jTable1.setValueAt("200", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1122")) {
            jTable1.setValueAt("TECLADO AL", filas, columnas);
            jTable1.setValueAt("100", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1123")) {
            jTable1.setValueAt("TECLADO INAL", filas, columnas);
            jTable1.setValueAt("350", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1124")) {
            jTable1.setValueAt("AUDIFONOS SONY AL", filas, columnas);
            jTable1.setValueAt("350", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1125")) {
            jTable1.setValueAt("AUDIFONOS SONY INAL", filas, columnas);
            jTable1.setValueAt("500", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1126")) {
            jTable1.setValueAt("AUDIFONOS SAMSUNG AL", filas, columnas);
            jTable1.setValueAt("300", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1127")) {
            jTable1.setValueAt("AUDIFONOS SAMSUNG INAL", filas, columnas);
            jTable1.setValueAt("900", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1128")) {
            jTable1.setValueAt("AUDIFONOS BEATS", filas, columnas);
            jTable1.setValueAt("1880", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1129")) {
            jTable1.setValueAt("MONITOR SAMSUNG 17", filas, columnas);
            jTable1.setValueAt("2750", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1130")) {
            jTable1.setValueAt("MONITOR SAMSUNG 15", filas, columnas);
            jTable1.setValueAt("3250", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1131")) {
            jTable1.setValueAt("MONITOR DELL 15", filas, columnas);
            jTable1.setValueAt("2299", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1132")) {
            jTable1.setValueAt("MONITOR DELL 17", filas, columnas);
            jTable1.setValueAt("2888", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1133")) {
            jTable1.setValueAt("MEMORIA RAM 4 GB", filas, columnas);
            jTable1.setValueAt("300", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1134")) {
            jTable1.setValueAt("MEMORIA RAM 8 GB", filas, columnas);
            jTable1.setValueAt("500", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1135")) {
            jTable1.setValueAt("MEMORIA RAM 16 GB", filas, columnas);
            jTable1.setValueAt("900", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1136")) {
            jTable1.setValueAt("PROCESADOR I7", filas, columnas);
            jTable1.setValueAt("4289", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1137")) {
            jTable1.setValueAt("PROCESADOR I9", filas, columnas);
            jTable1.setValueAt("35820", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1138")) {
            jTable1.setValueAt("CABLE HDMI 1M", filas, columnas);
            jTable1.setValueAt("20", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("1139")) {
            jTable1.setValueAt("CABLE HDMI 3M", filas, columnas);
            jTable1.setValueAt("35", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("4948")) {
            jTable1.setValueAt("Laptop HP", filas, columnas);
            jTable1.setValueAt("4700", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("5050")) {
            jTable1.setValueAt("Laptop LENOVO", filas, columnas);
            jTable1.setValueAt("5000", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("7979")) {
            jTable1.setValueAt("MICRO SD 4 GB", filas, columnas);
            jTable1.setValueAt("20", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        } else if (jComboBox1.getSelectedItem().equals("8989")) {
            jTable1.setValueAt("Laptop TOSHIBA", filas, columnas);
            jTable1.setValueAt("4282", filas, columnas + 1);
            jTable1.setValueAt(jSpinner1.getValue(), filas, columnas + 2);

            iPrecioTot = (Integer.parseInt(jTable1.getValueAt(filas, columnas + 1).toString())) * (Integer.parseInt(jTable1.getValueAt(filas, columnas + 2).toString()));
            sPrecioTot = Integer.toString(iPrecioTot);

            jTable1.setValueAt(sPrecioTot, filas, columnas + 3);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        filas++;
        int total1 = Integer.parseInt(jTable1.getValueAt(0, 3).toString());
        int total2 = Integer.parseInt(jTable1.getValueAt(1, 3).toString());
        int total3 = Integer.parseInt(jTable1.getValueAt(2, 3).toString());
        int total4 = Integer.parseInt(jTable1.getValueAt(3, 3).toString());
        int total5 = Integer.parseInt(jTable1.getValueAt(4, 3).toString());
        int total6 = Integer.parseInt(jTable1.getValueAt(5, 3).toString());

        int totalFinal = total1 + total2 + total3 + total4 + total5 + total6;
        String sTotalFinal = Integer.toString(totalFinal);

        jLabel5.setText(sTotalFinal);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpiarCajas();
        limpiarTabla();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entregas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
