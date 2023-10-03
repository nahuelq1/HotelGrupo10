/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgrupo10.entidades;

/**
 *
 * @author nahue
 */
public class Huesped {
    private int IdHuesped;
    private String Nombre;
    private String Apellido;
    private int DNI;
    private String Domicilio;
    private String Correo;
    private int Celular;
    private boolean Estado;

    
    
    
    
    public Huesped(String Nombre, String Apellido, int DNI, String Domicilio, String Correo, int Celular, boolean Estado) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Domicilio = Domicilio;
        this.Correo = Correo;
        this.Celular = Celular;
        this.Estado = Estado;
    }

    public Huesped() {
    }

    
    
    
    
    public Huesped(int IdHuesped, String Nombre, String Apellido, int DNI, String Domicilio, String Correo, int Celular, boolean Estado) {
        this.IdHuesped = IdHuesped;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Domicilio = Domicilio;
        this.Correo = Correo;
        this.Celular = Celular;
        this.Estado = Estado;
    }

    public int getIdHuesped() {
        return IdHuesped;
    }

    public void setIdHuesped(int IdHuesped) {
        this.IdHuesped = IdHuesped;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Huesped{" + "IdHuesped=" + IdHuesped + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", DNI=" + DNI + ", Domicilio=" + Domicilio + ", Correo=" + Correo + ", Celular=" + Celular + ", Estado=" + Estado + '}';
    }
    
    
}
