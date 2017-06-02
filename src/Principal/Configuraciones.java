/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author nmadariaga
 */
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Configuraciones extends javax.swing.JFrame {

    /**
     * Creates new form Configuraciones
     */
    public Configuraciones() {
        initComponents();
        setIconImage(new  ImageIcon(getClass().getResource("/Imagenes/LogoSE.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        FondoConfLbl = new javax.swing.JLabel();

        setTitle("Configuraciones");
        setLocation(new java.awt.Point(434, 138));
        setMaximumSize(new java.awt.Dimension(540, 420));
        setMinimumSize(new java.awt.Dimension(530, 420));
        setPreferredSize(new java.awt.Dimension(540, 400));
        setSize(new java.awt.Dimension(540, 400));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(208, 219, 225));
        jLabel1.setText("Configuraciones");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 10, 230, 40);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Configuracion de archivos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 160, 17);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("18 a 24 años");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 125, 66, 16);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("25 a 34 años");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 159, 66, 16);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("35 a 44 años");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 193, 66, 16);

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("45 a 54 años");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 227, 66, 16);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("55 a 65 años");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 261, 66, 16);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Edad");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 100, 27, 16);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sexo");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 290, 26, 16);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mujer");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(140, 302, 32, 16);

        jLabel12.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hombre");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(130, 336, 45, 16);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir1.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setMargin(new java.awt.Insets(0, 14, 0, 14));
        jButton1.setMaximumSize(new java.awt.Dimension(75, 18));
        jButton1.setMinimumSize(new java.awt.Dimension(75, 18));
        jButton1.setPreferredSize(new java.awt.Dimension(75, 18));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 119, 75, 18);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir1.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMargin(new java.awt.Insets(0, 14, 0, 14));
        jButton2.setMaximumSize(new java.awt.Dimension(75, 18));
        jButton2.setMinimumSize(new java.awt.Dimension(75, 18));
        jButton2.setPreferredSize(new java.awt.Dimension(75, 18));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir1.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 153, 75, 18);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir1.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(370, 185, 75, 20);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir1.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setMaximumSize(new java.awt.Dimension(75, 18));
        jButton4.setMinimumSize(new java.awt.Dimension(75, 18));
        jButton4.setPreferredSize(new java.awt.Dimension(75, 18));
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(370, 220, 75, 18);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir1.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setMaximumSize(new java.awt.Dimension(75, 18));
        jButton5.setMinimumSize(new java.awt.Dimension(75, 18));
        jButton5.setPreferredSize(new java.awt.Dimension(75, 18));
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(370, 255, 75, 18);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir1.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setMaximumSize(new java.awt.Dimension(75, 18));
        jButton6.setMinimumSize(new java.awt.Dimension(75, 18));
        jButton6.setPreferredSize(new java.awt.Dimension(75, 18));
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(370, 295, 75, 18);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir1.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setMaximumSize(new java.awt.Dimension(75, 18));
        jButton7.setMinimumSize(new java.awt.Dimension(75, 18));
        jButton7.setPreferredSize(new java.awt.Dimension(75, 18));
        jButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(370, 330, 75, 18);

        FondoConfLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoConf.png"))); // NOI18N
        FondoConfLbl.setMaximumSize(new java.awt.Dimension(540, 400));
        FondoConfLbl.setMinimumSize(new java.awt.Dimension(520, 400));
        getContentPane().add(FondoConfLbl);
        FondoConfLbl.setBounds(0, 0, 530, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void abrirarchivo(String archivo){

     try {

            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);
            JOptionPane.showMessageDialog(rootPane, "Correcto!");
     }catch (IOException ex) {

            System.out.println(ex);
            JOptionPane.showMessageDialog(rootPane, ex);

     }

    }                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
        abrirarchivo("src/Properties/edad_18_24.properties");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        abrirarchivo("src/Properties/edad_25_34.properties");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        abrirarchivo("/Properties/edad_35_44.properties");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        abrirarchivo("/src/Properties/edad_45_54.properties");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        abrirarchivo("/src/Properties/edad_55_65.properties");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        abrirarchivo("/src/Properties/sexo_mujer.properties");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        abrirarchivo("/src/Properties/sexo_hombre.properties");
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      //  java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
          //      new Configuraciones().setVisible(true);
           // }
        //});
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoConfLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
