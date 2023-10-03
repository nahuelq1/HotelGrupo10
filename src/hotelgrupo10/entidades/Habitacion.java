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
public class Habitacion {
    
    private int IdHabitacion;
    private int Idcategoria;
    private int NroHabitacion;
    private int Piso;
    private boolean estado;

    public Habitacion(int Idcategoria, int NroHabitacion, int Piso, boolean estado) {
        this.Idcategoria = Idcategoria;
        this.NroHabitacion = NroHabitacion;
        this.Piso = Piso;
        this.estado = estado;
    }

    public Habitacion() {
    }
    
    
    
    public Habitacion(int IdHabitacion, int Idcategoria, int NroHabitacion, int Piso, boolean estado) {
        this.IdHabitacion = IdHabitacion;
        this.Idcategoria = Idcategoria;
        this.NroHabitacion = NroHabitacion;
        this.Piso = Piso;
        this.estado = estado;
    }
    

    public int getIdHabitacion() {
        return IdHabitacion;
    }

    public void setIdHabitacion(int IdHabitacion) {
        this.IdHabitacion = IdHabitacion;
    }

    public int getIdcategoria() {
        return Idcategoria;
    }

    public void setIdcategoria(int Idcategoria) {
        this.Idcategoria = Idcategoria;
    }

    public int getNroHabitacion() {
        return NroHabitacion;
    }

    public void setNroHabitacion(int NroHabitacion) {
        this.NroHabitacion = NroHabitacion;
    }

    public int getPiso() {
        return Piso;
    }

    public void setPiso(int Piso) {
        this.Piso = Piso;
    }

    public boolean isestado() {
        return estado;
    }

    public void setestado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "IdHabitacion=" + IdHabitacion + ", Idcategoria=" + Idcategoria + ", NroHabitacion=" + NroHabitacion + ", Piso=" + Piso + ", estado=" + estado + '}';
    }
    
    
}
