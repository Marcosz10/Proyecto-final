/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista.estudianteAdmin;

import ec.edu.ister.controlador.Coordinador;

/**
 *
 * @author Marcos Carrera
 */
public class EliminarEstudiantes extends javax.swing.JPanel {
    Coordinador coordinador;
    /**
     * Creates new form EliminarEstudiantes
     */
    public EliminarEstudiantes(Coordinador coordinador) {
        initComponents();
        this.coordinador =coordinador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        Escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("RELOJ");
        Escritorio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 36, -1, -1));

        jLabel5.setText("tlf");
        Escritorio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 224, -1, -1));

        jLabel1.setText("ELIMINAR ESTUDIANTES");
        Escritorio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 4, -1, -1));

        jButton3.setText("ELIMINAR");
        Escritorio.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 349, -1, -1));
        Escritorio.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 86, 160, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDULA\t", "PASAPORTE", " " }));
        Escritorio.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 86, -1, -1));
        Escritorio.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 221, 160, -1));

        jLabel2.setText("Nombre");
        Escritorio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 120, -1, -1));

        jLabel8.setText("Carga Horaria");
        Escritorio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 288, -1, -1));

        jLabel3.setText("Apellido");
        Escritorio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 146, -1, -1));
        Escritorio.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 285, 160, -1));

        jLabel6.setText("e-mail");
        Escritorio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 250, -1, -1));
        Escritorio.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 192, 160, -1));
        Escritorio.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 247, 160, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoSinBase.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        Escritorio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, 264, -1));
        Escritorio.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 117, 160, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoSinFonfoRumi.png"))); // NOI18N
        Escritorio.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 117, -1, -1));

        jLabel4.setText("Fecha de nacimiento");
        Escritorio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 192, -1, -1));
        Escritorio.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 143, 160, -1));

        jButton1.setText("LIMPIAR");
        Escritorio.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 349, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
