/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgrupo10.accesoADatos;

import hotelgrupo10.entidades.Habitacion;
import hotelgrupo10.entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

public void crearReserva(Reserva resv){

String sql="INSERT INTO reserva(IdHabitacion,IdHuesped,FechaInicio,FechaFin,PrecioTotal,CantPersonas,Estado)"
        + "VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,resv.getHabitacion().getIdHabitacion());
            ps.setInt(2, resv.getHuesped().getIdHuesped());
            ps.setDate(3,Date.valueOf(resv.getFechaInicio()));
            ps.setDate(4,Date.valueOf(resv.getFechaFin()));
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

//    public Alumno buscarAlumno(int id) {
//
//        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno= ? AND estado=1";
//        Alumno alumno = null;
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                alumno = new Alumno();
//                alumno.setIdAlumno(id);
//                alumno.setDni(rs.getInt("dni"));
//                alumno.setApellido(rs.getString("apellido"));
//                alumno.setNombre(rs.getString("nombre"));
//                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
//                alumno.setEstado(true);
//
//            } else {
//
//                JOptionPane.showMessageDialog(null, "No existe ese alumno");
//
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
//        }
//        return alumno;
//    }

public Reserva buscarReserva(int id){

String sql="SELECT IdHabitacion,IdHuesped,FechaInicio,FechaFin,PrecioTotal,CantPersonas FROM reserva WHERE idReserva= ? AND estado=1";
Reserva reserva=null;



        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            reserva=new Reserva();
            Habitacion habitacion=new Habitacion();
            reserva.setIdReserva(id);
            
            
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservaData.class.getName()).log(Level.SEVERE, null, ex);
        }



return reserva ;
}




}













    