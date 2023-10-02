package hotelgrupo10.accesoADatos;

import hotelgrupo10.entidades.Habitacion;
import hotelgrupo10.entidades.Huesped;
import hotelgrupo10.entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class HuespedData {
    
    private Connection con = null;
    
    public HuespedData(){
        con = Conexion.getConexion();
    }
    
        public void realizarReserva(Huesped huesped,Habitacion habitacion,Reserva reserva) {
        String sql = "INSERT INTO reserva (id_huesped, id_habitacion, fecha_inicio, fecha_fin, monto, estado) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, huesped.getDNI());
            ps.setInt(2, habitacion.getIdHabitacion()); 
            ps.setDate(3, Date.valueOf(reserva.getFechaInicio()));
            ps.setDate(4, Date.valueOf(reserva.getFechaFin()));
            ps.setDouble(5, reserva.getPrecioTotal());
            ps.setBoolean(6, reserva.isEstado());
            ps.executeUpdate();
            ps.close();            
            JOptionPane.showMessageDialog(null, "Reserva realizada con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar la reserva");
        }
    }
    
    
}
