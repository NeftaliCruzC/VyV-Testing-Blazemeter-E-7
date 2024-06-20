
package Interfaces;

import java.util.Date;


class SQL {
    
    public static String selectVentasPorFecha(Date fecha) {
        return "SELECT p.nombre, vh.cantidad, vh.cantidad * p.precio_venta AS total, vp.fecha " +
               "FROM Venta_hijo vh " +
               "JOIN Venta_padre vp ON vh.id_venta_padre = vp.id_venta_padre " +
               "JOIN productos p ON vh.id_producto = p.id " +
               "WHERE vp.fecha = ?";
    }

    public static String calcularGananciaDelDia(Date fecha) {
        return "SELECT SUM(vh.cantidad * p.precio_venta) " +
               "FROM Venta_hijo vh " +
               "JOIN Venta_padre vp ON vh.id_venta_padre = vp.id_venta_padre " +
               "JOIN productos p ON vh.id_producto = p.id " +
               "WHERE vp.fecha = ?";
    }
    
}
