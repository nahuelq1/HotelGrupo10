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
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
        LocalDate fechaEntrada = resv.getFechaInicio();
        LocalDate fechaSalida = resv.getFechaFin();
        int cantPersonas = resv.getCantPersonas();

        CategoriaData categoriaData = new CategoriaData();
        List<Categoria> categoriasDisponibles = categoriaData.listarCategoriasDisponiblesPorCantidadPersonas(cantPersonas);

        if (categoriasDisponibles.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontró un tipo de habitación adecuado para la cantidad de personas.");
            return;
        }

        Categoria categoriaElegida = categoriasDisponibles.get(0); 

        // monto de la estadía.
        double precioPorNoche = categoriaElegida.getPrecio();
        long diasEstadia = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
        double montoEstadia = precioPorNoche * diasEstadia;

        HabitacionData habitacionData = new HabitacionData();
        Habitacion habitacionDisponible = habitacionData.obtenerHabitacionDisponiblePorCategoria(categoriaElegida.getIdCategoria());

        if (habitacionDisponible == null) {
            JOptionPane.showMessageDialog(null, "No hay habitaciones disponibles para esta categoría.");
            return; // Salir si no hay habitaciones disponibles.
        }

        resv.setHabitacion(habitacionDisponible);
        resv.setPrecioTotal(montoEstadia);
        resv.setEstado(true); // Estado = 1 (Activa)

        String sqlInsertReserva = "INSERT INTO reserva(idHabitacion, idHuesped, FechaInicio, FechaFin, PrecioTotal, CantPersonas, Estado) VALUES (?,?,?,?,?,?,?)";
        String sqlUpdateHabitacion = "UPDATE habitacion SET estado = 0 WHERE idHabitacion = ?";

        try {
            // Crear reserva
            PreparedStatement psInsert = con.prepareStatement(sqlInsertReserva, Statement.RETURN_GENERATED_KEYS);
            psInsert.setInt(1, resv.getHabitacion().getIdHabitacion());
            psInsert.setInt(2, resv.getHuesped().getIdHuesped());
            psInsert.setDate(3, Date.valueOf(fechaEntrada));
            psInsert.setDate(4, Date.valueOf(fechaSalida));
            psInsert.setDouble(5, montoEstadia);
            psInsert.setInt(6, cantPersonas);
            psInsert.setBoolean(7, true); // Estado = 1 (Activa)
            psInsert.executeUpdate();

            ResultSet rs = psInsert.getGeneratedKeys();
            if (rs.next()) {
                resv.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva creada con éxito.");
            }

            // Marcar la habitación como ocupada
            PreparedStatement psUpdateHabitacion = con.prepareStatement(sqlUpdateHabitacion);
            psUpdateHabitacion.setInt(1, resv.getHabitacion().getIdHabitacion());
            psUpdateHabitacion.executeUpdate();

            psInsert.close();
            psUpdateHabitacion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva o habitación.");
        }
    }

    public Reserva buscarReserva(int id) {

        String sql = "SELECT IdHabitacion,IdHuesped,FechaInicio,FechaFin,PrecioTotal,"
                + "CantPersonas FROM reserva WHERE idReserva= ? AND estado=1";
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
                categoria.setIdCategoria(rs.getInt("IdCategoria"));

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
            if (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setTipoHabitacion(rs.getString("tipoHabitacion"));
                categoria.setPrecio(rs.getDouble("precio"));
                Scanner leer = new Scanner(System.in);
                System.out.println("ingrese la cantidad de dias");
                double dias = leer.nextDouble();
                dias = dias * categoria.getPrecio();
                System.out.println("el total a pagar es " + dias);
                categorias.add(categoria);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla reserva");
        }

        return categorias;
    }

    public void finReserva(Huesped huesped) {

        String sql = "SELECT idReserva, idHabitacion FROM reserva WHERE idHuesped = ? AND Estado = 1";//busca resva
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
                JOptionPane.showMessageDialog(null, "Reserva existente.");
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

            if (idHabitacion != 0) {// marca la habitacion como libre
                String sqlMarcarHabitacion = "UPDATE habitacion SET Estado = 1 WHERE idHabitacion = ?";

                try {
                    PreparedStatement psMarcarHabitacion = con.prepareStatement(sqlMarcarHabitacion);
                    psMarcarHabitacion.setInt(1, idHabitacion);
                    int filasActualizadas = psMarcarHabitacion.executeUpdate();

                    if (filasActualizadas == 1) {
                        JOptionPane.showMessageDialog(null, "Habitación marcada como libre.");
                    } else {
                        JOptionPane.showMessageDialog(null, "La habitación no pudo ser marcada como libre.");
                    }

                    psMarcarHabitacion.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al marcar la habitación como libre.");
                }
            }

        }

    }
    
    public List<Reserva> busquedaDeReservaPorHuesped(Huesped huesped) {

        String sql = "SELECT * FROM reserva";
        ArrayList<Reserva> reservas = new ArrayList<>();
        Reserva res = new Reserva();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, huesped.getIdHuesped());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                res.setIdReserva(rs.getInt("idReserva"));
                Habitacion hab = hd.buscarHabitacion(rs.getInt("idHabitacion"));
                res.setHabitacion(hab);
                Huesped hus = hd2.buscarHuespedPorId(rs.getInt("idHuesped"));
                res.setHuesped(hus);
                res.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                res.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                res.setPrecioTotal(rs.getInt("precioTotal"));
                res.setCantPersonas(rs.getInt("cantPersonas"));
                res.setEstado(rs.getBoolean("estado"));
                reservas.add(res);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla reserva");
        }

        return reservas;

    }
    
    public List<Reserva> busquedaDeReservaPorFecha(String fecha) {

        String sql = "SELECT * FROM reserva";
        ArrayList<Reserva> reservas = new ArrayList<>();
        Reserva res = new Reserva();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            LocalDate f= LocalDate.parse(fecha);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                res.setIdReserva(rs.getInt("idReserva"));
                Habitacion hab = hd.buscarHabitacion(rs.getInt("idHabitacion"));
                res.setHabitacion(hab);
                Huesped hus = hd2.buscarHuespedPorId(rs.getInt("idHuesped"));
                res.setHuesped(hus);
                res.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                res.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                res.setPrecioTotal(rs.getInt("precioTotal"));
                res.setCantPersonas(rs.getInt("cantPersonas"));
                res.setEstado(rs.getBoolean("estado"));
                reservas.add(res);
            }
            ps.close();
        } catch (SQLException ex) {
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "error al acceder a la tabla reserva");
        }

        return reservas;

    } 
}
