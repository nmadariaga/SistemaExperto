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
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import Entradas.Registro;
import DataBase.FuncionesDB;
import java.util.ArrayList;
import java.util.List;

public class Registros extends javax.swing.JFrame {

    /**
     * Creates new form Registros
     */
    public void llenarTabla()
    {
        DefaultTableModel model;
        model = (DefaultTableModel) registrosTbl.getModel();
        List<Registro> lista = FuncionesDB.mostrarTodo();
        Object rowData[] = new Object[13];
        System.out.println("Llenando tabla...");
        for(int i =0; i< lista.size(); i++)
        {
            System.out.println("numero "+i+1);

            rowData[0]= lista.get(i).getId();
            rowData[1]= lista.get(i).getNombreNeg();
            rowData[2]= lista.get(i).getEdad();
            rowData[3]= lista.get(i).getCostoProd();
            rowData[4]= lista.get(i).getSueldo();
            rowData[5]= lista.get(i).getUtilidades();
            rowData[6]= lista.get(i).getFormaPago();
            rowData[7]= lista.get(i).getNegocio();
            rowData[8]= lista.get(i).getSexo();
            rowData[9]= lista.get(i).getCompatibilidad();
            rowData[10]= lista.get(i).getRelacionPS();
            rowData[11]= lista.get(i).getResumen();
            rowData[12]= lista.get(i).getFecha();
            model.addRow(rowData);
        }
        System.out.println("Fin");
    }
    
    public Registros() {
        initComponents();
        llenarTabla();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        registrosTbl = new javax.swing.JTable();

        setTitle("Registro de consultas");
        setBounds(new java.awt.Rectangle(300, 200, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(500, 100));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(500, 100));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 300));

        registrosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Edad", "Costo Prod", "Sueldo Prom", "Utilidades", "Forma Pago", "Negocio", "Sexo", "Compatibilidad", "RelacionPS", "Resultado", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        registrosTbl.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        registrosTbl.setColumnSelectionAllowed(true);
        registrosTbl.setMinimumSize(new java.awt.Dimension(195, 64));
        registrosTbl.setName(""); // NOI18N
        registrosTbl.setPreferredSize(new java.awt.Dimension(1250, 64));
        registrosTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(registrosTbl);
        registrosTbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (registrosTbl.getColumnModel().getColumnCount() > 0) {
            registrosTbl.getColumnModel().getColumn(0).setMinWidth(50);
            registrosTbl.getColumnModel().getColumn(0).setPreferredWidth(50);
            registrosTbl.getColumnModel().getColumn(0).setMaxWidth(50);
            registrosTbl.getColumnModel().getColumn(1).setMinWidth(100);
            registrosTbl.getColumnModel().getColumn(1).setPreferredWidth(100);
            registrosTbl.getColumnModel().getColumn(1).setMaxWidth(100);
            registrosTbl.getColumnModel().getColumn(2).setMinWidth(100);
            registrosTbl.getColumnModel().getColumn(2).setPreferredWidth(100);
            registrosTbl.getColumnModel().getColumn(2).setMaxWidth(100);
            registrosTbl.getColumnModel().getColumn(3).setMinWidth(100);
            registrosTbl.getColumnModel().getColumn(3).setPreferredWidth(100);
            registrosTbl.getColumnModel().getColumn(3).setMaxWidth(100);
            registrosTbl.getColumnModel().getColumn(4).setMinWidth(100);
            registrosTbl.getColumnModel().getColumn(4).setPreferredWidth(100);
            registrosTbl.getColumnModel().getColumn(4).setMaxWidth(100);
            registrosTbl.getColumnModel().getColumn(5).setMinWidth(100);
            registrosTbl.getColumnModel().getColumn(5).setPreferredWidth(100);
            registrosTbl.getColumnModel().getColumn(5).setMaxWidth(100);
            registrosTbl.getColumnModel().getColumn(6).setMinWidth(100);
            registrosTbl.getColumnModel().getColumn(6).setPreferredWidth(100);
            registrosTbl.getColumnModel().getColumn(6).setMaxWidth(100);
            registrosTbl.getColumnModel().getColumn(7).setMinWidth(100);
            registrosTbl.getColumnModel().getColumn(7).setPreferredWidth(100);
            registrosTbl.getColumnModel().getColumn(7).setMaxWidth(100);
            registrosTbl.getColumnModel().getColumn(8).setMinWidth(100);
            registrosTbl.getColumnModel().getColumn(8).setPreferredWidth(100);
            registrosTbl.getColumnModel().getColumn(8).setMaxWidth(100);
            registrosTbl.getColumnModel().getColumn(9).setMinWidth(100);
            registrosTbl.getColumnModel().getColumn(9).setPreferredWidth(100);
            registrosTbl.getColumnModel().getColumn(9).setMaxWidth(100);
            registrosTbl.getColumnModel().getColumn(10).setMinWidth(100);
            registrosTbl.getColumnModel().getColumn(10).setPreferredWidth(100);
            registrosTbl.getColumnModel().getColumn(10).setMaxWidth(100);
            registrosTbl.getColumnModel().getColumn(11).setMinWidth(100);
            registrosTbl.getColumnModel().getColumn(11).setPreferredWidth(100);
            registrosTbl.getColumnModel().getColumn(11).setMaxWidth(100);
            registrosTbl.getColumnModel().getColumn(12).setMinWidth(100);
            registrosTbl.getColumnModel().getColumn(12).setPreferredWidth(100);
            registrosTbl.getColumnModel().getColumn(12).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    /*ublic static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      /*  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registros().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable registrosTbl;
    // End of variables declaration//GEN-END:variables
}