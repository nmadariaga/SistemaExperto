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
import Entradas.Registro;
import java.util.List;

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
    
    public static List<Registro> mostrarTodo()
    {
        Connection c = null;
        Statement stmt = null;
        List<Registro> registroLista = new ArrayList<Registro>();
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:DataBase/SE_DATABASE.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
        
        
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM Registro_Consultas_Tbl;" );
            while ( rs.next() ) {
                Registro reg = new Registro();
                reg.setId(rs.getInt("Id"));
                reg.setNombreNeg(rs.getString("Nombre_Negocio"));
                reg.setEdad(rs.getInt("Edad"));
                reg.setCostoProd(rs.getFloat("Costo_Prod"));
                reg.setSueldo(rs.getFloat("Sueldo_Prom"));
                reg.setUtilidades(rs.getFloat("Utilidades"));
                reg.setFormaPago(rs.getString("Forma_Pago"));
                reg.setNegocio(rs.getString("Negocio"));
                reg.setSexo(rs.getString("Sexo"));
                reg.setCompatibilidad(rs.getString("Compatibilidad"));
                reg.setRelacionPS(rs.getString("RelacionPS"));
                reg.setResumen(rs.getString("Resumen"));
                reg.setFecha(rs.getString("Fecha"));
                
                registroLista.add(reg);
            }
            rs.close();
            stmt.close();
            c.close();
            
        } catch (Exception e) {
        }
    return registroLista;
    }
    
}
