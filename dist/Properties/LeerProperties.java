/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Properties;

/**
 *
 * @author nmadariaga
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import Entradas.ValorPuntaje;
import java.util.ArrayList;

public class LeerProperties {
    
    public void leerArchivo() 
    {
      try {
          
          /**Creamos un Objeto de tipo Properties*/
          Properties propiedades = new Properties();
          

          
          /**Cargamos el archivo desde la ruta especificada*/
          propiedades.load(new FileInputStream("/home/nmadariaga/NetBeansProjects/Prueba/src/prueba/edad_45_54.properties"));

          ArrayList<ValorPuntaje> Salario = new ArrayList<>();          
          for(int i=1; i<=5; i++)
          {
            ValorPuntaje g = new ValorPuntaje();              
          }
          
          
          /**Obtenemos los parametros definidos en el archivo*/
          String nombre = propiedades.getProperty("nombre");
          String pagina = propiedades.getProperty("apellido");

          /**Imprimimos los valores*/
          System.out.println("Nombre: "+nombre + "\n" +"Pagina: "+ pagina);     

      }
      catch (FileNotFoundException e)
      {
          System.out.println("Error, El archivo no exite");
      }
      catch (IOException e)
      {
          System.out.println("Error, No se puede leer el archivo");
      }
     }
}