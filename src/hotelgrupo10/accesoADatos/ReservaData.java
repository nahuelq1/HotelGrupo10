/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelgrupo10.accesoADatos;

import hotelgrupo10.entidades.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            
        
        
        } catch (SQLException ex) {
            Logger.getLogger(ReservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}













    