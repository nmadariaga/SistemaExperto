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

import Entradas.Variables;
import javax.swing.JOptionPane;
import CargarDatos.CargarDatos;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.security.CodeSource;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import Entradas.Registro;
import DataBase.FuncionesDB;
import java.awt.Color;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
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
    
    public static File obtenerRutaJar()
    {
        File jarDir= null;
        try {
            CodeSource codeSource = Configuraciones.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            jarDir = jarFile.getParentFile();
        } 
        catch (Exception e) {
        }
        return jarDir;
    }
    
    public void llenarTabla()
    {
        System.out.println("Inicio de llenado de tabla..");
        //registrosTbl.removeAll();
        DefaultTableModel model;
        
        model = (DefaultTableModel) registrosTbl.getModel();
        int filas= model.getRowCount();
        if (model.getRowCount() > 0) {
            System.out.println("Vaciado de tabla...");
            for (int i = model.getRowCount() - 1; i > -1; i--) 
            {
                model.removeRow(i);
                System.out.println("Eliminada fila: "+i);
            }
            System.out.println("Fin vaciado de tabla...");
        }
        List<Registro> lista = new ArrayList<Registro>();
        lista = FuncionesDB.mostrarTodo();
        
        if(lista.isEmpty())
        {            
            jScrollPane1.setVisible(false);
            registrosTbl.setVisible(false);
            model.setRowCount(0);
            JLabel mensaje = new JLabel();
            mensaje.setText("No se han realizado consultas");
            mensaje.setForeground(Color.WHITE);
            mensaje.setBounds(250, 180, 330, 40);
            mensaje.setVisible(true);
            
            RegPnl.add(mensaje);
            
            
        }else{
            Object rowData[] = new Object[13];
            System.out.println("Llenando tabla...");
            for(int i =0; i< lista.size(); i++)
            {
                System.out.println("numero "+i);

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
        }
                System.out.println("Fin llenado..");
    }
    
    
    public void abrirarchivo(String archivo){

     try {
            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);
            //JOptionPane.showMessageDialog(rootPane, "Correcto!");
     }catch (IOException ex) {

            System.out.println(ex);
            JOptionPane.showMessageDialog(rootPane, ex);
     }
    }
    
    public void ConexionHtml()
    {
        try {
            String URL = obtenerRutaJar()+"/Archivos/Ayuda.html";
            System.out.println(URL);
            File rec = new File(URL);
            AyudaPane.setEditable(false);
            
            AyudaPane.setPage(rec.toURI().toURL());
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        TituloPnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        acercaDeLbl = new javax.swing.JLabel();
        LeftPnl = new javax.swing.JPanel();
        InicioBtn = new javax.swing.JButton();
        RegistroBtn = new javax.swing.JButton();
        ConfBtn = new javax.swing.JButton();
        SalirBtn = new javax.swing.JButton();
        AyudaBtn = new javax.swing.JButton();
        CenterPnl = new javax.swing.JPanel();
        InicioPnl = new javax.swing.JPanel();
        EdadLbl = new javax.swing.JLabel();
        EdadTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CostoProdLbl = new javax.swing.JLabel();
        CostoProdTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SueldoLbl = new javax.swing.JLabel();
        SueldoTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PrecioVentaLbl = new javax.swing.JLabel();
        UtilidadesTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FormaPagoLbl = new javax.swing.JLabel();
        FormaPagoCB = new javax.swing.JComboBox<>();
        TipoNegLbl = new javax.swing.JLabel();
        TipoNegCB = new javax.swing.JComboBox<>();
        SexoLbl = new javax.swing.JLabel();
        SexoCB = new javax.swing.JComboBox<>();
        NegCB = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        NombreNegLbl = new javax.swing.JLabel();
        NombreNegTF = new javax.swing.JTextField();
        EnviarBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        RegPnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        registrosTbl = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        ConfPnl = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        AyudaPnl = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AyudaPane = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Experto");
        setLocation(new java.awt.Point(200, 70));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(41, 69, 92));

        TituloPnl.setBackground(new java.awt.Color(27, 40, 56));

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("SISTEMA EXPERTO PARA LA EVALUACION DE NEGOCIOS");

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Universidad Tecnológica Metropolitana");

        acercaDeLbl.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        acercaDeLbl.setForeground(new java.awt.Color(255, 255, 255));
        acercaDeLbl.setText("Acerca de..");
        acercaDeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acercaDeLblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acercaDeLblMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acercaDeLblMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout TituloPnlLayout = new javax.swing.GroupLayout(TituloPnl);
        TituloPnl.setLayout(TituloPnlLayout);
        TituloPnlLayout.setHorizontalGroup(
            TituloPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acercaDeLbl)
                .addGap(25, 25, 25))
            .addGroup(TituloPnlLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(TituloPnlLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TituloPnlLayout.setVerticalGroup(
            TituloPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloPnlLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acercaDeLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LeftPnl.setBackground(new java.awt.Color(41, 69, 92));

        InicioBtn.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        InicioBtn.setText("INICIO");
        InicioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioBtnActionPerformed(evt);
            }
        });

        RegistroBtn.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        RegistroBtn.setText("REGISTRO");
        RegistroBtn.setMaximumSize(new java.awt.Dimension(75, 25));
        RegistroBtn.setMinimumSize(new java.awt.Dimension(75, 25));
        RegistroBtn.setPreferredSize(new java.awt.Dimension(75, 25));
        RegistroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroBtnActionPerformed(evt);
            }
        });

        ConfBtn.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        ConfBtn.setText("CONFIGURACION");
        ConfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfBtnActionPerformed(evt);
            }
        });

        SalirBtn.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        SalirBtn.setText("SALIR");
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });

        AyudaBtn.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        AyudaBtn.setText("AYUDA");
        AyudaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPnlLayout = new javax.swing.GroupLayout(LeftPnl);
        LeftPnl.setLayout(LeftPnlLayout);
        LeftPnlLayout.setHorizontalGroup(
            LeftPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegistroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SalirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ConfBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
            .addComponent(InicioBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AyudaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LeftPnlLayout.setVerticalGroup(
            LeftPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPnlLayout.createSequentialGroup()
                .addComponent(InicioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(RegistroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ConfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(AyudaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SalirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CenterPnl.setLayout(new java.awt.CardLayout());

        InicioPnl.setBackground(new java.awt.Color(27, 40, 56));

        EdadLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        EdadLbl.setForeground(java.awt.Color.white);
        EdadLbl.setText("Edad:");

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

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Años");

        CostoProdLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        CostoProdLbl.setForeground(java.awt.Color.white);
        CostoProdLbl.setText("Costo de produccion:");

        CostoProdTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CostoProdTFKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Pesos");

        SueldoLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        SueldoLbl.setForeground(java.awt.Color.white);
        SueldoLbl.setText("Sueldo:");

        SueldoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SueldoTFKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Pesos");

        PrecioVentaLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        PrecioVentaLbl.setForeground(java.awt.Color.white);
        PrecioVentaLbl.setText("Utilidades:");

        UtilidadesTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UtilidadesTFKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("%");

        FormaPagoLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        FormaPagoLbl.setForeground(java.awt.Color.white);
        FormaPagoLbl.setText(" Forma de Pago:");

        FormaPagoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Efectivo", "Debito", "Credito", "Cheque" }));
        FormaPagoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormaPagoCBActionPerformed(evt);
            }
        });

        TipoNegLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        TipoNegLbl.setForeground(java.awt.Color.white);
        TipoNegLbl.setText("Tipo de Negocio:");

        TipoNegCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Servicio", "Producto" }));
        TipoNegCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoNegCBActionPerformed(evt);
            }
        });

        SexoLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        SexoLbl.setForeground(java.awt.Color.white);
        SexoLbl.setText("Sexo:");

        SexoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ambos", "Mujer", "Hombre" }));

        NegCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        NegCB.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Negocio:");

        NombreNegLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        NombreNegLbl.setForeground(java.awt.Color.white);
        NombreNegLbl.setText("Nombre Negocio:");

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

        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("INGRESE LOS DATOS SOLICITADOS A CONTINUACION");

        javax.swing.GroupLayout InicioPnlLayout = new javax.swing.GroupLayout(InicioPnl);
        InicioPnl.setLayout(InicioPnlLayout);
        InicioPnlLayout.setHorizontalGroup(
            InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioPnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EnviarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
            .addGroup(InicioPnlLayout.createSequentialGroup()
                .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SexoLbl)
                    .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(InicioPnlLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(SueldoLbl)
                                .addComponent(EdadLbl)))
                        .addGroup(InicioPnlLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(FormaPagoLbl))))
                .addGap(15, 15, 15)
                .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioPnlLayout.createSequentialGroup()
                        .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(InicioPnlLayout.createSequentialGroup()
                                .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(InicioPnlLayout.createSequentialGroup()
                                        .addComponent(FormaPagoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(InicioPnlLayout.createSequentialGroup()
                                        .addComponent(SueldoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(jLabel5))
                            .addGroup(InicioPnlLayout.createSequentialGroup()
                                .addComponent(EdadTF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TipoNegLbl)
                            .addComponent(PrecioVentaLbl)
                            .addComponent(CostoProdLbl))
                        .addGap(12, 12, 12))
                    .addGroup(InicioPnlLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(SexoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioPnlLayout.createSequentialGroup()
                        .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UtilidadesTF)
                            .addComponent(CostoProdTF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25))
                    .addGroup(InicioPnlLayout.createSequentialGroup()
                        .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TipoNegCB, javax.swing.GroupLayout.Alignment.LEADING, 0, 135, Short.MAX_VALUE)
                            .addComponent(NegCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 72, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(InicioPnlLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(NombreNegLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(NombreNegTF, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InicioPnlLayout.setVerticalGroup(
            InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioPnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(43, 43, 43)
                .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EdadLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(CostoProdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CostoProdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(EdadTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SueldoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(PrecioVentaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UtilidadesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SueldoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FormaPagoLbl)
                    .addComponent(FormaPagoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoNegLbl)
                    .addComponent(TipoNegCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SexoLbl)
                        .addComponent(SexoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NegCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(InicioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreNegLbl)
                    .addComponent(NombreNegTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(EnviarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        CenterPnl.add(InicioPnl, "card2");

        RegPnl.setBackground(new java.awt.Color(27, 40, 56));
        RegPnl.setPreferredSize(new java.awt.Dimension(715, 455));

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
        registrosTbl.setPreferredSize(new java.awt.Dimension(1150, 64));
        registrosTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(registrosTbl);
        registrosTbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel20.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel20.setForeground(java.awt.Color.white);
        jLabel20.setText("VISUALIZACION DE CONSULTAS REALIZADAS");

        javax.swing.GroupLayout RegPnlLayout = new javax.swing.GroupLayout(RegPnl);
        RegPnl.setLayout(RegPnlLayout);
        RegPnlLayout.setHorizontalGroup(
            RegPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegPnlLayout.createSequentialGroup()
                .addGroup(RegPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegPnlLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegPnlLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel20)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        RegPnlLayout.setVerticalGroup(
            RegPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegPnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel20)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        CenterPnl.add(RegPnl, "card2");

        ConfPnl.setBackground(new java.awt.Color(27, 40, 56));

        jLabel15.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("45 a 54 años");

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

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CONFIGURACION DE SEXO:");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Mujer");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("55 a 65 años");

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

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("35 a 44 años");
        jLabel14.setToolTipText("");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONFIGURACION DE EDAD:");

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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir1.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAbrir2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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

        jLabel19.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Hombre");

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

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("18 a 24 años");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("25 a 34 años");

        jLabel21.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel21.setForeground(java.awt.Color.white);
        jLabel21.setText("ARCHIVOS DE CONFIGURACION");

        javax.swing.GroupLayout ConfPnlLayout = new javax.swing.GroupLayout(ConfPnl);
        ConfPnl.setLayout(ConfPnlLayout);
        ConfPnlLayout.setHorizontalGroup(
            ConfPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfPnlLayout.createSequentialGroup()
                .addGroup(ConfPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConfPnlLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel11))
                    .addGroup(ConfPnlLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(ConfPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addGroup(ConfPnlLayout.createSequentialGroup()
                                .addGroup(ConfPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addGroup(ConfPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16))
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel17))
                                .addGap(193, 193, 193)
                                .addGroup(ConfPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        ConfPnlLayout.setVerticalGroup(
            ConfPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfPnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel21)
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(ConfPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ConfPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(ConfPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConfPnlLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                    .addGroup(ConfPnlLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(ConfPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConfPnlLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel17))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ConfPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConfPnlLayout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConfPnlLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        CenterPnl.add(ConfPnl, "card2");

        AyudaPnl.setBackground(new java.awt.Color(27, 40, 56));
        AyudaPnl.setPreferredSize(new java.awt.Dimension(715, 455));

        jLabel9.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("INFORMACION DE LAS VARIABLES");

        jScrollPane3.setViewportView(AyudaPane);

        javax.swing.GroupLayout AyudaPnlLayout = new javax.swing.GroupLayout(AyudaPnl);
        AyudaPnl.setLayout(AyudaPnlLayout);
        AyudaPnlLayout.setHorizontalGroup(
            AyudaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AyudaPnlLayout.createSequentialGroup()
                .addGroup(AyudaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AyudaPnlLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AyudaPnlLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel9)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        AyudaPnlLayout.setVerticalGroup(
            AyudaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AyudaPnlLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        CenterPnl.add(AyudaPnl, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LeftPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CenterPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addComponent(TituloPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TituloPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CenterPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeftPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioBtnActionPerformed
        // TODO add your handling code here:
        CenterPnl.removeAll();
        CenterPnl.repaint();
        CenterPnl.revalidate();
        
        CenterPnl.add(InicioPnl);
        CenterPnl.repaint();
        CenterPnl.revalidate();
    }//GEN-LAST:event_InicioBtnActionPerformed

    private void RegistroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroBtnActionPerformed
        // TODO add your handling code here:        
        CenterPnl.removeAll();
        CenterPnl.repaint();
        CenterPnl.revalidate();
        
        CenterPnl.add(RegPnl);
        CenterPnl.repaint();
        CenterPnl.revalidate();
        RegistroBtn.disable();
        
        llenarTabla();
    }//GEN-LAST:event_RegistroBtnActionPerformed

    private void ConfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfBtnActionPerformed
        // TODO add your handling code here:}
        CenterPnl.removeAll();
        CenterPnl.repaint();
        CenterPnl.revalidate();
        
        CenterPnl.add(ConfPnl);
        CenterPnl.repaint();
        CenterPnl.revalidate();
    }//GEN-LAST:event_ConfBtnActionPerformed

    private void EdadTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdadTFActionPerformed

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

    private void FormaPagoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormaPagoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormaPagoCBActionPerformed

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
            DatosIngresados.setNombreNeg(NombreNegTF.getText());

            if(NegCB.getSelectedItem().toString().equals("Seleccione") || FormaPagoCB.getSelectedItem().toString().equals("Seleccione") || SexoCB.getSelectedItem().toString().equals("Seleccione") || TipoNegCB.getSelectedItem().toString().equals("Seleccione"))
            {
                Mensaje = "Una o más variables no poseen valor";
                cuadroDialogo(Mensaje);
            }
            else if(EdadTF.getText().isEmpty() || SueldoTF.getText().isEmpty() || CostoProdTF.getText().isEmpty() || UtilidadesTF.getText().isEmpty() || NombreNegTF.getText().isEmpty())
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

    private void AyudaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaBtnActionPerformed
        // TODO add your handling code here:
        CenterPnl.removeAll();
        CenterPnl.repaint();
        CenterPnl.revalidate();
        
        CenterPnl.add(AyudaPnl);
        CenterPnl.repaint();
        CenterPnl.revalidate();
        
        ConexionHtml();
        
        
    }//GEN-LAST:event_AyudaBtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
            abrirarchivo(obtenerRutaJar()+"/Properties/sexo_hombre.properties");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No se pudo cargar el archivo, revise las rutas");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try {
            abrirarchivo(obtenerRutaJar()+"/Properties/sexo_mujer.properties");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No se pudo cargar el archivo, revise las rutas");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            abrirarchivo(obtenerRutaJar()+"/Properties/edad_55_65.properties");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No se pudo cargar el archivo, revise las rutas");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            abrirarchivo(obtenerRutaJar()+"/Properties/edad_45_54.properties");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No se pudo cargar el archivo, revise las rutas");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            abrirarchivo(obtenerRutaJar()+"/Properties/edad_35_44.properties");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No se pudo cargar el archivo, revise las rutas");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            abrirarchivo(obtenerRutaJar()+"/Properties/edad_25_34.properties");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No se pudo cargar el archivo, revise las rutas");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            abrirarchivo(obtenerRutaJar()+"/Properties/edad_18_24.properties");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No se pudo cargar el archivo, revise las rutas");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirBtnActionPerformed

    private void acercaDeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaDeLblMouseClicked
        // TODO add your handling code here:
        AcercaDe a = new AcercaDe();
        a.setVisible(true);
    }//GEN-LAST:event_acercaDeLblMouseClicked

    private void acercaDeLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaDeLblMouseEntered
        // TODO add your handling code here:
        acercaDeLbl.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_acercaDeLblMouseEntered

    private void acercaDeLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaDeLblMouseExited
        // TODO add your handling code here:
        acercaDeLbl.setForeground(Color.WHITE);
    }//GEN-LAST:event_acercaDeLblMouseExited

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AyudaBtn;
    private javax.swing.JEditorPane AyudaPane;
    private javax.swing.JPanel AyudaPnl;
    private javax.swing.JPanel CenterPnl;
    private javax.swing.JButton ConfBtn;
    private javax.swing.JPanel ConfPnl;
    private javax.swing.JLabel CostoProdLbl;
    private javax.swing.JTextField CostoProdTF;
    private javax.swing.JLabel EdadLbl;
    private javax.swing.JTextField EdadTF;
    private javax.swing.JButton EnviarBtn;
    private javax.swing.JComboBox<String> FormaPagoCB;
    private javax.swing.JLabel FormaPagoLbl;
    private javax.swing.JButton InicioBtn;
    private javax.swing.JPanel InicioPnl;
    private javax.swing.JPanel LeftPnl;
    private javax.swing.JComboBox<String> NegCB;
    private javax.swing.JLabel NombreNegLbl;
    private javax.swing.JTextField NombreNegTF;
    private javax.swing.JLabel PrecioVentaLbl;
    private javax.swing.JPanel RegPnl;
    private javax.swing.JButton RegistroBtn;
    private javax.swing.JButton SalirBtn;
    private javax.swing.JComboBox<String> SexoCB;
    private javax.swing.JLabel SexoLbl;
    private javax.swing.JLabel SueldoLbl;
    private javax.swing.JTextField SueldoTF;
    private javax.swing.JComboBox<String> TipoNegCB;
    private javax.swing.JLabel TipoNegLbl;
    private javax.swing.JPanel TituloPnl;
    private javax.swing.JTextField UtilidadesTF;
    private javax.swing.JLabel acercaDeLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable registrosTbl;
    // End of variables declaration//GEN-END:variables
}
