package hotelgrupo10;

import hotelgrupo10.accesoADatos.Conexion;
import hotelgrupo10.accesoADatos.HuespedData;
import hotelgrupo10.entidades.Huesped;
import java.sql.Connection;

public class HotelGrupo10 {

    public static void main(String[] args) {

        Connection con = Conexion.getConexion();

//                  ****HUESPED DATA****
        Huesped juan = new Huesped("tes7", "test2", 955831091, "Bolivia2", "Gonzalo@21.comt",
                1143564, true);
        HuespedData huespd = new HuespedData();
//        huespd.agregarHuesped(juan);
//        huespd.modificarHuesped(juan);
        huespd.eliminarHuesped(955831091);

//        Huesped huespedEncontrado = huespd.buscarHuesped(955831091);
//        if (huespedEncontrado != null) {
//            System.out.println("dni:        " + huespedEncontrado.getDNI());
//            System.out.println("nombre:     " + huespedEncontrado.getNombre());
//            System.out.println("apellido:   " + huespedEncontrado.getApellido());
//            System.out.println("domicilio:  " + huespedEncontrado.getDomicilio());
//            System.out.println("estado:     " + huespedEncontrado.isEstado());
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

}}
