
package hotelgrupo10.entidades;

import java.time.LocalDate;

public class Reserva {
    private int IdReserva;
    private Habitacion habitacion;
    private Huesped huesped;
    private Categoria categoria;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;
    private double PrecioTotal;
    private int CantPersonas;
    private boolean Estado;

    public Reserva(int IdReserva, Habitacion habitacion, Huesped huesped, Categoria categoria, LocalDate FechaInicio, LocalDate FechaFin, double PrecioTotal, int CantPersonas, boolean Estado) {
        this.IdReserva = IdReserva;
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.categoria= categoria;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.PrecioTotal = PrecioTotal;
        this.CantPersonas = CantPersonas;
        this.Estado = Estado;
    }

    public Reserva() {

    }

    public Reserva(Habitacion habitacion, Huesped huesped, Categoria categoria, LocalDate FechaInicio, LocalDate FechaFin, double PrecioTotal, int CantPersonas, boolean Estado) {
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.categoria= categoria;
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

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
        return "Reserva{" + "IdReserva=" + IdReserva + ", habitacion=" + habitacion + ", huesped=" + huesped + ", categoria=" + categoria + ", FechaInicio=" + FechaInicio + ", FechaFin=" + FechaFin + ", PrecioTotal=" + PrecioTotal + ", CantPersonas=" + CantPersonas + ", Estado=" + Estado + '}';
    }

    
    
    
   
}
