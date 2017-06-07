/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entradas;

/**
 *
 * @author nmadariaga
 */
public class Registro {
    private int Id;
    private String NombreNeg;
    private int Edad;
    private float CostoProd;
    private float Sueldo;
    private float Utilidades;
    private String FormaPago;
    private String Negocio;
    private String Sexo;
    private String Compatibilidad;
    private String RelacionPS;
    private String Resumen;
    private String Fecha;

    public Registro()
    {
        
    }
    public Registro(int Id, String NombreNeg, int Edad, float CostoProd, float Sueldo, float Utilidades, String FormaPago, String Negocio, String Sexo, String Compatibilidad, String RelacionPS, String Resumen, String Fecha) {
        this.Id = Id;
        this.NombreNeg = NombreNeg;
        this.Edad = Edad;
        this.CostoProd = CostoProd;
        this.Sueldo = Sueldo;
        this.Utilidades = Utilidades;
        this.FormaPago = FormaPago;
        this.Negocio = Negocio;
        this.Sexo = Sexo;
        this.Compatibilidad = Compatibilidad;
        this.RelacionPS = RelacionPS;
        this.Resumen = Resumen;
        this.Fecha = Fecha;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreNeg() {
        return NombreNeg;
    }

    public void setNombreNeg(String NombreNeg) {
        this.NombreNeg = NombreNeg;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getCostoProd() {
        return CostoProd;
    }

    public void setCostoProd(float CostoProd) {
        this.CostoProd = CostoProd;
    }

    public float getSueldo() {
        return Sueldo;
    }

    public void setSueldo(float Sueldo) {
        this.Sueldo = Sueldo;
    }

    public float getUtilidades() {
        return Utilidades;
    }

    public void setUtilidades(float Utilidades) {
        this.Utilidades = Utilidades;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    public String getNegocio() {
        return Negocio;
    }

    public void setNegocio(String Negocio) {
        this.Negocio = Negocio;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCompatibilidad() {
        return Compatibilidad;
    }

    public void setCompatibilidad(String Compatibilidad) {
        this.Compatibilidad = Compatibilidad;
    }

    public String getRelacionPS() {
        return RelacionPS;
    }

    public void setRelacionPS(String RelacionPS) {
        this.RelacionPS = RelacionPS;
    }

    public String getResumen() {
        return Resumen;
    }

    public void setResumen(String Resumen) {
        this.Resumen = Resumen;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
    
}
