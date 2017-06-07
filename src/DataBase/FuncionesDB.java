/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Entradas.Variables;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nmadariaga
 */
public class FuncionesDB {
    
    public static void Insert(Variables DatosIngresados, ArrayList<String> resultados)
  {
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:DataBase/SE_DATABASE.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");
      
      
      
      stmt = c.createStatement();
        System.out.println("A crear script");
      String sql = crearScriptSql(DatosIngresados, resultados);
      System.out.println("script creado correctamente");
      stmt.executeUpdate(sql);

      stmt.close();
      c.commit();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Records created successfully");
  }
    
    /**
     *
     * @param args
     */
    public static void Select()
  {
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:test.db");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery( "SELECT * FROM nombrestbl;" );
      while ( rs.next() ) {
         int id = rs.getInt("ID");
         String  name = rs.getString("Nombre");
         System.out.println( "ID = " + id );
         System.out.println( "NAME = " + name );
         System.out.println();
      }
      rs.close();
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Operation done successfully");
  }
    
    private static String crearScriptSql(Variables DatosIngresados, ArrayList<String> resultados)
    {
        String sql= null;
        try
        {
            
            String compatibilidad= resultados.get(1)+"/10"+" "+resultados.get(0);
            String relacionPS= resultados.get(3)+"/10"+" "+resultados.get(2);
            String resumen= resultados.get(4);
            
            Date fecha = new Date();
            Calendar c1 = Calendar.getInstance();
            int dia= c1.get(Calendar.DATE);
            int mes= c1.get(Calendar.MONTH)+1;
            int annio= c1.get(Calendar.YEAR);
            
            String fechaString = String.valueOf(dia)+"-"+String.valueOf(mes)+"-"+String.valueOf(annio);
            
            sql= "INSERT INTO Registro_Consultas_Tbl("
                   + "Nombre_Negocio,"
                   + "Edad,"
                   + "Costo_Prod,"
                   + "Sueldo_Prom,"
                   + "Utilidades,"
                   + "Forma_Pago,"
                   + "Negocio,"
                   + "Sexo,"
                   + "Compatibilidad,"
                   + "RelacionPS,"
                   + "Resumen,"
                   + "Fecha) VALUES("
                   + "'"+ DatosIngresados.getNombreNeg()+"',"
                   + "'"+ DatosIngresados.getEdad()+"',"
                   + "'"+ DatosIngresados.getCostoProduccion()+"',"
                   + "'"+ DatosIngresados.getSueldo()+"',"
                   + "'"+ DatosIngresados.getUtilidades()+"',"
                   + "'"+ DatosIngresados.getFormaDePago()+"',"
                   + "'"+ DatosIngresados.getTipoNegocio()+"',"
                   + "'"+ DatosIngresados.getSexo()+"',"
                   + "'"+ compatibilidad +"',"
                   + "'"+ relacionPS +"',"
                   + "'"+ resumen +"',"
                   + "'"+ fechaString+"');";
            
        }catch(Exception ex)
        {
            
        }
        return sql;
    }
}
