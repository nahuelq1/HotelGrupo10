/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Norma
 */
public class ReservaData {

    private Connection con = null;
    private HabitacionData hd = new HabitacionData();
    private HuespedData hd2 = new HuespedData();

    public ReservaData() {

        this.con = con = Conexion.getConexion();

    }

    public void crearReserva(Reserva resv) {

        String sql = "INSERT INTO reserva(IdHabitacion,IdHuesped,FechaInicio,FechaFin,PrecioTotal,CantPersonas,Estado)"
                + "VALUES (?,?,?,?,?,?,?)";
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

    public Reserva buscarReserva(int idreserva, int idHabitacion, int idHuesped) {

        String sql = "SELECT IdHabitacion,IdHuesped,FechaInicio,FechaFin,PrecioTotal,CantPersonas FROM reserva WHERE idReserva= ? AND estado=1";
        Reserva reserva = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(3, idHuesped);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                reserva = new Reserva();
                Habitacion habitacion = new Habitacion();
                Huesped huesped = new Huesped();
                reserva.setIdReserva(idreserva);
                habitacion.setIdHabitacion(idHabitacion);
                huesped.setIdHuesped(idHuesped);
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

    public void cancelarReserva(Reserva reserva) {
        String sql = "UPDATE reserva SET estado = ? WHERE idreserva = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false); // Establece el estado de la reserva como "cancelada" (false)
            ps.setInt(2, reserva.getIdReserva()); // Suponiendo que tienes una propiedad "idReserva" en la clase Reserva
            int filas = ps.executeUpdate();
            ps.close();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Reserva cancelada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "La reserva no pudo ser cancelada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cancelar la reserva");
        }
    }

    
    
    
    //    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
//
//        ArrayList<Inscripcion> cursadas = new ArrayList<>();
//        String sql = "SELECT * FROM inscripcion WHERE idAlumno= ?";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, idAlumno);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Inscripcion insc = new Inscripcion();
//                insc.setIdInscripcion(rs.getInt("idInscripto"));
//                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
//                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
//                insc.setAlumno(alu);
//                insc.setMateria(mat);
//                insc.setNota(rs.getDouble("nota"));
//                cursadas.add(insc);
//
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
//        }
//
//        return cursadas;
//
//    }
    
public List<Categoria> mostrarHabitaciones(String TipoHabitacion){

   ArrayList<Categoria> categorias = new ArrayList<>();  
  String sql = "SELECT reserva.idHabitacion, tipoHabitacion, estado FROM reserva, Categoria WHERE reserva.idHabitacion = habitacion.idHabitacion AND reserva.idHuesped = ?;";
  
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, TipoHabitacion);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
            Categoria categoria= new Categoria();
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
  return categorias;
}
}











    