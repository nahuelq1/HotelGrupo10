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

public class HotelGrupo10 {

    public static void main(String[] args) {

        Connection con = Conexion.getConexion();
//
//                      *****HUESPED DATA*****
        Huesped juan = new Huesped(11, "tes10", "test12", 95583102, "Lones", "Gonzalo@21.comt",
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
//
//
//                      *****CATEGORIA DATA*****
//        Categoria categ = new Categoria(2, 2, 2, "Premium5", "suit", 1600, true);
//        CategoriaData categD = new CategoriaData();
//        
//        categD.agregarCategoria(categ);
//        categD.modificarCategoria(categ);
//        categD.eliminarCategoria(1);
//
//        Categoria categoriaEncontrada = categD.buscarCategoria(2);
//        if (categoriaEncontrada != null) {
//            System.out.println("cant personas:  " + categoriaEncontrada.getCantPersonas());
//            System.out.println("precio:         " + categoriaEncontrada.getPrecio());
//            System.out.println("id:             " + categoriaEncontrada.getIdCategoria());
//        }
//
//            for (Categoria categoria1 : categD.listarCategorias()) {
//            System.out.println("*************");
//            System.out.println("cant personas:  " + categoria1.getTipoHabitacion());
//            System.out.println("precio:         " + categoria1.getPrecio());
//            System.out.println("id:             " + categoria1.getIdCategoria());
//        }
//
//            for (Categoria categoria1 : categD.listarCategoriasDisponiblesPorCantidadPersonas(5)) {
//            System.out.println("*************");
//            System.out.println("cant personas:  " + categoria1.getCantPersonas());
//            System.out.println("precio:         " + categoria1.getPrecio());
//            System.out.println("id:             " + categoria1.getIdCategoria());
//        }
//
//                      *****HABITACION DATA*****
        CategoriaData categD = new CategoriaData();
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(2);

        HabitacionData Datahabitacion = new HabitacionData();
        Habitacion hab1 = new Habitacion(13, categoria, 2, 3, true);
//

//        Datahabitacion.crearHabitacion(hab1);
//        Datahabitacion.modificarHabitacion(hab1);
//        Datahabitacion.eliminarHabitacion(12);
//
//        Habitacion hbEncontrada = Datahabitacion.buscarHabitacion(13);
//        if (hbEncontrada != null) {
//            System.out.println("Categoria:          " + hbEncontrada.getCategoria().getIdCategoria());
//            System.out.println("Nro Habitacion:     " + hbEncontrada.getNroHabitacion());
//            System.out.println("Piso:               " + hbEncontrada.getPiso());
//            System.out.println("IdHabitacion:       " + hbEncontrada.getIdHabitacion());
//        }
//
//        for (Habitacion habitacion1 : Datahabitacion.listarHabitaciones()) {
//            System.out.println("*************");
//            System.out.println("Categoria:          " + habitacion1.getCategoria().getIdCategoria());
//            System.out.println("Nro Habitacion:     " + habitacion1.getNroHabitacion());
//            System.out.println("Piso:               " + habitacion1.getPiso());
//            System.out.println("IdHabitacion:       " + habitacion1.getIdHabitacion());
//        }
//
//        Habitacion hbEncontrada = Datahabitacion.obtenerHabitacionDisponiblePorCategoria(3);
//        if (hbEncontrada != null) {
//            System.out.println("Categoria:          " + hbEncontrada.getCategoria().getIdCategoria());
//            System.out.println("Nro Habitacion:     " + hbEncontrada.getNroHabitacion());
//            System.out.println("Piso:               " + hbEncontrada.getPiso());
//            System.out.println("IdHabitacion:       " + hbEncontrada.getIdHabitacion());
//        }
//
//
//                      *****RESERVA DATA*****
        ReservaData res = new ReservaData();
        HabitacionData hbD = new HabitacionData();

//        categoria.setIdCategoria(2);
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Ingrese la fecha de entrada (yyyy-MM-dd): ");
//        String fechaEntradaStr = scanner.next();
//        LocalDate fechaEntrada = LocalDate.parse(fechaEntradaStr);
//        
//        System.out.print("Ingrese la fecha de salida (yyyy-MM-dd): ");
//        String fechaSalidaStr = scanner.next();
//        LocalDate fechaSalida = LocalDate.parse(fechaSalidaStr);
        System.out.print("Ingrese la cantidad de personas: ");

        int cantidadPersonas = scanner.nextInt();
        for (Categoria categoria1 : categD.listarCategoriasDisponiblesPorCantidadPersonas(cantidadPersonas)) {
            System.out.println("*************");
            System.out.println("cant personas:  " + categoria1.getCantPersonas());
            System.out.println("precio:         " + categoria1.getPrecio());
            System.out.println("id:             " + categoria1.getIdCategoria());
            System.out.println("estado:         " + categoria1.isEstado());
        }

        Habitacion habitacion = hbD.obtenerHabitacionDisponiblePorCategoria(categoria.getIdCategoria());
        if (habitacion != null) {

            double precioTotal = calcularPrecioTotal(habitacion.getCategoria(), LocalDate.of(2002, 4, 25), LocalDate.of(2002, 4, 27));

            Reserva resv = new Reserva(habitacion, juan, categoria, LocalDate.of(2002, 4, 25), LocalDate.of(2002, 4, 27), precioTotal, cantidadPersonas, true);

            res.crearReserva(resv);
        } else {
            System.out.println("No hay habitaciones disponibles para la categoría seleccionada.");
        }

        scanner.close();
    }

    private static double calcularPrecioTotal(Categoria categoria, LocalDate fechaEntrada, LocalDate fechaSalida) {
        if (categoria != null) {
            long diasEstadia = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
            double precioTotal = categoria.getPrecio() * diasEstadia;
            return precioTotal;
        } else {
            System.out.println("No se encontró una categoría de habitación válida.");
            return 0.0; 
        }

//        Reserva resv = new Reserva(hab1, juan, categoria, LocalDate.of(2002, 4, 25), LocalDate.of(2002, 4, 26), 5000, 7, true);
//        res.crearReserva(resv);
//        res.cancelarReserva(9);
//
//        Reserva res1 = res.buscarReserva(8);
//        if (res1 != null) {
//            System.out.println("precio " + res1.getPrecioTotal());
//            System.out.println("cantpersonas " + res1.getCantPersonas());
//        }
//
//        for (Categoria categoria1 : res.mostrarHabitacionesLibres("clasico")) {
//            System.out.println("Id:             " + categoria1.getIdCategoria());
//            System.out.println("Tipo Hab:       " + categoria1.getTipoHabitacion());
//            System.out.println("-");
//        }
//
//        for (Categoria categoria1 : res.montoEstadia("suit2")) {
//            System.out.println("\nDatos:              ----");
//            System.out.println("Tipo de Habitacion: " + categoria1.getTipoHabitacion());
//            System.out.println("Precio base:        " + categoria1.getPrecio());
//        }
//
//        res.montoEstadia("suit2");
//        res.finReserva(juan);
    }
}
