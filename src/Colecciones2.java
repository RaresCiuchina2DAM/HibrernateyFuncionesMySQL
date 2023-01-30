import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Colecciones2 {

    public static void main(String[]args)throws SQLException {

        Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?serverTimeZone=UTC","root","afuera");







        conex.close();

    }

}




