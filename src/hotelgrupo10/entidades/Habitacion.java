
package hotelgrupo10.entidades;

public class Habitacion {
    
    private int IdHabitacion;
    private Categoria categoria;
    private int NroHabitacion;
    private int Piso;
    private boolean estado;

    public Habitacion() {
    }

    public Habitacion(int IdHabitacion, Categoria categoria, int NroHabitacion, int Piso, boolean estado) {
        this.IdHabitacion = IdHabitacion;
        this.categoria = categoria;
        this.NroHabitacion = NroHabitacion;
        this.Piso = Piso;
        this.estado = estado;
    }

    public Habitacion(Categoria categoria, int NroHabitacion, int Piso, boolean estado) {
        this.categoria = categoria;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "IdHabitacion=" + IdHabitacion + ", categoria=" + categoria + ", NroHabitacion=" + NroHabitacion + ", Piso=" + Piso + ", estado=" + estado + '}';
    }
    
    

    
}
