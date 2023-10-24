package hotelgrupo10.accesoADatos;

import hotelgrupo10.entidades.Categoria;
import java.sql.Connection;
import hotelgrupo10.entidades.Habitacion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HabitacionData {

    private Connection con = null;

    public HabitacionData() {
        con = Conexion.getConexion();
    }

    public void crearHabitacion(Habitacion habit) {
        String sql = "INSERT INTO habitacion (idHabitacion, idCategoria, nroHabitacion, piso, estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habit.getIdHabitacion());
            ps.setInt(2, habit.getCategoria().getIdCategoria());
            ps.setInt(3, habit.getNroHabitacion());
            ps.setInt(4, habit.getPiso());
            ps.setBoolean(5, habit.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habit.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva realizada con exito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar la reserva");
        }
    }

    public void modificarHabitacion(Habitacion habit) {
        String sql = "UPDATE habitacion SET idCategoria=?,nroHabitacion=?,piso=?,estado=? WHERE "
                + "idHabitacion= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habit.getCategoria().getIdCategoria());
            ps.setInt(2, habit.getNroHabitacion());
            ps.setInt(3, habit.getPiso());
            ps.setBoolean(4, habit.isEstado());
            ps.setInt(5, habit.getIdHabitacion());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion modificada");
            } else {

                JOptionPane.showMessageDialog(null, "no se realizaron cambios");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion");
        }
    }

    public void eliminarHabitacion(int IdHabit) {
        String sql = "UPDATE habitacion SET estado=0 WHERE idHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdHabit);
            int exito = ps.executeUpdate();
            ps.close();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion eliminada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "La Habitacion no pudo ser eliminada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar Habitacion");
        }
    }

    public List<Habitacion> listarHabitaciones() {
        String sql = "SELECT idHabitacion, idCategoria, NroHabitacion, Piso, estado "
                + "FROM habitacion WHERE estado = 1";
        ArrayList<Habitacion> habitaciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();

                CategoriaData categD = new CategoriaData();
                int idCategoria = rs.getInt("idCategoria");
                Categoria categoria = categD.buscarCategoria(idCategoria);

                habitacion.setCategoria(categoria);
                habitacion.setNroHabitacion(rs.getInt("NroHabitacion"));
                habitacion.setPiso(rs.getInt("Piso"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setIdHabitacion(rs.getInt("IdHabitacion"));

                habitaciones.add(habitacion);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitación");
        }

        return habitaciones;
    }

    public Habitacion buscarHabitacion(int idHabitacion) {
        String sql = "SELECT idCategoria, NroHabitacion, Piso, estado "
                + "FROM habitacion WHERE IdHabitacion = ? ";
        Habitacion habitacionEncontrada = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                habitacionEncontrada = new Habitacion();
                habitacionEncontrada.setIdHabitacion(idHabitacion);
                CategoriaData categD = new CategoriaData();

                Categoria categoria = categD.buscarCategoria(rs.getInt("idCategoria"));

                habitacionEncontrada.setCategoria(categoria);
                habitacionEncontrada.setNroHabitacion(rs.getInt("NroHabitacion"));
                habitacionEncontrada.setPiso(rs.getInt("Piso"));
                habitacionEncontrada.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe esa habitación");
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la habitación");
        }

        return habitacionEncontrada;
    }

    public Habitacion obtenerHabitacionDisponiblePorCategoria(int idCategoria) {
        Habitacion habitacionDisponible = null;
        String sql = "SELECT * FROM habitacion WHERE idCategoria = ? AND estado = 1 LIMIT 1"; // LIMIT SOLO para una hab

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                habitacionDisponible = new Habitacion();
                habitacionDisponible.setIdHabitacion(rs.getInt("idHabitacion"));
                CategoriaData categD = new CategoriaData();

                habitacionDisponible.setCategoria(categD.buscarCategoria(rs.getInt("idCategoria")));
                habitacionDisponible.setNroHabitacion(rs.getInt("NroHabitacion"));
                habitacionDisponible.setPiso(rs.getInt("Piso"));
                habitacionDisponible.setEstado(rs.getBoolean("estado"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitación");
        }

        return habitacionDisponible;
    }

    public List<Habitacion> ListobtenerHabitacionesDisponiblesPorCategoria(int idCategoria) {
        List<Habitacion> habitacionesDisponibles = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE idCategoria = ? AND estado = 1"; // Sin LIMIT para obtener todas las habitaciones disponibles

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                CategoriaData categD = new CategoriaData();
                habitacion.setCategoria(categD.buscarCategoria(rs.getInt("idCategoria")));
                habitacion.setNroHabitacion(rs.getInt("NroHabitacion"));
                habitacion.setPiso(rs.getInt("Piso"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacionesDisponibles.add(habitacion);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitación");
        }

        return habitacionesDisponibles;
    }
}
