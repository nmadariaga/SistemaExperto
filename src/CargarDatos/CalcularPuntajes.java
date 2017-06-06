/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargarDatos;

import Entradas.ValorPuntaje;
import Entradas.Variables;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.util.Calendar;
import Principal.Configuraciones;


/**
 *
 * @author nmadariaga
 */
public class CalcularPuntajes {
    
    public static void ComenzarCalculos(Properties propiedades, Variables DatosIngresados)
    {
        ArrayList<ValorPuntaje> Valores = new ArrayList();
        String relacionPrecioSueldo;
        float precioDeVenta;
        try
        {
            Valores.add(puntajeSueldo(propiedades,DatosIngresados.getSueldo()));
            System.out.println("------");
            
            Valores.add(puntajeFormaPago(propiedades, DatosIngresados.getFormaDePago()));
            System.out.println("------");
            
            Valores.add(puntajeTipoNegocio(propiedades, DatosIngresados.getTipoNegocio()));
            System.out.println("------");
            
            
            
            precioDeVenta= precioDeVenta(DatosIngresados.getCostoProduccion(), DatosIngresados.getUtilidades());
            System.out.println("------");
            
            relacionPrecioSueldo= relacionPrecioSueldo(DatosIngresados.getSueldo(),precioDeVenta);
            
            CrearNuevaVentana(Valores, precioDeVenta, relacionPrecioSueldo, DatosIngresados);         
        }        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al comenzar calculos.");
            System.out.println("Ha ocurrido un error al comenzar los calculos");
        }
    }
    
    private static ValorPuntaje puntajeSueldo(Properties propiedades, String sueldo)
    {
        int sueldoInt= Integer.parseInt(sueldo);
        ValorPuntaje Salario = new ValorPuntaje();
        try{
            if(sueldoInt <100000)
            {sueldo= "Menor_100k";}
            
            else if(sueldoInt >= 100000 && sueldoInt <250000)
            {sueldo= "Entre_100k_249k";}
            
            else if(sueldoInt >= 250000 && sueldoInt <400000)
            {sueldo= "Entre_250k_399k";}
            
            else if(sueldoInt >= 400000 && sueldoInt <700000)
            {sueldo= "Entre_400k_699k";}
            
            else if(sueldoInt > 700000)
            {sueldo= "Mayor_700k";}
            
            for(int i=5; i>0; i--)
            {
                String valorSueldo= propiedades.getProperty("salario_"+ String.valueOf(i));
                if(valorSueldo.equals(sueldo))
                {
                    System.out.println("***Sueldo***");
                    Salario.setNombreVariable("Resultado Sueldo");
                    
                    System.out.println("Obteniendo valor del sueldo..."+valorSueldo);
                    Salario.setValor(valorSueldo);
                    
                    System.out.println("Obteniendo puntaje del sueldo..."+i);
                    Salario.setPuntaje(i);
                }                
            }
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error obteniendo puntaje de sueldo.");
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error obteniendo puntaje de sueldo.");
        }
        return Salario;
    }
    
    private static ValorPuntaje puntajeFormaPago(Properties propiedades, String formaPago)
    {   
        ValorPuntaje FormaPago = new ValorPuntaje();
        try
        {
            for(int i=4; i>0; i--)
            {
                String valorFormPago = propiedades.getProperty("forma_pago_"+ String.valueOf(i));
                if(valorFormPago.equals(formaPago))
                {
                    System.out.println("***Forma de Pago***");
                    FormaPago.setNombreVariable("Resultado Forma Pago");
                    
                    System.out.println("Obteniendo valor Forma de pago..."+valorFormPago);
                    FormaPago.setValor(valorFormPago);
                    
                    System.out.println("Obteniendo puntaje Forma de pago..."+i);
                    FormaPago.setPuntaje(i);                    
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error obteniendo forma de pago.");
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error obteniendo forma de pago.");
        }
        return FormaPago;
    }
    
    private static ValorPuntaje puntajeTipoNegocio(Properties propiedades, String tipoNegocio)
    {
        ValorPuntaje tipoNeg = new ValorPuntaje();
        try
        {
            if(tipoNegocio.equals("Beb.Alcoholicas"))
            {tipoNegocio = "Beb_Alc";}
            //Valores para negocio de productos
            for(int i= 6; i>0; i--)
            {
                String valorTipoNeg = propiedades.getProperty("prod_util_"+String.valueOf(i));
                if(valorTipoNeg.equals(tipoNegocio))
                {
                    System.out.println("***Tipo de Negocio***");
                    tipoNeg.setNombreVariable("Resultado tipo de negocio");
                    
                    System.out.println("Obteniendo valor Tipo de Negocio..."+valorTipoNeg);
                    tipoNeg.setValor(valorTipoNeg);
                    
                    System.out.println("Obteniendo puntaje Tipo de Negocio..."+i);
                    tipoNeg.setPuntaje(i); 
                    
                }
            }
            for(int j= 5; j>0; j--)
            {
                String valorTipoNeg = propiedades.getProperty("ser_util_"+String.valueOf(j));
                if(valorTipoNeg.equals(tipoNegocio))
                {
                    System.out.println("***Tipo de Negocio***");
                    tipoNeg.setNombreVariable("Resultado tipo de negocio");
                    
                    System.out.println("Obteniendo valor Tipo de Negocio..."+valorTipoNeg);
                    tipoNeg.setValor(valorTipoNeg);
                    
                    System.out.println("Obteniendo puntaje Tipo de Negocio..."+j);
                    tipoNeg.setPuntaje(j); 
                    
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error obteniendo tipo de negocio.");
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error obteniendo tipo de negocio.");
        }
        return tipoNeg;
    }
    
    private static float precioDeVenta(String costoProd, String utilidades)
    {
        float precioDeVentaFl= 0;
        float porcentajeUtil= Float.parseFloat(utilidades);
        porcentajeUtil= porcentajeUtil/(100);
        try
        {
            precioDeVentaFl= Float.valueOf(costoProd)/(1-porcentajeUtil);
            System.out.println("Obteniendo precio de Venta..."+String.valueOf(precioDeVentaFl));
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error calculando precio de venta.");
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error calculando precio de venta.");
        }
        return precioDeVentaFl;
    }
    
    private static String relacionPrecioSueldo(String sueldo, float precioDeVenta)
    {
        String porcentaje= null;
        float porcentajeAux= 0;
        try
        {
            porcentajeAux= (precioDeVenta * 100)/Float.parseFloat(sueldo);
            System.out.println("Porcentaje relacion sueldo: "+porcentajeAux);
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error obteniendo relacion precio-sueldo.");
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error obteniendo precio-sueldo.");
        }
        
        return porcentaje= String.valueOf(porcentajeAux);
    }
    
    private static void CrearNuevaVentana(ArrayList<ValorPuntaje> Valores, float precioDeVenta, String relacionPrecioSueldo, Variables DatosIngresados )
    {
        ArrayList<String> resultados= new ArrayList<String>();
        try
        {
            //Creacion de ventana de resultados
            JFrame ventanaResultados = new JFrame();
            ventanaResultados.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            ventanaResultados.setBounds(400, 150, 610, 400);
            ventanaResultados.setResizable(false);
            ventanaResultados.setTitle("Resultados");
            ventanaResultados.setVisible(true);
            
            //Label fondo de ventana de resultados
            JLabel fondoResultadosLbl = new JLabel();
            fondoResultadosLbl.setBounds(400, 150, 600, 400);
            fondoResultadosLbl.setIcon(new javax.swing.ImageIcon(CalcularPuntajes.class.getClass().getResource("/Imagenes/FondoResultados.png"))); // NOI18N

            //Label de titulo de la ventana
            JLabel TituloLbl = new JLabel();
            TituloLbl.setFont(new java.awt.Font("Noto Sans", 1, 14));
            TituloLbl.setForeground(new java.awt.Color(72, 97, 123));
            TituloLbl.setText("RESULTADOS OBTENIDOS");
            TituloLbl.setBounds(40, 64, 580, 40);
            fondoResultadosLbl.add(TituloLbl);
            
            JLabel labelTitulo = new JLabel();
            labelTitulo.setFont(new java.awt.Font("Noto Sans", 1, 14));
            labelTitulo.setForeground(new java.awt.Color(208,219,225));
            labelTitulo.setText("RESULTADOS EVALUACION");
            labelTitulo.setBounds(200, 10, 580, 40);
            fondoResultadosLbl.add(labelTitulo);
            
            //ventanaResultados.add(fondoResultadosLbl);
            
            resultados= obtenerResultadoFinal(Valores, precioDeVenta, relacionPrecioSueldo);
            
            JLabel compatibilidadLbl= new JLabel();
            compatibilidadLbl.setFont(new java.awt.Font("Noto Sans",1,14));
            compatibilidadLbl.setForeground(new java.awt.Color(208, 219, 225));
            compatibilidadLbl.setText("COMPATIBILIDAD CON MERCADO");
            compatibilidadLbl.setBounds(50, 105, 330, 40);
            fondoResultadosLbl.add(compatibilidadLbl);
            
            JLabel pjtCompLbl= new JLabel();
            pjtCompLbl.setFont(new java.awt.Font("Noto Sans",1,20));
            pjtCompLbl.setForeground(new java.awt.Color(208, 219, 225));
            pjtCompLbl.setText(resultados.get(1) + "/10");
            pjtCompLbl.setBounds(200, 140, 330, 40);
            fondoResultadosLbl.add(pjtCompLbl);
            
            JLabel menComLbl= new JLabel();
            menComLbl.setFont(new java.awt.Font("Noto Sans",1,20));
            menComLbl.setForeground(new java.awt.Color(208, 219, 225));
            menComLbl.setText(resultados.get(0));
            menComLbl.setBounds(300, 140, 330, 40);
            fondoResultadosLbl.add(menComLbl);
            
            JLabel relacionLbl= new JLabel();
            relacionLbl.setFont(new java.awt.Font("Noto Sans",1,14));
            relacionLbl.setForeground(new java.awt.Color(208, 219, 225));
            relacionLbl.setText("RELACION PRECIO-SUELDO");
            relacionLbl.setBounds(50, 180, 330, 40);
            fondoResultadosLbl.add(relacionLbl);                      

            JLabel ptjPSLbl= new JLabel();
            ptjPSLbl.setFont(new java.awt.Font("Noto Sans",1,20));
            ptjPSLbl.setForeground(new java.awt.Color(208, 219, 225));
            ptjPSLbl.setText(resultados.get(3) + "/10");
            ptjPSLbl.setBounds(200, 215, 330, 40);
            fondoResultadosLbl.add(ptjPSLbl);
            
            JLabel menPVLbl= new JLabel();
            menPVLbl.setFont(new java.awt.Font("Noto Sans",1,20));
            menPVLbl.setForeground(new java.awt.Color(208, 219, 225));
            menPVLbl.setText(resultados.get(2));
            menPVLbl.setBounds(300, 215, 330, 40);
            fondoResultadosLbl.add(menPVLbl);
            
            JLabel resultadoLbl= new JLabel();
            resultadoLbl.setFont(new java.awt.Font("Noto Sans",1,14));
            resultadoLbl.setForeground(new java.awt.Color(208, 219, 225));
            resultadoLbl.setText("SE RECOMIENDA:");
            resultadoLbl.setBounds(50, 255, 330, 40);
            fondoResultadosLbl.add(resultadoLbl);
            
            JTextArea resultadoMsjTA= new JTextArea();
            resultadoMsjTA.setFont(new java.awt.Font("Noto Sans",1,14));
            resultadoMsjTA.setForeground(new java.awt.Color(69, 98, 121));
            resultadoMsjTA.setText(resultados.get(4));
            resultadoMsjTA.setBounds(50, 285, 400, 50);
            resultadoMsjTA.setEditable(false);
            fondoResultadosLbl.add(resultadoMsjTA);
            
            CrearPdf(fondoResultadosLbl, DatosIngresados, resultados);
                    
            
            ventanaResultados.add(fondoResultadosLbl);
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error creando ventana de resultados.");
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public static ArrayList<String> obtenerResultadoFinal(ArrayList<ValorPuntaje> Valores, float precioDeVenta, String relacionPrecioSueldo)
    {
        ArrayList<String> ResultadosFinales= new ArrayList<String>();
        int largoArray= Valores.size();
        int sumaCompatibilidad= 0;
        float porcentajeCompatibilidad;
        float relacionPS;
        String coordX= null;
        String coordY= null;
        Properties propiedades= new Properties();
        DecimalFormat df= new DecimalFormat("0.0"); 
        try{
            for(int i= 0; i< largoArray; i++)
            {sumaCompatibilidad= Valores.get(i).getPuntaje() + sumaCompatibilidad;}
            
            if(sumaCompatibilidad >= 14 && sumaCompatibilidad <= 16)
            {ResultadosFinales.add("Excelente"); coordX= "E";}
            
            else if(sumaCompatibilidad >= 11 && sumaCompatibilidad <= 13)
            {ResultadosFinales.add("Muy Bueno"); coordX= "MB";}
            
            else if(sumaCompatibilidad >= 6 && sumaCompatibilidad <= 10)
            {ResultadosFinales.add("Regular"); coordX= "R";}
            
            else if(sumaCompatibilidad >= 1 && sumaCompatibilidad <= 5)
            {ResultadosFinales.add("Malo"); coordX= "M";}
            
            porcentajeCompatibilidad= (((float)sumaCompatibilidad*10)/16);           
            ResultadosFinales.add(String.valueOf(df.format(porcentajeCompatibilidad)));

            relacionPS = Float.parseFloat(relacionPrecioSueldo);
            if(relacionPS > 0 && relacionPS <= 15)
            {
                ResultadosFinales.add("Buena");
                ResultadosFinales.add(String.valueOf(df.format(10-relacionPS*0.1)));
                coordY= "B";
            }
            else if(relacionPS > 15 && relacionPS <= 25)
            {
                ResultadosFinales.add("Regular Buena");
                ResultadosFinales.add(String.valueOf(df.format(10-relacionPS*0.1)));
                coordY= "RB";
            }
            else if(relacionPS > 25 && relacionPS <= 35)
            {
                ResultadosFinales.add("Regular Mala");
                ResultadosFinales.add(String.valueOf(df.format(10-relacionPS*0.1)));
                coordY= "RM";
            }
            else if(relacionPS > 35)
            {
                ResultadosFinales.add("Mala");
                double a= 10-relacionPS*0.1;
                if(a > 0)
                {ResultadosFinales.add(String.valueOf(df.format(10-relacionPS*0.1)));}
                else if(a<0)
                {ResultadosFinales.add("0");}
                
                coordY= "M";
            }
            else if(relacionPS < 0.0)
            {
                ResultadosFinales.add("Mala");
                ResultadosFinales.add("0");
                coordY= "M";
            }
            propiedades.load(new FileInputStream(Configuraciones.obtenerRutaJar()+"/Properties/coordenadas.properties"));
            String Resultado= propiedades.getProperty(coordX+"_"+coordY);
            ResultadosFinales.add(Resultado);
        }
        catch(NumberFormatException | IOException e)
        {
            System.out.println("Ha ocurrido un error al mostrar el resultado final.");
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al mostrar el resultado final.");
        }
        return ResultadosFinales;
    }
    private static void CrearPdf(JLabel fondoResultadosLbl, Variables DatosIngresados, ArrayList<String> resultados)
    {
        try {
            JButton pdfBtn= new JButton();
            pdfBtn.setBounds(460, 295, 110, 30);                    
            pdfBtn.setText("Guardar PDF");
            pdfBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try {
                        Date fecha = new Date();
                        Calendar c1 = Calendar.getInstance();
                        int dia= c1.get(Calendar.DATE);
                        int mes= c1.get(Calendar.MONTH)+1;
                        int annio= c1.get(Calendar.YEAR);
                        javax.swing.JFileChooser jFC= new javax.swing.JFileChooser(); 
                        String ruta = null; 
             
                        if(jFC.showSaveDialog(null)==jFC.APPROVE_OPTION){
                            
                            
                            ruta = jFC.getSelectedFile().getAbsolutePath();
                            FileOutputStream archivo= new FileOutputStream(ruta + " "+fecha.getHours() + ":"+fecha.getMinutes()
                                    + "-" + dia + mes + annio + ".pdf");
                            Document doc = new Document();
                            PdfWriter.getInstance(doc, archivo);
                            doc.open();
                            doc.addTitle("SISTEMA EXPERTO EVALUADOR DE NEGOCIOS");
                            doc.add(new Paragraph("Sistema Experto Evaulador de Negocios"));
                            doc.add(new Paragraph("\n"));
                            doc.add(new Paragraph("Fecha: "+dia+"-"+mes+"-"+annio));
                            doc.add(new Paragraph("Hora: "+fecha.getHours()+":"+fecha.getMinutes()));
                            doc.add(new Paragraph("\n"));
                            doc.add(new Paragraph("Datos Ingresados:"));
                            doc.add(new Paragraph("\n"));
                            doc.add(new Paragraph("Edad: "+DatosIngresados.getEdad()+" años"));
                            doc.add(new Paragraph("Costo de produccion: "+DatosIngresados.getCostoProduccion()+" pesos"));
                            doc.add(new Paragraph("Sueldo promedio: "+DatosIngresados.getSueldo()+" pesos"));
                            doc.add(new Paragraph("Utilidades: "+DatosIngresados.getUtilidades()+"%"));
                            doc.add(new Paragraph("Forma de pago: "+DatosIngresados.getFormaDePago()));                        
                            doc.add(new Paragraph("Negocio: "+DatosIngresados.getTipoNegocio()));
                            doc.add(new Paragraph("Sexo: "+DatosIngresados.getSexo()));
                            doc.add(new Paragraph("\n"));
                            doc.add(new Paragraph("COMPATIBILIDAD CON EL MERCADO"));
                            doc.add(new Paragraph("\n"));
                            doc.add(new Paragraph(resultados.get(1)+"/10"+"           "+resultados.get(0)));
                            doc.add(new Paragraph("\n"));
                            doc.add(new Paragraph("RELACION PRECIO-SUELDO"));
                            doc.add(new Paragraph("\n"));
                            doc.add(new Paragraph(resultados.get(3)+"/10"+"           "+resultados.get(2)));
                            doc.add(new Paragraph("\n"));
                            doc.add(new Paragraph("RESUMEN"));
                            doc.add(new Paragraph("\n"));
                            doc.add(new Paragraph(resultados.get(4)));
                            doc.close();
                        }                   
                        
                        JOptionPane.showMessageDialog(null, "Guardado correctamente en: "+ruta);
                    } catch (FileNotFoundException | DocumentException ex) {
                        Logger.getLogger(CalcularPuntajes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
            fondoResultadosLbl.add(pdfBtn);
        }
        catch (Exception e) {
        }
    }
}
