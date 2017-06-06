/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargarDatos;

/**
 *
 * @author nmadariaga
 */
import Entradas.Variables;
import java.io.FileInputStream;
import java.util.Properties;
import CargarDatos.CalcularPuntajes;
import Principal.Configuraciones;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.security.CodeSource;
import Principal.Configuraciones;

import javax.swing.JOptionPane;


public class CargarDatos {
        
    public static int enviarVariables(Variables DatosIngresados)
    { 
        int resultadoFinal= 0;
        int edad;
        String sexo;
        try{
            Properties propiedades = new Properties();
            edad = Integer.parseInt(DatosIngresados.getEdad());
            sexo = DatosIngresados.getSexo();
            switch (sexo) {
                case "Hombre":
                    propiedades.load(new FileInputStream(Configuraciones.obtenerRutaJar()+"/Properties/sexo_hombre.properties"));
                    CalcularPuntajes.ComenzarCalculos(propiedades,DatosIngresados);
                    System.out.println("..Sexo Hombre..");
                    break;
                case "Mujer":
                    propiedades.load(new FileInputStream(Configuraciones.obtenerRutaJar()+"/Properties/sexo_mujer.properties"));
                    //propiedades.load(new FileInputStream("src/Properties/sexo_mujer.properties"));
                    CalcularPuntajes.ComenzarCalculos(propiedades,DatosIngresados);
                    System.out.println("..Sexo Mujer..");
                    break;
                case "Ambos":
                    if(edad >17 && edad <25)
                    {
                        propiedades.load(new FileInputStream(Configuraciones.obtenerRutaJar()+"/Properties/edad_18_24.properties"));
                        //propiedades.load(new FileInputStream("src/Properties/edad_18_24.properties"));
                        System.out.println("..Edad entre 17 y 25..");
                        CalcularPuntajes.ComenzarCalculos(propiedades,DatosIngresados);
                        
                    }else if(edad >24 && edad <35)
                    {
                        propiedades.load(new FileInputStream(Configuraciones.obtenerRutaJar()+"/Properties/edad_25_34.properties"));
                        //propiedades.load(new FileInputStream("src/Properties/edad_25_34.properties"));
                        System.out.println("..Edad entre 25 y 35..");
                        CalcularPuntajes.ComenzarCalculos(propiedades,DatosIngresados);
                        
                    }else if(edad >34 && edad <45)
                    {
                        propiedades.load(new FileInputStream(Configuraciones.obtenerRutaJar()+"/Properties/edad_35_44.properties"));
                        //propiedades.load(new FileInputStream("src/Properties/edad_35_44.properties"));
                        System.out.println("..Edad entre 34 y 45..");
                        CalcularPuntajes.ComenzarCalculos(propiedades,DatosIngresados);
                    }else if(edad >44 && edad <55)
                    {
                        propiedades.load(new FileInputStream(Configuraciones.obtenerRutaJar()+"/Properties/edad_45_54.properties"));
                       //propiedades.load(new FileInputStream("src/Properties/edad_45_54.properties"));
                        System.out.println("..Edad entre 44 y 55..");
                        CalcularPuntajes.ComenzarCalculos(propiedades,DatosIngresados);
                        
                    }else if(edad >54 && edad <66)
                    {
                        propiedades.load(new FileInputStream(Configuraciones.obtenerRutaJar()+"/Properties/edad_55_65.properties"));
                        //propiedades.load(new FileInputStream("src/Properties/edad_55_65.properties"));
                        System.out.println("..Edad entre 55 y 65..");
                        CalcularPuntajes.ComenzarCalculos(propiedades,DatosIngresados);
                    }
                    else if(edad > 65 )
                    {
                        JOptionPane.showMessageDialog(null, "La edad ingresada no está contemplada.");
                    }
                    break;
                default:
                    break;
            }
            
            
        }
        catch(NumberFormatException | IOException | HeadlessException e)
        {
            //JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error inesperado al cargar el archivo de datos.");
        }
        return resultadoFinal;
    }
}
