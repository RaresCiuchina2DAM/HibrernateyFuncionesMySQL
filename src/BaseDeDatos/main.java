/*package pruebas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?serverTimeZone=UTC","root","afuera");
		
		//pones una interrogación por cada parámetro de entrada que metes
		//al parámetro de salida no pones nada porque 
		String sql = "{ call proc (?)}";
		
		CallableStatement cS = conex.prepareCall(sql);
		
		cS.setString(1,"X");
		
		cS.executeUpdate();
		
		System.out.println("Fin del programa");
		
//Para compaginar BBDD con Java, manejamos setString y setString
//La conversión que tenemos Mysql/Java: 
//TINYINT - tenemos setByte y getByte
//SMALLINT - tenemos setShort y getShort
//INT - setString y getString
//CHAR/VARCHAR - setString
//DATE ó TIME ó TIMESTAMP - getDate y setDate
//FLOAT - getFloat y setFloat
	}

}
*/