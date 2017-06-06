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
import Properties.LeerProperties;
import Entradas.Variables;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import CargarDatos.CargarDatos;
import javax.swing.ImageIcon;

public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents(); 
        setIconImage(new  ImageIcon(getClass().getResource("/Imagenes/LogoSE.png")).getImage());
    }
    public void cuadroDialogo(String mensaje)
    {
        try
        {
            JOptionPane.showMessageDialog(rootPane, mensaje);
        }        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error inesperado.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EdadLbl = new javax.swing.JLabel();
        SueldoLbl = new javax.swing.JLabel();
        FormaPagoLbl = new javax.swing.JLabel();
        SexoLbl = new javax.swing.JLabel();
        CostoProdLbl = new javax.swing.JLabel();
        PrecioVentaLbl = new javax.swing.JLabel();
        TipoNegLbl = new javax.swing.JLabel();
        EdadTF = new javax.swing.JTextField();
        SueldoTF = new javax.swing.JTextField();
        FormaPagoCB = new javax.swing.JComboBox<>();
        SexoCB = new javax.swing.JComboBox<>();
        TipoNegCB = new javax.swing.JComboBox<>();
        NegCB = new javax.swing.JComboBox<>();
        CostoProdTF = new javax.swing.JTextField();
        UtilidadesTF = new javax.swing.JTextField();
        EnviarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FondoPrincipalLbl = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        JMenuOpciones = new javax.swing.JMenu();
        jMenuConfig = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Experto");
        setLocation(new java.awt.Point(300, 100));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(810, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        EdadLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        EdadLbl.setForeground(java.awt.Color.white);
        EdadLbl.setText("            Edad:");
        getContentPane().add(EdadLbl);
        EdadLbl.setBounds(40, 170, 130, 30);

        SueldoLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        SueldoLbl.setForeground(java.awt.Color.white);
        SueldoLbl.setText("         Sueldo:");
        getContentPane().add(SueldoLbl);
        SueldoLbl.setBounds(40, 210, 130, 30);

        FormaPagoLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        FormaPagoLbl.setForeground(java.awt.Color.white);
        FormaPagoLbl.setText(" Forma de Pago:");
        getContentPane().add(FormaPagoLbl);
        FormaPagoLbl.setBounds(10, 260, 150, 20);

        SexoLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        SexoLbl.setForeground(java.awt.Color.white);
        SexoLbl.setText("            Sexo:");
        getContentPane().add(SexoLbl);
        SexoLbl.setBounds(40, 300, 130, 20);

        CostoProdLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        CostoProdLbl.setForeground(java.awt.Color.white);
        CostoProdLbl.setText(" Costo de produccion:");
        getContentPane().add(CostoProdLbl);
        CostoProdLbl.setBounds(390, 170, 170, 30);

        PrecioVentaLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        PrecioVentaLbl.setForeground(java.awt.Color.white);
        PrecioVentaLbl.setText("                   Utilidades:");
        getContentPane().add(PrecioVentaLbl);
        PrecioVentaLbl.setBounds(390, 210, 150, 30);

        TipoNegLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        TipoNegLbl.setForeground(java.awt.Color.white);
        TipoNegLbl.setText("   Tipo de Negocio:");
        getContentPane().add(TipoNegLbl);
        TipoNegLbl.setBounds(410, 260, 150, 20);

        EdadTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadTFActionPerformed(evt);
            }
        });
        EdadTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EdadTFKeyTyped(evt);
            }
        });
        getContentPane().add(EdadTF);
        EdadTF.setBounds(140, 170, 150, 30);
        EdadTF.getAccessibleContext().setAccessibleDescription("");

        SueldoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SueldoTFKeyTyped(evt);
            }
        });
        getContentPane().add(SueldoTF);
        SueldoTF.setBounds(140, 210, 150, 30);
        SueldoTF.getAccessibleContext().setAccessibleDescription("");

        FormaPagoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Efectivo", "Debito", "Credito", "Cheque" }));
        FormaPagoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormaPagoCBActionPerformed(evt);
            }
        });
        getContentPane().add(FormaPagoCB);
        FormaPagoCB.setBounds(140, 260, 150, 24);

        SexoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ambos", "Mujer", "Hombre" }));
        getContentPane().add(SexoCB);
        SexoCB.setBounds(140, 300, 150, 24);

        TipoNegCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Servicio", "Producto" }));
        TipoNegCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoNegCBActionPerformed(evt);
            }
        });
        getContentPane().add(TipoNegCB);
        TipoNegCB.setBounds(560, 260, 140, 24);

        NegCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        NegCB.setEnabled(false);
        getContentPane().add(NegCB);
        NegCB.setBounds(560, 300, 140, 24);

        CostoProdTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CostoProdTFKeyTyped(evt);
            }
        });
        getContentPane().add(CostoProdTF);
        CostoProdTF.setBounds(560, 170, 140, 30);

        UtilidadesTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UtilidadesTFKeyTyped(evt);
            }
        });
        getContentPane().add(UtilidadesTF);
        UtilidadesTF.setBounds(560, 210, 140, 30);

        EnviarBtn.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        EnviarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnEnviarA.png"))); // NOI18N
        EnviarBtn.setBorder(null);
        EnviarBtn.setBorderPainted(false);
        EnviarBtn.setContentAreaFilled(false);
        EnviarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EnviarBtn.setPreferredSize(new java.awt.Dimension(140, 30));
        EnviarBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnEnviarB.png"))); // NOI18N
        EnviarBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnEnviarB.png"))); // NOI18N
        EnviarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(EnviarBtn);
        EnviarBtn.setBounds(330, 350, 140, 30);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Años");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 180, 40, 20);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("%");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(710, 210, 40, 30);

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Pesos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 220, 40, 20);

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Pesos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(710, 180, 40, 20);

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(72, 97, 123));
        jLabel5.setText("INGRESE LOS DATOS SOLICITADOS A CONTINUACION PARA REALIZAR LA CONSULTA");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 120, 610, 30);

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Negocio:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 300, 70, 20);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(208, 219, 225));
        jLabel7.setText("Sistema Experto para la evaluacion de Negocios");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 10, 560, 50);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(208, 219, 225));
        jLabel8.setText("UNIVERSIDAD TECNCOLÓGICA METROPOLITANA");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 60, 320, 20);

        FondoPrincipalLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPrincipal.png"))); // NOI18N
        getContentPane().add(FondoPrincipalLbl);
        FondoPrincipalLbl.setBounds(0, 0, 800, 500);

        JMenuOpciones.setText("Opciones");

        jMenuConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings.png"))); // NOI18N
        jMenuConfig.setText("Configuraciones");
        jMenuConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConfigActionPerformed(evt);
            }
        });
        JMenuOpciones.add(jMenuConfig);
        JMenuOpciones.add(jSeparator1);

        jMenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit-to-app.png"))); // NOI18N
        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        JMenuOpciones.add(jMenuSalir);

        jMenuBar2.add(JMenuOpciones);

        jMenu1.setText("Ayuda");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help.png"))); // NOI18N
        jMenuItem1.setText("Acerca de");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormaPagoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormaPagoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormaPagoCBActionPerformed

    private void EdadTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdadTFActionPerformed

    private void EnviarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarBtnActionPerformed
        // TODO add your handling code here:
        String Mensaje = null;
        int PuntajeFinal = 0;
        try
        {
            Variables DatosIngresados = new Variables();
            DatosIngresados.setEdad(EdadTF.getText());
            DatosIngresados.setSueldo(SueldoTF.getText());
            DatosIngresados.setFormaDePago(FormaPagoCB.getSelectedItem().toString());
            DatosIngresados.setSexo(SexoCB.getSelectedItem().toString());
            DatosIngresados.setCostoProduccion(CostoProdTF.getText());
            DatosIngresados.setUtilidades(UtilidadesTF.getText());
            DatosIngresados.setTipoNegocio(NegCB.getSelectedItem().toString());

            if(NegCB.getSelectedItem().toString().equals("Seleccione") || FormaPagoCB.getSelectedItem().toString().equals("Seleccione") || SexoCB.getSelectedItem().toString().equals("Seleccione") || TipoNegCB.getSelectedItem().toString().equals("Seleccione"))
            {
                Mensaje = "Una o más variables no poseen valor";        
                cuadroDialogo(Mensaje);
            }
            else if(EdadTF.getText().isEmpty() || SueldoTF.getText().isEmpty() || CostoProdTF.getText().isEmpty() || UtilidadesTF.getText().isEmpty())
            {
                Mensaje = "Una o más variables no poseen valor";        
                cuadroDialogo(Mensaje);
            }
            else
            {
                
                PuntajeFinal = CargarDatos.enviarVariables(DatosIngresados);
            }
            
        }
        catch(Exception e)
        {
            cuadroDialogo("¡Ha ocurrido un error!");
        }
    }//GEN-LAST:event_EnviarBtnActionPerformed

    private void TipoNegCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoNegCBActionPerformed
        // TODO add your handling code here:
        if(TipoNegCB.getSelectedItem().toString().equals("Seleccione"))
        {
            NegCB.setEnabled(false);
        }
        if(TipoNegCB.getSelectedItem().toString().equals("Producto"))
        {
            NegCB.setEnabled(true);
            NegCB.removeAllItems();
            NegCB.addItem("Seleccione");
            NegCB.addItem("Comida");
            NegCB.addItem("Beb.Alcoholicas");
            NegCB.addItem("Vestuario");
            NegCB.addItem("Electronica");
            NegCB.addItem("Decoracion");
            NegCB.addItem("Art. Aseo");
        }
        if(TipoNegCB.getSelectedItem().toString().equals("Servicio"))
        {
            NegCB.setEnabled(true);
            NegCB.removeAllItems();
            NegCB.addItem("Seleccione");
            NegCB.addItem("Locomocion");
            NegCB.addItem("Reparto");
            NegCB.addItem("Telefonia");
            NegCB.addItem("Television");
            NegCB.addItem("Internet");
        }
    }//GEN-LAST:event_TipoNegCBActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConfigActionPerformed
        // TODO add your handling code here:
        Configuraciones conf = new Configuraciones();
        conf.setVisible(true);
        
    }//GEN-LAST:event_jMenuConfigActionPerformed

    private void EdadTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EdadTFKeyTyped
        // TODO add your handling code here:
        char validar= evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            cuadroDialogo("Se debe ingresar sólo números.");
        }
    }//GEN-LAST:event_EdadTFKeyTyped

    private void CostoProdTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CostoProdTFKeyTyped
        // TODO add your handling code here:
        char validar= evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            cuadroDialogo("Se debe ingresar sólo números.");
        }
    }//GEN-LAST:event_CostoProdTFKeyTyped

    private void SueldoTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SueldoTFKeyTyped
        // TODO add your handling code here:
        char validar= evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            cuadroDialogo("Se debe ingresar sólo números.");
        }
    }//GEN-LAST:event_SueldoTFKeyTyped

    private void UtilidadesTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UtilidadesTFKeyTyped
        // TODO add your handling code here:
        char validar= evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            cuadroDialogo("Se debe ingresar sólo números.");
        }
    }//GEN-LAST:event_UtilidadesTFKeyTyped

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        AcercaDe about = new AcercaDe();
        about.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * 
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);

            }
        });

        String Mensaje = null;
        Variables DatosIngresados = new Variables();
        
        //LeerProperties properties = new LeerProperties();
        //properties.leerArchivo();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CostoProdLbl;
    private javax.swing.JTextField CostoProdTF;
    private javax.swing.JLabel EdadLbl;
    private javax.swing.JTextField EdadTF;
    private javax.swing.JButton EnviarBtn;
    private javax.swing.JLabel FondoPrincipalLbl;
    private javax.swing.JComboBox<String> FormaPagoCB;
    private javax.swing.JLabel FormaPagoLbl;
    private javax.swing.JMenu JMenuOpciones;
    private javax.swing.JComboBox<String> NegCB;
    private javax.swing.JLabel PrecioVentaLbl;
    private javax.swing.JComboBox<String> SexoCB;
    private javax.swing.JLabel SexoLbl;
    private javax.swing.JLabel SueldoLbl;
    private javax.swing.JTextField SueldoTF;
    private javax.swing.JComboBox<String> TipoNegCB;
    private javax.swing.JLabel TipoNegLbl;
    private javax.swing.JTextField UtilidadesTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuConfig;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
