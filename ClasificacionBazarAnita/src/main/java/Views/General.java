package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class General extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesión
     */
    public General() {
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
        jLNameLas = new javax.swing.JLabel();
        jBProductos = new javax.swing.JButton();
        jBClasificaciónABC = new javax.swing.JButton();
        jBVentas = new javax.swing.JButton();
        jBGenerarInfo = new javax.swing.JButton();
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

        jLNameLas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLNameLas.setText("NOMBRE APELLIDO");
        jPanel1.add(jLNameLas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\karen\\OneDrive\\Documentos\\Document\\CICLO VI\\Sistemas de Información II\\Producto\\Phosto_Clasificación\\General.png")); // NOI18N
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
//            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new General().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClasificaciónABC;
    private javax.swing.JButton jBGenerarInfo;
    private javax.swing.JButton jBProductos;
    public javax.swing.JButton jBSalir;
    private javax.swing.JButton jBVentas;
    private javax.swing.JLabel jLNameLas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
