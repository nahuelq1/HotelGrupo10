package hotelgrupo10.accesoADatos;

import hotelgrupo10.entidades.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaData {

    private Connection con = null;

    public CategoriaData() {
        con = Conexion.getConexion();
    }

    public void agregarCategoria(Categoria nuevaCategoria) {
        String sql = "INSERT INTO categoria (cantpersonas, cantcamas, tipocamas, tipohabitacion, precio, estado) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nuevaCategoria.getCantPersonas());
            ps.setInt(2, nuevaCategoria.getCantCamas());
            ps.setString(3, nuevaCategoria.getTipoCamas());
            ps.setString(4, nuevaCategoria.getTipoHabitacion());
            ps.setDouble(5, nuevaCategoria.getPrecio());
            ps.setBoolean(6, nuevaCategoria.isEstado());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Categoría agregada con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla categoría");
        }
    }

    public void modificarCategoria(Categoria categoriaExist) {
        String sql = "UPDATE categoria SET cantpersonas = ?, cantcamas = ?, tipocamas = ?,"+
                " tipohabitacion = ?, precio = ?, estado = ? WHERE idcategoria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, categoriaExist.getCantPersonas());
            ps.setInt(2, categoriaExist.getCantCamas());
            ps.setString(3, categoriaExist.getTipoCamas());
            ps.setString(4, categoriaExist.getTipoHabitacion());
            ps.setDouble(5, categoriaExist.getPrecio());
            ps.setBoolean(6, categoriaExist.isEstado());
            ps.setInt(7, categoriaExist.getIdCategoria());
            int exito = ps.executeUpdate();
            ps.close();
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Categoria modificada con exito");
            } else {
                JOptionPane.showMessageDialog(null, "La categoria no pudo ser modificada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la categoría");
        }
    }

    public void eliminarCategoria(int idCategoria) {
        String sql = "UPDATE categoria SET estado = 0 WHERE idcategoria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);
            int exito = ps.executeUpdate();
            ps.close();
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Categoría eliminada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "La categoría no pudo ser eliminada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la categoría");
        }
    }

    public Categoria buscarCategoria(int idCategoria) {
        String sql = "SELECT * FROM categoria WHERE idCategoria = ? AND estado = 1";
        Categoria categoriaEncontrada = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                categoriaEncontrada = new Categoria();
               categoriaEncontrada.setIdCategoria(idCategoria);
                categoriaEncontrada.setCantPersonas(rs.getInt("cantpersonas"));
                categoriaEncontrada.setCantCamas(rs.getInt("cantcamas"));
                categoriaEncontrada.setTipoCamas(rs.getString("tipocamas"));
                categoriaEncontrada.setTipoHabitacion(rs.getString("tipohabitacion"));
                categoriaEncontrada.setPrecio(rs.getDouble("precio"));
                categoriaEncontrada.setEstado(true);
                 
            } else {
                JOptionPane.showMessageDialog(null, "No existe esa categoría");
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la categoría");
        }
        return categoriaEncontrada;
    }

    public List<Categoria> listarCategorias() {
        String sql = "SELECT idcategoria, cantpersonas, cantcamas, tipocamas, tipohabitacion, precio, estado FROM categoria WHERE estado = 1";
        ArrayList<Categoria> categorias = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt("idcategoria"));
                categoria.setCantPersonas(rs.getInt("cantpersonas"));
                categoria.setCantCamas(rs.getInt("cantcamas"));
                categoria.setTipoCamas(rs.getString("tipocamas"));
                categoria.setTipoHabitacion(rs.getString("tipohabitacion"));
                categoria.setPrecio(rs.getDouble("precio"));
                categoria.setEstado(rs.getBoolean("estado"));

                categorias.add(categoria);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla categoría");
        }

        return categorias;
    }
    public List<Categoria> listarCategoriasDisponiblesPorCantidadPersonas(int cantPersonas) {
    String sql = "SELECT idcategoria, cantpersonas, cantcamas, tipocamas, tipohabitacion, precio, estado FROM categoria WHERE cantpersonas = ? AND estado = 1";
    ArrayList<Categoria> categorias = new ArrayList<>();

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, cantPersonas);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Categoria categoria = new Categoria();
            categoria.setIdCategoria(rs.getInt("idcategoria"));
        categoria.setCantPersonas(rs.getInt("cantpersonas"));
            categoria.setCantCamas(rs.getInt("cantcamas"));
            categoria.setTipoCamas(rs.getString("tipocamas"));
            categoria.setTipoHabitacion(rs.getString("tipohabitacion"));
            categoria.setPrecio(rs.getDouble("precio"));
            categoria.setEstado(rs.getBoolean("estado"));

            categorias.add(categoria);
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla categoría");
    }
    return categorias;
}
}
