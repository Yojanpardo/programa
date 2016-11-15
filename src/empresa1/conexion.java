package empresa1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private Connection cn = null;

    public Connection conexion() {
        try {
            Class.forName("org.postgresql.Driver");
            cn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/empleados","postgres","aeropuerto2522");
            System.out.println("La conexion se realizo");
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontro el driver de conexion");
        } catch (SQLException e) {
            System.out.println("No se encuentra la base de datos");
        }
        return cn;
    }
    public static void main(String[] args) {
        conexion ob=new conexion();
        ob.conexion();
    }
}
