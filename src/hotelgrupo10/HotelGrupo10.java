package hotelgrupo10;

import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.accesoADatos.Conexion;
import hotelgrupo10.accesoADatos.HabitacionData;
import hotelgrupo10.accesoADatos.HuespedData;
import hotelgrupo10.entidades.Categoria;
import hotelgrupo10.entidades.Habitacion;
import hotelgrupo10.entidades.Huesped;
import java.sql.Connection;

public class HotelGrupo10 {

    public static void main(String[] args) {

        Connection con = Conexion.getConexion();

//                  *****HUESPED DATA*****
        Huesped juan = new Huesped("tes7", "test2", 955831091, "Bolivia2", "Gonzalo@21.comt",
                1143564, true);
        HuespedData huespd = new HuespedData();
//        huespd.agregarHuesped(juan);
//        huespd.modificarHuesped(juan);
//        huespd.eliminarHuesped(955831091);

//        Huesped huespedEncontrado = huespd.buscarHuesped(955831091);
//        if (huespedEncontrado != null) {
//            System.out.println("dni:        " + huespedEncontrado.getDNI());
//            System.out.println("nombre:     " + huespedEncontrado.getNombre());
//            System.out.println("apellido:   " + huespedEncontrado.getApellido());
//            System.out.println("domicilio:  " + huespedEncontrado.getDomicilio());
//            System.out.println("estado:     " + huespsedEncontrado.isEstado());
//            System.out.println("id:         " + huespedEncontrado.getIdHuesped());
//        }
//
//        for (Huesped huesped : huespd.listarHuespedes()) {
//            System.out.println("*************");
//            System.out.println(huesped.getNombre());
//            System.out.println(huesped.getApellido());
//            System.out.println(huesped.getIdHuesped());
//        }
//
//    }
//                  *****CATEGORIA DATA*****
        Categoria categ = new Categoria(2, 2, 2, "Premium5", "suit", 1600, true);
        CategoriaData categD = new CategoriaData();
//        categD.agregarCategoria(categ);
//        categD.modificarCategoria(categ);
//        categD.eliminarCategoria(1);

//        Categoria categoriaEncontrada = categD.buscarCategoria(2);
//        if (categoriaEncontrada != null) {
//            System.out.println("cant personas:  " + categoriaEncontrada.getCantPersonas());
//            System.out.println("precio:         " + categoriaEncontrada.getPrecio());
//            System.out.println("id:             " + categoriaEncontrada.getIdCategoria());
//        }
//        for (Categoria categoria : categD.listarCategorias()) {
//            System.out.println("*************");
//            System.out.println("cant personas:  " + categoria.getCantPersonas());
//            System.out.println("precio:         " + categoria.getPrecio());
//            System.out.println("id:             " + categoria.getIdCategoria());
//        }
//                  *****HABITACION DATA*****
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(1);

        Habitacion habitacion = new Habitacion(categoria, 1, 1, true);

        HabitacionData habitacionData = new HabitacionData();
        habitacionData.crearHabitacion(habitacion);
    }
}
