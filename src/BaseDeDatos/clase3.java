package BaseDeDatos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class clase3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?serverTimezone=UTC","root","afuera");
		
		//pones una interrogación por cada parámetro que tengas
		//sumas los de entrada y los de salida
		//al parámetro de salida no pones nada porque lo vamos a hacer con pseudovariables
		String sql = "{ call proc2 (?)}";
		
		CallableStatement cS = conex.prepareCall(sql);
		
		//5 es el valor de la entrada
		cS.setByte(1,(byte)70);
		
		//El 1 es el número de salidas que vamos a tener y
		//le ponemos el tipo de salida
		cS.registerOutParameter(1, Types.TINYINT);
		
		cS.executeUpdate();
		
		System.out.println(cS.getByte(1));
		
		System.out.println("Fin del programa");
			
	}
}
