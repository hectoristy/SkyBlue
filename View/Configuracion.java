/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Marleny Pena Tavarez
 */
public class Configuracion extends javax.swing.JPanel {

    /**
     * Creates new form Configuracion
     */
    public Configuracion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passwordConfirm = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        fechaNacDC = new com.toedter.calendar.JDateChooser();
        cedulaTXT = new javax.swing.JTextField();
        telefonoTXT = new javax.swing.JTextField();
        direccionTXT = new javax.swing.JTextField();
        paisCB = new javax.swing.JComboBox();
        ciudadCB = new javax.swing.JComboBox();
        apellidoTXT = new javax.swing.JTextField();
        nombreTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        actualizarInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        emailTXT = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TNumero = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TFVencimiento = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        TCodigo = new javax.swing.JTextField();
        TTramitada = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(690, 380));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(690, 380));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Apellido");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Pais");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Direccion");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Telefono");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Cedula");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Fecha de Nacimiento");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Contraseña");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Confirmar contraseña");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));
        add(passwordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 204, 25));
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 204, 25));

        fechaNacDC.setDateFormatString("yyyy-MM-dd");
        fechaNacDC.setOpaque(false);
        add(fechaNacDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 140, 25));
        add(cedulaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 204, 25));
        add(telefonoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 204, 25));
        add(direccionTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 204, 25));

        add(paisCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 130, -1));

        add(ciudadCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 130, -1));
        add(apellidoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 204, 25));
        add(nombreTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 204, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ciudad");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        actualizarInfo.setText("Actualizar Informacion");
        add(actualizarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\SkyBlue\\src\\Botones\\ConfiguracionTittle.png")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 240, 60));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Email");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));
        add(emailTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 204, 25));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Numero de Tarjeta de credito");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        add(TNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Fecha de vencimiento");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        TFVencimiento.setOpaque(false);
        add(TFVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 160, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("CVV");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));
        add(TCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 50, -1));

        add(TTramitada, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 90, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Tramitada por:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField TCodigo;
    public com.toedter.calendar.JDateChooser TFVencimiento;
    public javax.swing.JTextField TNumero;
    public javax.swing.JComboBox TTramitada;
    public javax.swing.JButton actualizarInfo;
    public javax.swing.JTextField apellidoTXT;
    public javax.swing.JTextField cedulaTXT;
    public javax.swing.JComboBox ciudadCB;
    public javax.swing.JTextField direccionTXT;
    public javax.swing.JTextField emailTXT;
    public com.toedter.calendar.JDateChooser fechaNacDC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JTextField nombreTXT;
    public javax.swing.JComboBox paisCB;
    public javax.swing.JPasswordField password;
    public javax.swing.JPasswordField passwordConfirm;
    public javax.swing.JTextField telefonoTXT;
    // End of variables declaration//GEN-END:variables
}
