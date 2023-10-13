package hotelgrupo10;

import hotelgrupo10.accesoADatos.CategoriaData;
import hotelgrupo10.accesoADatos.Conexion;
import hotelgrupo10.accesoADatos.HabitacionData;
import hotelgrupo10.accesoADatos.HuespedData;
import hotelgrupo10.accesoADatos.ReservaData;
import hotelgrupo10.entidades.Categoria;
import hotelgrupo10.entidades.Habitacion;
import hotelgrupo10.entidades.Huesped;
import hotelgrupo10.entidades.Reserva;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HotelGrupo10 {

    public static void main(String[] args) {

        Connection con = Conexion.getConexion();
//
//                      *****HUESPED DATA*****
//        HuespedData huespd = new HuespedData();
//        Huesped juan = new Huesped(1, "Christian", "Anaya", 95583109, "Santiago del", "christiananaya2099@gmail.com",
//                1136767691, true);

//        huespd.agregarHuesped(juan);
//        huespd.modificarHuesped(juan);
//        huespd.eliminarHuesped(955831091);
//        Huesped huespedEncontrado = huespd.buscarHuesped(95583109);
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
//            System.out.println(huesped.getIdHuesped());
//            System.out.println(huesped.getNombre());
//            System.out.println(huesped.getApellido());
//        }
//
//    }
//
//
//                      *****CATEGORIA DATA*****
//        CategoriaData categD = new CategoriaData();
//        Categoria categ = new Categoria(1, 2, 2, "Hidrocama", "HIDRO", 9500, true);
//        
//        categD.agregarCategoria(categ);
//        categD.modificarCategoria(categ);
//        categD.eliminarCategoria(1);
//
//        Categoria categoriaEncontrada = categD.buscarCategoria(1);
//        if (categoriaEncontrada != null) {
//            System.out.println("cant personas:  " + categoriaEncontrada.getCantPersonas());
//            System.out.println("precio:         " + categoriaEncontrada.getPrecio());
//            System.out.println("id:             " + categoriaEncontrada.getIdCategoria());
//        }
//
//        for (Categoria categoria1 : categD.listarCategorias()) {
//            System.out.println("*************");
//            System.out.println("id:             " + categoria1.getIdCategoria());
//            System.out.println("cant personas:  " + categoria1.getTipoHabitacion());
//            System.out.println("precio:         " + categoria1.getPrecio());
//        }
//
//        for (Categoria categoria1 : categD.listarCategoriasDisponiblesPorCantidadPersonas(4)) {
//            System.out.println("*************");
//            System.out.println("id:             " + categoria1.getIdCategoria());
//            System.out.println("cant personas:  " + categoria1.getCantPersonas());
//            System.out.println("precio:         " + categoria1.getPrecio());
//        }
//
//                      *****HABITACION DATA*****
//        Categoria categoria = new Categoria();
//        categoria.setIdCategoria(2);
////
        HabitacionData Datahabitacion = new HabitacionData();
//        Habitacion hab1 = new Habitacion(1, categoria, 1, 1, true);
//
//        Datahabitacion.crearHabitacion(hab1);
//        Datahabitacion.modificarHabitacion(hab1);
//        Datahabitacion.eliminarHabitacion(12);
//
//        Habitacion hbEncontrada = Datahabitacion.buscarHabitacion(1);
//        if (hbEncontrada != null) {
//            System.out.println("Categoria:          " + hbEncontrada.getCategoria().getIdCategoria());
//            System.out.println("Nro Habitacion:     " + hbEncontrada.getNroHabitacion());
//            System.out.println("Piso:               " + hbEncontrada.getPiso());
//            System.out.println("IdHabitacion:       " + hbEncontrada.getIdHabitacion());
//        }
//
        for (Habitacion habitacion1 : Datahabitacion.listarHabitaciones()) {
            System.out.println("*************");
            System.out.println("IdHabitacion:       " + habitacion1.getIdHabitacion());
            System.out.println("Categoria:          " + habitacion1.getCategoria().getIdCategoria());
            System.out.println("Nro Habitacion:     " + habitacion1.getNroHabitacion());
            System.out.println("Piso:               " + habitacion1.getPiso());
        }
//
//        Habitacion hbEncontrada = Datahabitacion.obtenerHabitacionDisponiblePorCategoria(1);
//        if (hbEncontrada != null) {
//            System.out.println("*************");
//            System.out.println("IdCategoria:        " + hbEncontrada.getCategoria().getIdCategoria());
//            System.out.println("IdCategoria:        " + hbEncontrada.getCategoria().getPrecio());
//            System.out.println("IdHabitacion:       " + hbEncontrada.getIdHabitacion());
//            System.out.println("Nro Habitacion:     " + hbEncontrada.getNroHabitacion());
//            System.out.println("Piso:               " + hbEncontrada.getPiso());
//            System.out.println("Estado:             "+ hbEncontrada.isEstado());
//        }
//
//
//                      *****RESERVA DATA*****
//        Scanner scanner = new Scanner(System.in);
//
        CategoriaData categD = new CategoriaData();
        HabitacionData hbD = new HabitacionData();
        HuespedData huespD = new HuespedData();
        ReservaData resD = new ReservaData();

        Categoria categoria = new Categoria();
        categoria.setIdCategoria(2);
        Huesped juan = new Huesped(3, "Christian", "Anaya", 95583109, "Santiago del", "christiananaya2099@gmail.com",
                1136767691, true);
//        
//
//        System.out.print("Ingrese la fecha de entrada (yyyy-MM-dd): ");
//        String fechaEntradaStr = scanner.next();
//        LocalDate fechaEntrada = LocalDate.parse(fechaEntradaStr);
//
//        System.out.print("Ingrese la fecha de salida (yyyy-MM-dd): ");
//        String fechaSalidaStr = scanner.next();
//        LocalDate fechaSalida = LocalDate.parse(fechaSalidaStr);
//
//        System.out.print("Ingrese la cantidad de personas: ");
//        int cantidadPersonas = scanner.nextInt();
//
//        List<Categoria> categoriasDisponibles = categD.listarCategoriasDisponiblesPorCantidadPersonas(cantidadPersonas);
//
//        if (categoriasDisponibles.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "No se encontró un tipo de habitación adecuado para la cantidad de personas.");
//            return;
//        }
////        categorías disponibles con sus precios
//        System.out.println("Categorías Disponibles:");
//        for (int i = 0; i < categoriasDisponibles.size(); i++) {
//            Categoria categoriaDisponible = categoriasDisponibles.get(i);
//            System.out.println((i + 1) + ". " + categoriaDisponible.getIdCategoria() + " - Precio: " + categoriaDisponible.getPrecio());
//        }
//        
//        System.out.print("Ingrese el número de la categoría deseada: ");
//        int opcionCategoria = scanner.nextInt();
//
//        if (opcionCategoria < 1 || opcionCategoria > categoriasDisponibles.size()) {
//            System.out.println("Opción no válida. Por favor, ingrese un número de categoría válido.");
//            return;
//        }
//
//        Categoria categoriaElegida = categoriasDisponibles.get(opcionCategoria - 1);
//
//        double precioTotal = resD.calcularPrecioTotal(categoriaElegida, fechaEntrada, fechaSalida);
//
//        Habitacion habitacion = hbD.obtenerHabitacionDisponiblePorCategoria(categoriaElegida.getIdCategoria());
//        if (habitacion != null) {
//            Reserva resv = new Reserva(habitacion, juan, categoriaElegida, fechaEntrada, fechaSalida, precioTotal, cantidadPersonas, true);
//            resD.crearReserva(resv);
//        } else {
//            System.out.println("No hay habitaciones disponibles para la categoría seleccionada.");
//        }
//
//        scanner.close();
//
////        Reserva resv = new Reserva(hab1, juan, categoria, LocalDate.of(2002, 4, 25), LocalDate.of(2002, 4, 26), 5000, 7, true);
////        res.crearReserva(resv);
////        res.cancelarReserva(9);
////
//        Reserva res1 = resD.buscarReserva(9);
//        if (res1 != null) {
//            System.out.println("precio " + res1.getPrecioTotal());
//            System.out.println("cantpersonas " + res1.getCantPersonas());
//        }
////
//        for (Categoria categoria1 : resD.mostrarHabitacionesLibres("HIDRO")) {
//            System.out.println("Id:             " + categoria1.getIdCategoria());
//            System.out.println("Tipo Hab:       " + categoria1.getTipoHabitacion());
//            System.out.println("-");
//        }
////
////        for (Categoria categoria1 : res.montoEstadia("suit2")) {
////            System.out.println("\nDatos:              ----");
////            System.out.println("Tipo de Habitacion: " + categoria1.getTipoHabitacion());
////            System.out.println("Precio base:        " + categoria1.getPrecio());
////        }
////
////        res.montoEstadia("suit2");
////        res.finReserva(juan);
////        for (Reserva res1: resD.busquedaDeReservaPorFecha("2002-04-22")) {
////            System.out.println("idReserva " + res1.getIdReserva());
////            System.out.println("PrecioTotal " + res1.getPrecioTotal());
////        }
//        for(Reserva res2: resD.busquedaDeReservaPorHuesped(juan)){
//             System.out.println("idReserva " + res2.getIdReserva());
//            System.out.println("PrecioTotal " + res2.getPrecioTotal());
//        }
    }

}
