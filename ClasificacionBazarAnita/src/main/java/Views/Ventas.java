package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventas extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesión
     */
    public Ventas() {
        initComponents();
        
        jBProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                    dispose();
                    Productos pro = new Productos();
                    pro.setLocationRelativeTo(null);
                    pro.setVisible(true);
            }
        });

        jBClasificaciónABC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                    dispose();
                    ClasificacionABC clasi = new ClasificacionABC();
                    clasi.setLocationRelativeTo(null);
                    clasi.setVisible(true);
            }
        });

        jBVentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                Ventas ven = new Ventas();
                ven.setLocationRelativeTo(null);
                ven.setVisible(true);

            }
        });

        jBGenerarInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                    dispose();
                    GenerarInformes genI = new GenerarInformes();
                    genI.setLocationRelativeTo(null);
                    genI.setVisible(true);
            }
        });
        JBAgregarP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                    dispose();
                    AgregarProductos agre = new AgregarProductos();
                    agre.setLocationRelativeTo(null);
                    agre.setVisible(true);
            }
        });  
        
        jBSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                    dispose();
                    IniciarSesión login = new IniciarSesión();
                    login.setLocationRelativeTo(null);
                    login.setVisible(true);
            }
        });  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBSalir = new javax.swing.JButton();
        jBProductos = new javax.swing.JButton();
        jBClasificaciónABC = new javax.swing.JButton();
        jBVentas = new javax.swing.JButton();
        jBGenerarInfo = new javax.swing.JButton();
        JBNVen = new javax.swing.JButton();
        JBVenReal = new javax.swing.JButton();
        JBAgregarP = new javax.swing.JButton();
        jTNombClient = new javax.swing.JTextField();
        jThora = new javax.swing.JTextField();
        jTIDCliente = new javax.swing.JTextField();
        jTfecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1025, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\karen\\OneDrive\\Documentos\\Document\\CICLO VI\\Sistemas de Información II\\Producto\\Phosto_Clasificación\\Group 10087.png")); // NOI18N
        jBSalir.setBorder(null);
        jBSalir.setBorderPainted(false);
        jBSalir.setContentAreaFilled(false);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        jBProductos.setIcon(new javax.swing.ImageIcon("C:\\Users\\karen\\OneDrive\\Documentos\\Document\\CICLO VI\\Sistemas de Información II\\Producto\\Phosto_Clasificación\\Group 10119.png")); // NOI18N
        jBProductos.setBorder(null);
        jBProductos.setBorderPainted(false);
        jBProductos.setContentAreaFilled(false);
        jPanel1.add(jBProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jBClasificaciónABC.setIcon(new javax.swing.ImageIcon("C:\\Users\\karen\\OneDrive\\Documentos\\Document\\CICLO VI\\Sistemas de Información II\\Producto\\Phosto_Clasificación\\Group 10120.png")); // NOI18N
        jBClasificaciónABC.setBorder(null);
        jBClasificaciónABC.setBorderPainted(false);
        jBClasificaciónABC.setContentAreaFilled(false);
        jPanel1.add(jBClasificaciónABC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jBVentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\karen\\OneDrive\\Documentos\\Document\\CICLO VI\\Sistemas de Información II\\Producto\\Phosto_Clasificación\\Group 10093.png")); // NOI18N
        jBVentas.setBorder(null);
        jBVentas.setBorderPainted(false);
        jBVentas.setContentAreaFilled(false);
        jPanel1.add(jBVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jBGenerarInfo.setIcon(new javax.swing.ImageIcon("C:\\Users\\karen\\OneDrive\\Documentos\\Document\\CICLO VI\\Sistemas de Información II\\Producto\\Phosto_Clasificación\\Group 10121.png")); // NOI18N
        jBGenerarInfo.setBorder(null);
        jBGenerarInfo.setBorderPainted(false);
        jBGenerarInfo.setContentAreaFilled(false);
        jPanel1.add(jBGenerarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        JBNVen.setBackground(new java.awt.Color(173, 173, 173));
        JBNVen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBNVen.setForeground(new java.awt.Color(255, 255, 255));
        JBNVen.setText("Nueva venta");
        JBNVen.setBorder(null);
        JBNVen.setBorderPainted(false);
        JBNVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNVenActionPerformed(evt);
            }
        });
        jPanel1.add(JBNVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 180, 30));

        JBVenReal.setBackground(new java.awt.Color(173, 173, 173));
        JBVenReal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBVenReal.setForeground(new java.awt.Color(255, 255, 255));
        JBVenReal.setText("Venta realizada");
        JBVenReal.setToolTipText("");
        JBVenReal.setBorder(null);
        JBVenReal.setBorderPainted(false);
        JBVenReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVenRealActionPerformed(evt);
            }
        });
        jPanel1.add(JBVenReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 180, 30));

        JBAgregarP.setBackground(new java.awt.Color(173, 173, 173));
        JBAgregarP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBAgregarP.setForeground(new java.awt.Color(255, 255, 255));
        JBAgregarP.setText("Agregar producto");
        JBAgregarP.setBorder(null);
        JBAgregarP.setBorderPainted(false);
        JBAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarPActionPerformed(evt);
            }
        });
        jPanel1.add(JBAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 180, 30));
        jPanel1.add(jTNombClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 310, 30));
        jPanel1.add(jThora, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 310, 30));
        jPanel1.add(jTIDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 310, 30));
        jPanel1.add(jTfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 310, 30));

        JTVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 660, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\karen\\OneDrive\\Documentos\\Document\\CICLO VI\\Sistemas de Información II\\Producto\\Phosto_Clasificación\\Ventas.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirActionPerformed

    private void JBNVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBNVenActionPerformed

    private void JBVenRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVenRealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBVenRealActionPerformed

    private void JBAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBAgregarPActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Ventas().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JBAgregarP;
    public javax.swing.JButton JBNVen;
    public javax.swing.JButton JBVenReal;
    private javax.swing.JTable JTVentas;
    private javax.swing.JButton jBClasificaciónABC;
    private javax.swing.JButton jBGenerarInfo;
    private javax.swing.JButton jBProductos;
    public javax.swing.JButton jBSalir;
    private javax.swing.JButton jBVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTIDCliente;
    public javax.swing.JTextField jTNombClient;
    public javax.swing.JTextField jTfecha;
    public javax.swing.JTextField jThora;
    // End of variables declaration//GEN-END:variables
}