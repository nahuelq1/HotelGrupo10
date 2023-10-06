package hotelgrupo10.accesoADatos;

import hotelgrupo10.entidades.Huesped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HuespedData {

    private Connection con = null;

    public HuespedData() {
        con = Conexion.getConexion();
    }

    public void agregarHuesped(Huesped nuevoHuesped) {
        String sql = "INSERT INTO huesped (dni, nombre,apellido, domicilio, "
                + "correo, celular,estado) VALUES (?,?, ?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nuevoHuesped.getDNI());
            ps.setString(2, nuevoHuesped.getNombre());
            ps.setString(3, nuevoHuesped.getApellido());
            ps.setString(4, nuevoHuesped.getDomicilio());
            ps.setString(5, nuevoHuesped.getCorreo());
            ps.setInt(6, nuevoHuesped.getCelular());
            ps.setBoolean(7, nuevoHuesped.isEstado());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Huesped agregado con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder tabla huésped");
        }
    }

    public void modificarHuesped(Huesped huespedExistente) {
        String sql = "UPDATE huesped SET nombre = ?,apellido=?, domicilio = ?,"
                + " correo = ?, celular = ? WHERE dni = ? AND estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, huespedExistente.getNombre());
            ps.setString(2, huespedExistente.getApellido());
            ps.setString(3, huespedExistente.getDomicilio());
            ps.setString(4, huespedExistente.getCorreo());
            ps.setInt(5, huespedExistente.getCelular());
            ps.setInt(6, huespedExistente.getDNI());
//            ps.setInt(7, huespedExistente.getIdHuesped());
            int exito = ps.executeUpdate();
            ps.close();
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Huésped modificado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "El huésped no pudo ser modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el huésped");
        }
    }

    public void eliminarHuesped(int dniHuesped) {
        String sql = "UPDATE huesped SET estado=0 WHERE dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dniHuesped);
            int exito = ps.executeUpdate();
            ps.close();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Huésped eliminado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "El huésped no pudo ser eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el huésped");
        }
    }

    public Huesped buscarHuesped(int dni) {
        String sql = "SELECT * FROM huesped WHERE dni = ? AND estado=1";
        Huesped huespedEncontrado = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                huespedEncontrado = new Huesped();
                huespedEncontrado.setIdHuesped(rs.getInt("idHuesped"));
                huespedEncontrado.setNombre(rs.getString("nombre"));
                huespedEncontrado.setApellido(rs.getString("apellido"));
                huespedEncontrado.setDNI(rs.getInt("dni"));
                huespedEncontrado.setDomicilio(rs.getString("domicilio"));
                huespedEncontrado.setCorreo(rs.getString("correo"));
                huespedEncontrado.setCelular(rs.getInt("celular"));
                huespedEncontrado.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese huesped");
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el huésped");
        }
        return huespedEncontrado;
    }
 public Huesped buscarHuespedPorId(int id) {
        String sql = "SELECT * FROM huesped WHERE idHuesped = ? AND estado=1";
        Huesped huespedEncontrado = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                huespedEncontrado = new Huesped();
                huespedEncontrado.setIdHuesped(id);
                huespedEncontrado.setDNI(rs.getInt("dni"));
                huespedEncontrado.setNombre(rs.getString("nombre"));
                huespedEncontrado.setApellido(rs.getString("apellido"));
                huespedEncontrado.setDomicilio(rs.getString("domicilio"));
                huespedEncontrado.setCorreo(rs.getString("correo"));
                huespedEncontrado.setCelular(rs.getInt("celular"));
                huespedEncontrado.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese huesped");
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el huésped");
        }
        return huespedEncontrado;
    }
    public List<Huesped> listarHuespedes() {
        String sql = "SELECT idHuesped, dni, nombre, apellido, domicilio, correo,"
                + " celular, estado FROM huesped WHERE estado = 1";
        ArrayList<Huesped> huespedes = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Huesped huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setDNI(rs.getInt("dni"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setEstado(rs.getBoolean("estado"));

                huespedes.add(huesped);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        }

        return huespedes;
    }
}
