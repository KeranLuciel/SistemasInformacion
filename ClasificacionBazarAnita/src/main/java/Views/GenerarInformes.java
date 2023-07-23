package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenerarInformes extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesión
     */
    public GenerarInformes() {
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
        JBMasVen = new javax.swing.JButton();
        JBReposi = new javax.swing.JButton();
        JBMenVen1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTClasificación = new javax.swing.JTable();
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

        JBMasVen.setBackground(new java.awt.Color(173, 173, 173));
        JBMasVen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBMasVen.setForeground(new java.awt.Color(255, 255, 255));
        JBMasVen.setText("Más vendidos");
        JBMasVen.setBorder(null);
        JBMasVen.setBorderPainted(false);
        JBMasVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMasVenActionPerformed(evt);
            }
        });
        jPanel1.add(JBMasVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 180, 30));

        JBReposi.setBackground(new java.awt.Color(173, 173, 173));
        JBReposi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBReposi.setForeground(new java.awt.Color(255, 255, 255));
        JBReposi.setText("Reposición");
        JBReposi.setBorder(null);
        JBReposi.setBorderPainted(false);
        JBReposi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBReposiActionPerformed(evt);
            }
        });
        jPanel1.add(JBReposi, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 180, 30));

        JBMenVen1.setBackground(new java.awt.Color(173, 173, 173));
        JBMenVen1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBMenVen1.setForeground(new java.awt.Color(255, 255, 255));
        JBMenVen1.setText("Menos vendidos");
        JBMenVen1.setBorder(null);
        JBMenVen1.setBorderPainted(false);
        JBMenVen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenVen1ActionPerformed(evt);
            }
        });
        jPanel1.add(JBMenVen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 180, 30));

        JTClasificación.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTClasificación);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 680, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\karen\\OneDrive\\Documentos\\Document\\CICLO VI\\Sistemas de Información II\\Producto\\Phosto_Clasificación\\Generación de informes.png")); // NOI18N
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

    private void JBMasVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMasVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBMasVenActionPerformed

    private void JBReposiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBReposiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBReposiActionPerformed

    private void JBMenVen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenVen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBMenVen1ActionPerformed

    /**
     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(GenerarInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GenerarInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GenerarInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GenerarInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
//                new GenerarInformes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JBMasVen;
    public javax.swing.JButton JBMenVen1;
    public javax.swing.JButton JBReposi;
    private javax.swing.JTable JTClasificación;
    private javax.swing.JButton jBClasificaciónABC;
    private javax.swing.JButton jBGenerarInfo;
    private javax.swing.JButton jBProductos;
    public javax.swing.JButton jBSalir;
    private javax.swing.JButton jBVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
