package hotelgrupo10.accesoADatos;

import hotelgrupo10.entidades.Categoria;
import hotelgrupo10.entidades.Habitacion;
import hotelgrupo10.entidades.Huesped;
import hotelgrupo10.entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ReservaData {

    private Connection con = null;
    private HabitacionData hd = new HabitacionData();
    private HuespedData hd2 = new HuespedData();

    public ReservaData() {

        this.con = con = Conexion.getConexion();

    }

    public void crearReserva(Reserva resv) {

        String sql = "INSERT INTO reserva(idHabitacion,idHuesped,FechaInicio,FechaFin,PrecioTotal,CantPersonas,Estado) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, resv.getHabitacion().getIdHabitacion());
            ps.setInt(2, resv.getHuesped().getIdHuesped());
            ps.setDate(3, Date.valueOf(resv.getFechaInicio()));
            ps.setDate(4, Date.valueOf(resv.getFechaFin()));
            ps.setDouble(5, resv.getPrecioTotal());
            ps.setInt(6, resv.getCantPersonas());
            ps.setBoolean(7, resv.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                resv.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "reserva guardada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }
    }

    public Reserva buscarReserva(int id) {

        String sql = "SELECT IdHabitacion,IdHuesped,FechaInicio,FechaFin,PrecioTotal,CantPersonas FROM reserva WHERE idReserva= ? AND estado=1";
        Reserva reserva = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reserva = new Reserva();
                Habitacion habitacion = new Habitacion();
                Huesped huesped = new Huesped();
                reserva.setIdReserva(id);
                habitacion.setIdHabitacion(id);
                huesped.setIdHuesped(id);
                reserva.setFechaInicio(rs.getDate("FechaInicio").toLocalDate());
                reserva.setFechaFin(rs.getDate("FechaFin").toLocalDate());
                reserva.setPrecioTotal(rs.getDouble("PrecioTotal"));
                reserva.setCantPersonas(rs.getInt("CantPersonas"));
                reserva.setEstado(true);

            } else {

                JOptionPane.showMessageDialog(null, "No existe esa reserva");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla reserva");
        }

        return reserva;
    }

    public void cancelarReserva(int id) {
        String sql = "UPDATE reserva SET estado = 0 WHERE idreserva = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filas = ps.executeUpdate();

            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Reserva cancelada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "La reserva no pudo ser cancelada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cancelar la reserva");
        }
    }

    public List<Categoria> mostrarHabitacionesLibres(String tipoHabitacion) {

        ArrayList<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT* FROM categoria WHERE tipoHabitacion=? AND estado=1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipoHabitacion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setTipoHabitacion(rs.getString("tipoHabitacion"));
                categoria.setEstado(rs.getBoolean("estado"));
                categorias.add(categoria);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla reserva");
        }
        return categorias;
    }

    public List<Categoria> montoEstadia(String tipoHabitacion) {

        String sql = "SELECT * FROM categoria WHERE tipoHabitacion=?";
        ArrayList<Categoria> categorias = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipoHabitacion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setTipoHabitacion(rs.getString("tipoHabitacion"));
                categoria.setPrecio(rs.getDouble("precio"));
                Scanner leer = new Scanner(System.in);
                System.out.println("ingrese la cantidad de dias");
                double dias = leer.nextDouble();
                dias = dias * categoria.getPrecio();
                System.out.println("el total a pagar es " + dias);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla reserva");
        }

        return categorias;
    }

    public void finReserva(Huesped huesped) {
        
        String sql= "SELECT idReserva, idHabitacion FROM reserva WHERE idHuesped = ? AND Estado = 1";//busca resva
        Reserva reserva = null;
        int idHabitacion = 0;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, huesped.getIdHuesped());
            ResultSet rsReserva = ps.executeQuery();

            if (rsReserva.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rsReserva.getInt("idReserva"));
                idHabitacion = rsReserva.getInt("idHabitacion");
            } else {
                JOptionPane.showMessageDialog(null, "No existe una reserva activa para este huésped.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva del huésped.");
        }

        if (reserva != null) {// Mcr reserva como inactiva
            String sqlMarcarReserva = "UPDATE reserva SET Estado = 0 WHERE idReserva = ?";

            try {
                PreparedStatement psMarcarReserva = con.prepareStatement(sqlMarcarReserva);
                psMarcarReserva.setInt(1, reserva.getIdReserva());
                int filasActualizadas = psMarcarReserva.executeUpdate();

                if (filasActualizadas == 1) {
                    JOptionPane.showMessageDialog(null, "Reserva marcada como inactiva.");
                } else {
                    JOptionPane.showMessageDialog(null, "La reserva no pudo ser marcada como inactiva.");
                }

                psMarcarReserva.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al marcar la reserva como inactiva.");
            }

        }

    }

}
