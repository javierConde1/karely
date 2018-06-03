package Ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Invent extends javax.swing.JFrame {

    public Invent() {
        initComponents();
        ponerEnCeros();
        setLocation(500, 20);
        setIconImage(new ImageIcon(getClass().getResource("/Reportes/1.png")).getImage());
    }

    public static final String user = "root";
    public static final String pass = "";
    public static final String URL = "jdbc:mysql://localhost:3306/proyecto";

    PreparedStatement ps;
    PreparedStatement ps2;
    PreparedStatement ps3;

    ResultSet rs;
    ResultSet rs2;
    ResultSet rs3;

    String sql;

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

    private void LAPDELL() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblLapDell.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lbllapdell_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void LAPIMAC() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblLapImac.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lbllapimac_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void USB4() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblUsb4.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblusb4_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void USB8() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblUsb8.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblusb8_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void USB16() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblUsb16.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblusb16_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void USB32() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblUsb32.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblusb32_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void TERA() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblTera.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lbltera_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void DISCO() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblDiscDu.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lbldiscodur_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void ADPUSB() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblAdapUsb.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lbladapusb_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void MOUSEAL() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblMouAl.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblmoual_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void MOUSEIN() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblMouInal.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblmouinal_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void TECAL() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblTecAl.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lbltecal_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void TECIN() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblTecInal.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lbltecinal_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void AUDSONAL() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblAudSonAl.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblaudsonal_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void AUDSONIN() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblAudSonInal.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblaudsoninal_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void AUDSAMAL() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblAudSamAl.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblaudsamal_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void AUDSAMIN() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblAudSamInal.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblaudsaminal_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void AUDBE() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblAudBeats.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblaudbeats_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void MONSAM17() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblMoniSam17.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblmonisam17_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void MONSAM15() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblMoniSam15.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblmonisam15_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void MONDELL15() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblMoniDell15.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblmonidell15_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void MONDELL17() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblMoniDell17.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblmonidell17_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void RAM4() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblRam4.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblram4_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void RAM8() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblRam8.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblram8_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void RAM16() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblRam16.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblram16_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void I7() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblProcI7.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblproci7_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void I9() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblProcI9.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblproci9_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void HDMI1() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblHdmi1.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblhdmi1_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void HDMI3() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblHdmi3.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblhdmi3_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void LAPHP() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblLapHp.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lbllaphp_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void LAPLENOVO() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblLapLeno.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lbllapleno_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void SD4() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblSd.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblsd_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void LAPTOSH() {
        Connection con = null;
        sql = "select * from producto where nombre = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, lblLapToshi.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lbllaptoshi_1.setText(rs.getString("stock"));
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblLapDell = new javax.swing.JLabel();
        lblLapImac = new javax.swing.JLabel();
        lblUsb4 = new javax.swing.JLabel();
        lblUsb8 = new javax.swing.JLabel();
        lblUsb16 = new javax.swing.JLabel();
        lblUsb32 = new javax.swing.JLabel();
        lblTera = new javax.swing.JLabel();
        lblDiscDu = new javax.swing.JLabel();
        lblAdapUsb = new javax.swing.JLabel();
        lblMouAl = new javax.swing.JLabel();
        lblMouInal = new javax.swing.JLabel();
        lblTecAl = new javax.swing.JLabel();
        lblTecInal = new javax.swing.JLabel();
        lblAudSonAl = new javax.swing.JLabel();
        lblAudSonInal = new javax.swing.JLabel();
        lblAudSamAl = new javax.swing.JLabel();
        lblAudSamInal = new javax.swing.JLabel();
        lblAudBeats = new javax.swing.JLabel();
        lblMoniSam17 = new javax.swing.JLabel();
        lblMoniSam15 = new javax.swing.JLabel();
        lblMoniDell15 = new javax.swing.JLabel();
        lblMoniDell17 = new javax.swing.JLabel();
        lblRam4 = new javax.swing.JLabel();
        lblRam8 = new javax.swing.JLabel();
        lblRam16 = new javax.swing.JLabel();
        lblProcI7 = new javax.swing.JLabel();
        lblProcI9 = new javax.swing.JLabel();
        lblHdmi1 = new javax.swing.JLabel();
        lblHdmi3 = new javax.swing.JLabel();
        lblLapHp = new javax.swing.JLabel();
        lblLapLeno = new javax.swing.JLabel();
        lblSd = new javax.swing.JLabel();
        lblLapToshi = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtlapdell = new javax.swing.JTextField();
        txtlapimac = new javax.swing.JTextField();
        txtusb4 = new javax.swing.JTextField();
        txtusb8 = new javax.swing.JTextField();
        txtusb16 = new javax.swing.JTextField();
        txtusb32 = new javax.swing.JTextField();
        txttera = new javax.swing.JTextField();
        txtdiscodu = new javax.swing.JTextField();
        txtadapusb = new javax.swing.JTextField();
        txtmoual = new javax.swing.JTextField();
        txtmouinal = new javax.swing.JTextField();
        txttecal = new javax.swing.JTextField();
        txttecinal = new javax.swing.JTextField();
        txtaudsonal = new javax.swing.JTextField();
        txtaudsoninal = new javax.swing.JTextField();
        txtaudsamal = new javax.swing.JTextField();
        txtaudsaminal = new javax.swing.JTextField();
        txtaudbeats = new javax.swing.JTextField();
        txtmonisam17 = new javax.swing.JTextField();
        txtmonisam15 = new javax.swing.JTextField();
        txtmonidell15 = new javax.swing.JTextField();
        txtmonidell17 = new javax.swing.JTextField();
        txtram4 = new javax.swing.JTextField();
        txtram8 = new javax.swing.JTextField();
        txtram16 = new javax.swing.JTextField();
        txtproci7 = new javax.swing.JTextField();
        txtproci9 = new javax.swing.JTextField();
        txthdmi1 = new javax.swing.JTextField();
        txthdmi3 = new javax.swing.JTextField();
        txtlaphp = new javax.swing.JTextField();
        txtlapleno = new javax.swing.JTextField();
        txtsd = new javax.swing.JTextField();
        txtlaptoshi = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        lbllapdell_1 = new javax.swing.JLabel();
        lbllapimac_1 = new javax.swing.JLabel();
        lblusb4_1 = new javax.swing.JLabel();
        lblusb8_1 = new javax.swing.JLabel();
        lblusb16_1 = new javax.swing.JLabel();
        lblusb32_1 = new javax.swing.JLabel();
        lbltera_1 = new javax.swing.JLabel();
        lbldiscodur_1 = new javax.swing.JLabel();
        lbladapusb_1 = new javax.swing.JLabel();
        lblmoual_1 = new javax.swing.JLabel();
        lblmouinal_1 = new javax.swing.JLabel();
        lbltecal_1 = new javax.swing.JLabel();
        lbltecinal_1 = new javax.swing.JLabel();
        lblaudsonal_1 = new javax.swing.JLabel();
        lblaudsoninal_1 = new javax.swing.JLabel();
        lblaudsamal_1 = new javax.swing.JLabel();
        lblaudsaminal_1 = new javax.swing.JLabel();
        lblaudbeats_1 = new javax.swing.JLabel();
        lblmonisam17_1 = new javax.swing.JLabel();
        lblmonisam15_1 = new javax.swing.JLabel();
        lblmonidell15_1 = new javax.swing.JLabel();
        lblmonidell17_1 = new javax.swing.JLabel();
        lblram4_1 = new javax.swing.JLabel();
        lblram8_1 = new javax.swing.JLabel();
        lblram16_1 = new javax.swing.JLabel();
        lblproci7_1 = new javax.swing.JLabel();
        lblproci9_1 = new javax.swing.JLabel();
        lblhdmi1_1 = new javax.swing.JLabel();
        lblhdmi3_1 = new javax.swing.JLabel();
        lbllaphp_1 = new javax.swing.JLabel();
        lbllapleno_1 = new javax.swing.JLabel();
        lblsd_1 = new javax.swing.JLabel();
        lbllaptoshi_1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbllapdell_v = new javax.swing.JLabel();
        lbllapimac_v = new javax.swing.JLabel();
        lblusb4_v = new javax.swing.JLabel();
        lblusb8_v = new javax.swing.JLabel();
        lblusb16_v = new javax.swing.JLabel();
        lblusb32_v = new javax.swing.JLabel();
        lbltera_v = new javax.swing.JLabel();
        lbldiscodur_v = new javax.swing.JLabel();
        lbladapusb_v = new javax.swing.JLabel();
        lblmoual_v = new javax.swing.JLabel();
        lblmouinal_v = new javax.swing.JLabel();
        lbltecal_v = new javax.swing.JLabel();
        lbltecinal_v = new javax.swing.JLabel();
        lblaudsonal_v = new javax.swing.JLabel();
        lblaudsoninal_v = new javax.swing.JLabel();
        lblaudsamal_v = new javax.swing.JLabel();
        lblaudsaminal_v = new javax.swing.JLabel();
        lblaudbeats_v = new javax.swing.JLabel();
        lblmonisam17_v = new javax.swing.JLabel();
        lblmonisam15_v = new javax.swing.JLabel();
        lblmonidell15_v = new javax.swing.JLabel();
        lblmonidell17_v = new javax.swing.JLabel();
        lblram4_v = new javax.swing.JLabel();
        lblram8_v = new javax.swing.JLabel();
        lblram16_v = new javax.swing.JLabel();
        lblproci7_v = new javax.swing.JLabel();
        lblproci9_v = new javax.swing.JLabel();
        lblhdmi1_v = new javax.swing.JLabel();
        lblhdmi3_v = new javax.swing.JLabel();
        lbllaphp_v = new javax.swing.JLabel();
        lbllapleno_v = new javax.swing.JLabel();
        lblsd_v = new javax.swing.JLabel();
        lbllaptoshi_v = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 70, 20));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INVENTARIO");
        jPanel1.add(jLabel1);

        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setPreferredSize(new java.awt.Dimension(550, 600));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

        jPanel6.setLayout(new java.awt.GridLayout(0, 1));

        lblLapDell.setText("LAPTOP DELL");
        jPanel6.add(lblLapDell);

        lblLapImac.setText("LAPTOP Imac");
        jPanel6.add(lblLapImac);

        lblUsb4.setText("USB 4");
        jPanel6.add(lblUsb4);

        lblUsb8.setText("USB 8");
        jPanel6.add(lblUsb8);

        lblUsb16.setText("USB 16");
        jPanel6.add(lblUsb16);

        lblUsb32.setText("USB 32");
        jPanel6.add(lblUsb32);

        lblTera.setText("TERABYTE");
        jPanel6.add(lblTera);

        lblDiscDu.setText("DISCO DURO");
        jPanel6.add(lblDiscDu);

        lblAdapUsb.setText("ADAPTADOR USB");
        jPanel6.add(lblAdapUsb);

        lblMouAl.setText("MOUSE AL");
        jPanel6.add(lblMouAl);

        lblMouInal.setText("MOUSE INAL");
        jPanel6.add(lblMouInal);

        lblTecAl.setText("TECLADO AL");
        jPanel6.add(lblTecAl);

        lblTecInal.setText("TECLADO INAL");
        jPanel6.add(lblTecInal);

        lblAudSonAl.setText("AUDIFONOS SONY AL");
        jPanel6.add(lblAudSonAl);

        lblAudSonInal.setText("AUDIFONOS SONY INAL");
        jPanel6.add(lblAudSonInal);

        lblAudSamAl.setText("AUDIFONOS SAMSUNG AL");
        jPanel6.add(lblAudSamAl);

        lblAudSamInal.setText("AUDIFONOS SAMSUNG INAL");
        jPanel6.add(lblAudSamInal);

        lblAudBeats.setText("AUDIFONOS BEATS");
        jPanel6.add(lblAudBeats);

        lblMoniSam17.setText("MONITOR SAMSUNG 17");
        jPanel6.add(lblMoniSam17);

        lblMoniSam15.setText("MONITOR SAMSUNG 15");
        jPanel6.add(lblMoniSam15);

        lblMoniDell15.setText("MONITOR DELL 15");
        jPanel6.add(lblMoniDell15);

        lblMoniDell17.setText("MONITOR DELL 17");
        jPanel6.add(lblMoniDell17);

        lblRam4.setText("MEMORIA RAM 4 GB");
        jPanel6.add(lblRam4);

        lblRam8.setText("MEMORIA RAM 8 GB");
        jPanel6.add(lblRam8);

        lblRam16.setText("MEMORIA RAM 16 GB");
        jPanel6.add(lblRam16);

        lblProcI7.setText("PROCESADOR I7");
        jPanel6.add(lblProcI7);

        lblProcI9.setText("PROCESADOR I9");
        jPanel6.add(lblProcI9);

        lblHdmi1.setText("CABLE HDMI 1M");
        jPanel6.add(lblHdmi1);

        lblHdmi3.setText("CABLE HDMI 3M");
        jPanel6.add(lblHdmi3);

        lblLapHp.setText("Laptop HP");
        jPanel6.add(lblLapHp);

        lblLapLeno.setText("Laptop LENOVO");
        jPanel6.add(lblLapLeno);

        lblSd.setText("MICRO SD 4 GB");
        jPanel6.add(lblSd);

        lblLapToshi.setText("Laptop TOSHIBA");
        jPanel6.add(lblLapToshi);

        jPanel4.add(jPanel6);

        jPanel7.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jPanel7.setLayout(new java.awt.GridLayout(0, 1));

        txtlapdell.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtlapdell.setText("0");
        txtlapdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlapdellActionPerformed(evt);
            }
        });
        jPanel7.add(txtlapdell);

        txtlapimac.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtlapimac.setText("0");
        txtlapimac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlapimacActionPerformed(evt);
            }
        });
        jPanel7.add(txtlapimac);

        txtusb4.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtusb4.setText("0");
        jPanel7.add(txtusb4);

        txtusb8.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtusb8.setText("0");
        jPanel7.add(txtusb8);

        txtusb16.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtusb16.setText("0");
        jPanel7.add(txtusb16);

        txtusb32.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtusb32.setText("0");
        jPanel7.add(txtusb32);

        txttera.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txttera.setText("0");
        jPanel7.add(txttera);

        txtdiscodu.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtdiscodu.setText("0");
        jPanel7.add(txtdiscodu);

        txtadapusb.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtadapusb.setText("0");
        jPanel7.add(txtadapusb);

        txtmoual.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtmoual.setText("0");
        jPanel7.add(txtmoual);

        txtmouinal.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtmouinal.setText("0");
        jPanel7.add(txtmouinal);

        txttecal.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txttecal.setText("0");
        jPanel7.add(txttecal);

        txttecinal.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txttecinal.setText("0");
        jPanel7.add(txttecinal);

        txtaudsonal.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtaudsonal.setText("0");
        jPanel7.add(txtaudsonal);

        txtaudsoninal.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtaudsoninal.setText("0");
        jPanel7.add(txtaudsoninal);

        txtaudsamal.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtaudsamal.setText("0");
        jPanel7.add(txtaudsamal);

        txtaudsaminal.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtaudsaminal.setText("0");
        jPanel7.add(txtaudsaminal);

        txtaudbeats.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtaudbeats.setText("0");
        jPanel7.add(txtaudbeats);

        txtmonisam17.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtmonisam17.setText("0");
        jPanel7.add(txtmonisam17);

        txtmonisam15.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtmonisam15.setText("0");
        jPanel7.add(txtmonisam15);

        txtmonidell15.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtmonidell15.setText("0");
        jPanel7.add(txtmonidell15);

        txtmonidell17.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtmonidell17.setText("0");
        jPanel7.add(txtmonidell17);

        txtram4.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtram4.setText("0");
        jPanel7.add(txtram4);

        txtram8.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtram8.setText("0");
        jPanel7.add(txtram8);

        txtram16.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtram16.setText("0");
        jPanel7.add(txtram16);

        txtproci7.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtproci7.setText("0");
        jPanel7.add(txtproci7);

        txtproci9.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtproci9.setText("0");
        jPanel7.add(txtproci9);

        txthdmi1.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txthdmi1.setText("0");
        jPanel7.add(txthdmi1);

        txthdmi3.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txthdmi3.setText("0");
        jPanel7.add(txthdmi3);

        txtlaphp.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtlaphp.setText("0");
        jPanel7.add(txtlaphp);

        txtlapleno.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtlapleno.setText("0");
        jPanel7.add(txtlapleno);

        txtsd.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtsd.setText("0");
        jPanel7.add(txtsd);

        txtlaptoshi.setFont(new java.awt.Font("Dialog", 0, 6)); // NOI18N
        txtlaptoshi.setText("0");
        jPanel7.add(txtlaptoshi);

        jPanel4.add(jPanel7);

        jPanel8.setLayout(new java.awt.GridLayout(0, 1));

        lbllapdell_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbllapdell_1);

        lbllapimac_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbllapimac_1);

        lblusb4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblusb4_1);

        lblusb8_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblusb8_1);

        lblusb16_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblusb16_1);

        lblusb32_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblusb32_1);

        lbltera_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbltera_1);

        lbldiscodur_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbldiscodur_1);

        lbladapusb_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbladapusb_1);

        lblmoual_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblmoual_1);

        lblmouinal_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblmouinal_1);

        lbltecal_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbltecal_1);

        lbltecinal_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbltecinal_1);

        lblaudsonal_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblaudsonal_1);

        lblaudsoninal_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblaudsoninal_1);

        lblaudsamal_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblaudsamal_1);

        lblaudsaminal_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblaudsaminal_1);

        lblaudbeats_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblaudbeats_1);

        lblmonisam17_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblmonisam17_1);

        lblmonisam15_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblmonisam15_1);

        lblmonidell15_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblmonidell15_1);

        lblmonidell17_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblmonidell17_1);

        lblram4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblram4_1);

        lblram8_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblram8_1);

        lblram16_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblram16_1);

        lblproci7_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblproci7_1);

        lblproci9_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblproci9_1);

        lblhdmi1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblhdmi1_1);

        lblhdmi3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblhdmi3_1);

        lbllaphp_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbllaphp_1);

        lbllapleno_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbllapleno_1);

        lblsd_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lblsd_1);

        lbllaptoshi_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(lbllaptoshi_1);

        jPanel4.add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(0, 1));

        lbllapdell_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lbllapdell_v);

        lbllapimac_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lbllapimac_v);

        lblusb4_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblusb4_v);

        lblusb8_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblusb8_v);

        lblusb16_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblusb16_v);

        lblusb32_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblusb32_v);

        lbltera_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lbltera_v);

        lbldiscodur_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lbldiscodur_v);

        lbladapusb_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lbladapusb_v);

        lblmoual_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblmoual_v);

        lblmouinal_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblmouinal_v);

        lbltecal_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lbltecal_v);

        lbltecinal_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lbltecinal_v);

        lblaudsonal_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblaudsonal_v);

        lblaudsoninal_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblaudsoninal_v);

        lblaudsamal_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblaudsamal_v);

        lblaudsaminal_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblaudsaminal_v);

        lblaudbeats_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblaudbeats_v);

        lblmonisam17_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblmonisam17_v);

        lblmonisam15_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblmonisam15_v);

        lblmonidell15_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblmonidell15_v);

        lblmonidell17_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblmonidell17_v);

        lblram4_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblram4_v);

        lblram8_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblram8_v);

        lblram16_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblram16_v);

        lblproci7_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblproci7_v);

        lblproci9_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblproci9_v);

        lblhdmi1_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblhdmi1_v);

        lblhdmi3_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblhdmi3_v);

        lbllaphp_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lbllaphp_v);

        lbllapleno_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lbllapleno_v);

        lblsd_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lblsd_v);

        lbllaptoshi_v.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(lbllaptoshi_v);

        jPanel4.add(jPanel9);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 40, 0));
        jPanel5.add(jLabel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cantidad en mano");
        jPanel5.add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cantidad ideal");
        jPanel5.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Variación");
        jPanel5.add(jLabel5);

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtlapdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlapdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlapdellActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LAPDELL();
        LAPIMAC();
        USB4();
        USB8();
        USB16();
        USB32();
        TERA();
        DISCO();
        ADPUSB();
        MOUSEAL();
        MOUSEIN();
        TECAL();
        TECIN();
        AUDSONAL();
        AUDSONIN();
        AUDSAMAL();
        AUDSAMIN();
        AUDBE();
        MONSAM15();
        MONSAM17();
        MONDELL15();
        MONDELL17();
        RAM4();
        RAM8();
        RAM16();
        I7();
        I9();
        HDMI1();
        HDMI3();
        LAPHP();
        LAPLENOVO();
        SD4();
        LAPTOSH();
        calcularDiferencia();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtlapimacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlapimacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlapimacActionPerformed

    public void calcularDiferencia() {
        int produ1_1 = Integer.parseInt(txtlapdell.getText());
        int produ2_1 = Integer.parseInt(txtlapimac.getText());
        int produ3_1 = Integer.parseInt(txtusb4.getText());
        int produ4_1 = Integer.parseInt(txtusb8.getText());
        int produ5_1 = Integer.parseInt(txtusb16.getText());
        int produ6_1 = Integer.parseInt(txtusb32.getText());
        int produ7_1 = Integer.parseInt(txttera.getText());
        int produ8_1 = Integer.parseInt(txtdiscodu.getText());
        int produ9_1 = Integer.parseInt(txtadapusb.getText());
        int produ10_1 = Integer.parseInt(txtmoual.getText());
        int produ11_1 = Integer.parseInt(txtmouinal.getText());
        int produ12_1 = Integer.parseInt(txttecal.getText());
        int produ13_1 = Integer.parseInt(txttecinal.getText());
        int produ14_1 = Integer.parseInt(txtaudsonal.getText());
        int produ15_1 = Integer.parseInt(txtaudsoninal.getText());
        int produ16_1 = Integer.parseInt(txtaudsamal.getText());
        int produ17_1 = Integer.parseInt(txtaudsaminal.getText());
        int produ18_1 = Integer.parseInt(txtaudbeats.getText());
        int produ19_1 = Integer.parseInt(txtmonisam17.getText());
        int produ20_1 = Integer.parseInt(txtmonisam15.getText());
        int produ21_1 = Integer.parseInt(txtmonidell15.getText());
        int produ22_1 = Integer.parseInt(txtmonidell17.getText());
        int produ23_1 = Integer.parseInt(txtram4.getText());
        int produ24_1 = Integer.parseInt(txtram8.getText());
        int produ25_1 = Integer.parseInt(txtram16.getText());
        int produ26_1 = Integer.parseInt(txtproci7.getText());
        int produ27_1 = Integer.parseInt(txtproci9.getText());
        int produ28_1 = Integer.parseInt(txthdmi1.getText());
        int produ29_1 = Integer.parseInt(txthdmi3.getText());
        int produ30_1 = Integer.parseInt(txtlaphp.getText());
        int produ31_1 = Integer.parseInt(txtlapleno.getText());
        int produ32_1 = Integer.parseInt(txtsd.getText());
        int produ33_1 = Integer.parseInt(txtlaptoshi.getText());

        int produ1_2 = Integer.parseInt(lbllapdell_1.getText());
        int produ2_2 = Integer.parseInt(lbllapimac_1.getText());
        int produ3_2 = Integer.parseInt(lblusb4_1.getText());
        int produ4_2 = Integer.parseInt(lblusb8_1.getText());
        int produ5_2 = Integer.parseInt(lblusb16_1.getText());
        int produ6_2 = Integer.parseInt(lblusb32_1.getText());
        int produ7_2 = Integer.parseInt(lbltera_1.getText());
        int produ8_2 = Integer.parseInt(lbldiscodur_1.getText());
        int produ9_2 = Integer.parseInt(lbladapusb_1.getText());
        int produ10_2 = Integer.parseInt(lblmoual_1.getText());
        int produ11_2 = Integer.parseInt(lblmouinal_1.getText());
        int produ12_2 = Integer.parseInt(lbltecal_1.getText());
        int produ13_2 = Integer.parseInt(lbltecinal_1.getText());
        int produ14_2 = Integer.parseInt(lblaudsonal_1.getText());
        int produ15_2 = Integer.parseInt(lblaudsoninal_1.getText());
        int produ16_2 = Integer.parseInt(txtaudsamal.getText());
        int produ17_2 = Integer.parseInt(lblaudsaminal_1.getText());
        int produ18_2 = Integer.parseInt(lblaudbeats_1.getText());
        int produ19_2 = Integer.parseInt(lblmonisam17_1.getText());
        int produ20_2 = Integer.parseInt(lblmonisam15_1.getText());
        int produ21_2 = Integer.parseInt(lblmonidell15_1.getText());
        int produ22_2 = Integer.parseInt(lblmonidell17_1.getText());
        int produ23_2 = Integer.parseInt(lblram4_1.getText());
        int produ24_2 = Integer.parseInt(lblram8_1.getText());
        int produ25_2 = Integer.parseInt(lblram16_1.getText());
        int produ26_2 = Integer.parseInt(lblproci7_1.getText());
        int produ27_2 = Integer.parseInt(lblproci9_1.getText());
        int produ28_2 = Integer.parseInt(lblhdmi1_1.getText());
        int produ29_2 = Integer.parseInt(lblhdmi3_1.getText());
        int produ30_2 = Integer.parseInt(lbllaphp_1.getText());
        int produ31_2 = Integer.parseInt(lbllapleno_1.getText());
        int produ32_2 = Integer.parseInt(lblsd_1.getText());
        int produ33_2 = Integer.parseInt(lbllaptoshi_1.getText());

        int resu1 = produ1_1 - produ1_2;
        int resu2 = produ2_1 - produ2_2;
        int resu3 = produ3_1 - produ3_2;
        int resu4 = produ4_1 - produ4_2;
        int resu5 = produ5_1 - produ5_2;
        int resu6 = produ6_1 - produ6_2;
        int resu7 = produ7_1 - produ7_2;
        int resu8 = produ8_1 - produ8_2;
        int resu9 = produ9_1 - produ9_2;
        int resu10 = produ10_1 - produ10_2;
        int resu11 = produ11_1 - produ11_2;
        int resu12 = produ12_1 - produ12_2;
        int resu13 = produ13_1 - produ13_2;
        int resu14 = produ14_1 - produ14_2;
        int resu15 = produ15_1 - produ15_2;
        int resu16 = produ16_1 - produ16_2;
        int resu17 = produ17_1 - produ17_2;
        int resu18 = produ18_1 - produ18_2;
        int resu19 = produ19_1 - produ19_2;
        int resu20 = produ20_1 - produ20_2;
        int resu21 = produ21_1 - produ21_2;
        int resu22 = produ22_1 - produ22_2;
        int resu23 = produ23_1 - produ23_2;
        int resu24 = produ24_1 - produ24_2;
        int resu25 = produ25_1 - produ25_2;
        int resu26 = produ26_1 - produ26_2;
        int resu27 = produ27_1 - produ27_2;
        int resu28 = produ28_1 - produ28_2;
        int resu29 = produ29_1 - produ29_2;
        int resu30 = produ30_1 - produ30_2;
        int resu31 = produ31_1 - produ31_2;
        int resu32 = produ32_1 - produ32_2;
        int resu33 = produ33_1 - produ33_2;

        String sResu1 = Integer.toString(resu1);
        String sResu2 = Integer.toString(resu2);
        String sResu3 = Integer.toString(resu3);
        String sResu4 = Integer.toString(resu4);
        String sResu5 = Integer.toString(resu5);
        String sResu6 = Integer.toString(resu6);
        String sResu7 = Integer.toString(resu7);
        String sResu8 = Integer.toString(resu8);
        String sResu9 = Integer.toString(resu9);
        String sResu10 = Integer.toString(resu10);
        String sResu11 = Integer.toString(resu11);
        String sResu12 = Integer.toString(resu12);
        String sResu13 = Integer.toString(resu13);
        String sResu14 = Integer.toString(resu14);
        String sResu15 = Integer.toString(resu15);
        String sResu16 = Integer.toString(resu16);
        String sResu17 = Integer.toString(resu17);
        String sResu18 = Integer.toString(resu18);
        String sResu19 = Integer.toString(resu19);
        String sResu20 = Integer.toString(resu20);
        String sResu21 = Integer.toString(resu21);
        String sResu22 = Integer.toString(resu22);
        String sResu23 = Integer.toString(resu23);
        String sResu24 = Integer.toString(resu24);
        String sResu25 = Integer.toString(resu25);
        String sResu26 = Integer.toString(resu26);
        String sResu27 = Integer.toString(resu27);
        String sResu28 = Integer.toString(resu28);
        String sResu29 = Integer.toString(resu29);
        String sResu30 = Integer.toString(resu30);
        String sResu31 = Integer.toString(resu31);
        String sResu32 = Integer.toString(resu32);
        String sResu33 = Integer.toString(resu33);

        lbllapdell_v.setText(sResu1);
        lbllapimac_v.setText(sResu2);
        lblusb4_v.setText(sResu3);
        lblusb8_v.setText(sResu4);
        lblusb16_v.setText(sResu5);
        lblusb32_v.setText(sResu6);
        lbltera_v.setText(sResu7);
        lbldiscodur_v.setText(sResu8);
        lbladapusb_v.setText(sResu9);
        lblmoual_v.setText(sResu10);
        lblmouinal_v.setText(sResu11);
        lbltecal_v.setText(sResu12);
        lbltecinal_v.setText(sResu13);
        lblaudsonal_v.setText(sResu14);
        lblaudsoninal_v.setText(sResu15);
        lblaudsamal_v.setText(sResu16);
        lblaudsaminal_v.setText(sResu17);
        lblaudbeats_v.setText(sResu18);
        lblmonisam17_v.setText(sResu19);
        lblmonisam15_v.setText(sResu20);
        lblmonidell15_v.setText(sResu21);
        lblmonidell17_v.setText(sResu22);
        lblram4_v.setText(sResu23);
        lblram8_v.setText(sResu24);
        lblram16_v.setText(sResu25);
        lblproci7_v.setText(sResu26);
        lblproci9_v.setText(sResu27);
        lblhdmi1_v.setText(sResu28);
        lblhdmi3_v.setText(sResu29);
        lbllaphp_v.setText(sResu30);
        lbllapleno_v.setText(sResu31);
        lblsd_v.setText(sResu32);
        lbllaptoshi_v.setText(sResu33);
    }
    
    public void ponerEnCeros(){
        
    }

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
            java.util.logging.Logger.getLogger(Invent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdapUsb;
    private javax.swing.JLabel lblAudBeats;
    private javax.swing.JLabel lblAudSamAl;
    private javax.swing.JLabel lblAudSamInal;
    private javax.swing.JLabel lblAudSonAl;
    private javax.swing.JLabel lblAudSonInal;
    private javax.swing.JLabel lblDiscDu;
    private javax.swing.JLabel lblHdmi1;
    private javax.swing.JLabel lblHdmi3;
    private javax.swing.JLabel lblLapDell;
    private javax.swing.JLabel lblLapHp;
    private javax.swing.JLabel lblLapImac;
    private javax.swing.JLabel lblLapLeno;
    private javax.swing.JLabel lblLapToshi;
    private javax.swing.JLabel lblMoniDell15;
    private javax.swing.JLabel lblMoniDell17;
    private javax.swing.JLabel lblMoniSam15;
    private javax.swing.JLabel lblMoniSam17;
    private javax.swing.JLabel lblMouAl;
    private javax.swing.JLabel lblMouInal;
    private javax.swing.JLabel lblProcI7;
    private javax.swing.JLabel lblProcI9;
    private javax.swing.JLabel lblRam16;
    private javax.swing.JLabel lblRam4;
    private javax.swing.JLabel lblRam8;
    private javax.swing.JLabel lblSd;
    private javax.swing.JLabel lblTecAl;
    private javax.swing.JLabel lblTecInal;
    private javax.swing.JLabel lblTera;
    private javax.swing.JLabel lblUsb16;
    private javax.swing.JLabel lblUsb32;
    private javax.swing.JLabel lblUsb4;
    private javax.swing.JLabel lblUsb8;
    private javax.swing.JLabel lbladapusb_1;
    private javax.swing.JLabel lbladapusb_v;
    private javax.swing.JLabel lblaudbeats_1;
    private javax.swing.JLabel lblaudbeats_v;
    private javax.swing.JLabel lblaudsamal_1;
    private javax.swing.JLabel lblaudsamal_v;
    private javax.swing.JLabel lblaudsaminal_1;
    private javax.swing.JLabel lblaudsaminal_v;
    private javax.swing.JLabel lblaudsonal_1;
    private javax.swing.JLabel lblaudsonal_v;
    private javax.swing.JLabel lblaudsoninal_1;
    private javax.swing.JLabel lblaudsoninal_v;
    private javax.swing.JLabel lbldiscodur_1;
    private javax.swing.JLabel lbldiscodur_v;
    private javax.swing.JLabel lblhdmi1_1;
    private javax.swing.JLabel lblhdmi1_v;
    private javax.swing.JLabel lblhdmi3_1;
    private javax.swing.JLabel lblhdmi3_v;
    private javax.swing.JLabel lbllapdell_1;
    private javax.swing.JLabel lbllapdell_v;
    private javax.swing.JLabel lbllaphp_1;
    private javax.swing.JLabel lbllaphp_v;
    private javax.swing.JLabel lbllapimac_1;
    private javax.swing.JLabel lbllapimac_v;
    private javax.swing.JLabel lbllapleno_1;
    private javax.swing.JLabel lbllapleno_v;
    private javax.swing.JLabel lbllaptoshi_1;
    private javax.swing.JLabel lbllaptoshi_v;
    private javax.swing.JLabel lblmonidell15_1;
    private javax.swing.JLabel lblmonidell15_v;
    private javax.swing.JLabel lblmonidell17_1;
    private javax.swing.JLabel lblmonidell17_v;
    private javax.swing.JLabel lblmonisam15_1;
    private javax.swing.JLabel lblmonisam15_v;
    private javax.swing.JLabel lblmonisam17_1;
    private javax.swing.JLabel lblmonisam17_v;
    private javax.swing.JLabel lblmoual_1;
    private javax.swing.JLabel lblmoual_v;
    private javax.swing.JLabel lblmouinal_1;
    private javax.swing.JLabel lblmouinal_v;
    private javax.swing.JLabel lblproci7_1;
    private javax.swing.JLabel lblproci7_v;
    private javax.swing.JLabel lblproci9_1;
    private javax.swing.JLabel lblproci9_v;
    private javax.swing.JLabel lblram16_1;
    private javax.swing.JLabel lblram16_v;
    private javax.swing.JLabel lblram4_1;
    private javax.swing.JLabel lblram4_v;
    private javax.swing.JLabel lblram8_1;
    private javax.swing.JLabel lblram8_v;
    private javax.swing.JLabel lblsd_1;
    private javax.swing.JLabel lblsd_v;
    private javax.swing.JLabel lbltecal_1;
    private javax.swing.JLabel lbltecal_v;
    private javax.swing.JLabel lbltecinal_1;
    private javax.swing.JLabel lbltecinal_v;
    private javax.swing.JLabel lbltera_1;
    private javax.swing.JLabel lbltera_v;
    private javax.swing.JLabel lblusb16_1;
    private javax.swing.JLabel lblusb16_v;
    private javax.swing.JLabel lblusb32_1;
    private javax.swing.JLabel lblusb32_v;
    private javax.swing.JLabel lblusb4_1;
    private javax.swing.JLabel lblusb4_v;
    private javax.swing.JLabel lblusb8_1;
    private javax.swing.JLabel lblusb8_v;
    private javax.swing.JTextField txtadapusb;
    private javax.swing.JTextField txtaudbeats;
    private javax.swing.JTextField txtaudsamal;
    private javax.swing.JTextField txtaudsaminal;
    private javax.swing.JTextField txtaudsonal;
    private javax.swing.JTextField txtaudsoninal;
    private javax.swing.JTextField txtdiscodu;
    private javax.swing.JTextField txthdmi1;
    private javax.swing.JTextField txthdmi3;
    private javax.swing.JTextField txtlapdell;
    private javax.swing.JTextField txtlaphp;
    private javax.swing.JTextField txtlapimac;
    private javax.swing.JTextField txtlapleno;
    private javax.swing.JTextField txtlaptoshi;
    private javax.swing.JTextField txtmonidell15;
    private javax.swing.JTextField txtmonidell17;
    private javax.swing.JTextField txtmonisam15;
    private javax.swing.JTextField txtmonisam17;
    private javax.swing.JTextField txtmoual;
    private javax.swing.JTextField txtmouinal;
    private javax.swing.JTextField txtproci7;
    private javax.swing.JTextField txtproci9;
    private javax.swing.JTextField txtram16;
    private javax.swing.JTextField txtram4;
    private javax.swing.JTextField txtram8;
    private javax.swing.JTextField txtsd;
    private javax.swing.JTextField txttecal;
    private javax.swing.JTextField txttecinal;
    private javax.swing.JTextField txttera;
    private javax.swing.JTextField txtusb16;
    private javax.swing.JTextField txtusb32;
    private javax.swing.JTextField txtusb4;
    private javax.swing.JTextField txtusb8;
    // End of variables declaration//GEN-END:variables
}
