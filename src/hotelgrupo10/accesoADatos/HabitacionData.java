/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgrupo10.accesoADatos;

import java.sql.Connection;
import hotelgrupo10.entidades.Habitacion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Norma
 */
public class HabitacionData {
    
     private Connection con = null;
     
     public HabitacionData(){
      con = Conexion.getConexion();
    }
     
   public void crearHabitacion(Habitacion habit){
      String sql = "INSERT INTO habitacion (idHabitacion, idCategoria, nroHabitacion, piso, estado) VALUES (?,?,?,?,?)";
       try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habit.getIdHabitacion());
            ps.setInt(2, habit.getIdcategoria()); 
            ps.setInt(3, habit.getNroHabitacion());
            ps.setInt(4, habit.getPiso());
            ps.setBoolean(5, habit.isestado());
            ps.executeUpdate();
            ps.close();            
            JOptionPane.showMessageDialog(null, "Reserva realizada con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar la reserva");
        }
   }

     public void modificarHabitacion(Habitacion habit) {
      String sql = "UPDATE habitacion SET idCategoria=?,nroHabitacion=?,piso=?,estado=? WHERE idHabitacion= ?";
       try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(2, habit.getIdcategoria()); 
            ps.setInt(3, habit.getNroHabitacion());
            ps.setInt(4, habit.getPiso());
             ps.setBoolean(5, habit.isestado());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion modificada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion");
        }
     }
     
     public void eliminarHabitacion (int IdHabit) {
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
} 




