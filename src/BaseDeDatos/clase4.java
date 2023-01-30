package BaseDeDatos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

//función sin parámetro de entrada

public class clase4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?serverTimezone=UTC","root","afuera");
		
		//La ? es el dato que vamos a obtener
		String sql = "{ ? = call func1 ()}";
		
		CallableStatement cS = conex.prepareCall(sql);
		
		cS.registerOutParameter(1, Types.TINYINT);
		
		cS.executeUpdate();
		
		System.out.println(cS.getByte(1));
		
		System.out.println("Fin del programa");
	}
	
	
	
}
