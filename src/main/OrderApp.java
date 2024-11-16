package main;

import bd.DataSource;
import bd.DatabaseMysql;
import modelo.Order;
import servicios.OrderService;
import servicios.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        // Crear una orden con un ID y un monto
        Order order = new Order("ORD123", 250.75);

        // Traigo una instancia de dataSource (dependencia)
        DataSource databaseMysql = DatabaseMysql.getInstance();
        // Traigo una instancia de OrderService inyectando la dependencia DataSource
        OrderService orderService = OrderServiceImpl.getInstance(databaseMysql);
        // Utilizo el servicio de order para guardar la orden en la base de datos
        orderService.saveOrder(order);

        // Utilizo el servicio de order para generar y mostrar el reporte de la orden
        String report = orderService.generateOrderReport(order);
        System.out.println(report);
    }
}
