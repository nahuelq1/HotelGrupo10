package hotelgrupo10.entidades;

public class Categoria {

    private int idCategoria;
    private int CantPersonas;
    private int CantCamas;
    private String TipoCamas;
    private String TipoHabitacion;
    private double Precio;
    private boolean Estado;

    public Categoria(int CantPersonas, int CantCamas, String TipoCamas, String TipoHabitacion, double Precio, boolean Estado) {
        this.CantPersonas = CantPersonas;
        this.CantCamas = CantCamas;
        this.TipoCamas = TipoCamas;
        this.TipoHabitacion = TipoHabitacion;
        this.Precio = Precio;
        this.Estado = Estado;
    }

    public Categoria() {
    }

    public Categoria(int idCategoria, int CantPersonas, int CantCamas, String TipoCamas, String TipoHabitacion, double Precio, boolean Estado) {
        this.idCategoria = idCategoria;
        this.CantPersonas = CantPersonas;
        this.CantCamas = CantCamas;
        this.TipoCamas = TipoCamas;
        this.TipoHabitacion = TipoHabitacion;
        this.Precio = Precio;
        this.Estado = Estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getCantPersonas() {
        return CantPersonas;
    }

    public void setCantPersonas(int CantPersonas) {
        this.CantPersonas = CantPersonas;
    }

    public int getCantCamas() {
        return CantCamas;
    }

    public void setCantCamas(int CantCamas) {
        this.CantCamas = CantCamas;
    }

    public String getTipoCamas() {
        return TipoCamas;
    }

    public void setTipoCamas(String TipoCamas) {
        this.TipoCamas = TipoCamas;
    }

    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", CantPersonas=" + CantPersonas + ", CantCamas=" + CantCamas + ", TipoCamas=" + TipoCamas + ", TipoHabitacion=" + TipoHabitacion + ", Precio=" + Precio + ", Estado=" + Estado + '}';
    }

}
