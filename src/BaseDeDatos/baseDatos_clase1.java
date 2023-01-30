package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class baseDatos_clase1 {
	//En el examen es posible que nos pida el try catch
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//También se puede:
		//Class.forName("com.mysql.jdbc.Driver");
		
		Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?serverTimeZone=UTC","root","afuera");
		
		Statement sentencia = conex.createStatement();
		
		//Recordar sobre las select
		String sql = "SELECT * FROM dptos";
		
		//El execute lo haces cuando no sabes qué sentencia te va a venir
		//Si sabes lo que viene, puedes utilizar executeQuery
		boolean consulta = sentencia.execute(sql);
		if (consulta) {
			ResultSet rs = sentencia.getResultSet();
			while (rs.next())
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getFloat(4));
				
		} else {
			int numFilas = sentencia.getUpdateCount();
		}
		
		//Para actualizar los departamentos a X cuando sean E
		//sql = "UPDATE dptos SET bloque='X' WHERE bloque = 'E'";
		//sql = String.format("UPDATE dptos SET bloque='X' WHERE bloque", 'E', 'X');
		
		//.executeUpdate te devuelve las filas afectadas
		//int numFilas = sentencia.executeUpdate(sql);
		
		//System.out.println(numFilas);
		
		//Vamos a pedir por pantalla los datos de un departamento
		//y lo damos de alta

		System.out.print("Dime idD1: ");
		int idD1 = Integer.parseInt(sc.nextLine());
		System.out.print("Dime nom1: ");
		String nom1 = sc.nextLine();
		System.out.print("Dime car1: ");
		char car1 = sc.nextLine().charAt(0);
		System.out.print("Dime numFloat: ");
		float numFloat = Float.parseFloat(sc.nextLine());
				
		sql = "INSERT INTO dptos VALUES ("+idD1+","+nom1+","+car1+","+numFloat+")";
		
		//int numFilas2 = sentencia.executeUpdate(sql);
        //System.out.println(numFilas2);
		
		//Cerramos sentencia y conexión:
		sentencia.close();
		conex.close();		
	}

}