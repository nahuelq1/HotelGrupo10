/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgrupo10.entidades;

import java.time.LocalDate;

/**
 *
 * @author nahue
 */
public class Reserva {
    private int IdReserva;
    private int IdHabitacion;
    private int IdHuesped;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;
    private double PrecioTotal;
    private int CantPersonas;
    private boolean Estado;

    public Reserva(int IdReserva, int IdHabitacion, int IdHuesped, LocalDate FechaInicio, LocalDate FechaFin, double PrecioTotal, int CantPersonas, boolean Estado) {
        this.IdReserva = IdReserva;
        this.IdHabitacion = IdHabitacion;
        this.IdHuesped = IdHuesped;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.PrecioTotal = PrecioTotal;
        this.CantPersonas = CantPersonas;
        this.Estado = Estado;
    }

    public int getIdReserva() {
        return IdReserva;
    }

    public void setIdReserva(int IdReserva) {
        this.IdReserva = IdReserva;
    }

    public int getIdHabitacion() {
        return IdHabitacion;
    }

    public void setIdHabitacion(int IdHabitacion) {
        this.IdHabitacion = IdHabitacion;
    }

    public int getIdHuesped() {
        return IdHuesped;
    }

    public void setIdHuesped(int IdHuesped) {
        this.IdHuesped = IdHuesped;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate FechaFin) {
        this.FechaFin = FechaFin;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    public int getCantPersonas() {
        return CantPersonas;
    }

    public void setCantPersonas(int CantPersonas) {
        this.CantPersonas = CantPersonas;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "IdReserva=" + IdReserva + ", IdHabitacion=" + IdHabitacion + ", IdHuesped=" + IdHuesped + ", FechaInicio=" + FechaInicio + ", FechaFin=" + FechaFin + ", PrecioTotal=" + PrecioTotal + ", CantPersonas=" + CantPersonas + ", Estado=" + Estado + '}';
    }
    
    
    
}
