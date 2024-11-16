package bd;

import modelo.Order;

public class DatabaseMysql implements DataSource {
    private static DataSource instance;

    public static synchronized DataSource getInstance() {
        if (instance == null) {
            instance = new DatabaseMysql().setNewConnection();
        }
        return instance;
    }

    public synchronized DataSource setNewConnection() {
        //setea nueva conexion
        return this;
    }

    public void save(Order order) {
        System.out.println("Guarde en la base de datos");
    }
}
