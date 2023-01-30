package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//lo más habitual es el insert, pero esto se puede utilizar para borrar o actualizar bien

public class baseDatos_clase2 {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Scanner sc = new Scanner(System.in);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?serverTimeZone=UTC","root","afuera");
			
			//Type forward only, sólo lee de izquierda a derecha, no puedo utilizar los métodos
			//Sensitive es sensible (si haces cambio en la tabla, el dato se va actualizando) y el insensitive (se te queda fija la consulta)
			//Statement sentencia = conex.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			
			//el CONCUR_UPDATABLE es para poder realizar una modifiación en la base de datos
			//TYPE_SCROLL_INSENSITIVE -- esto para posiciones
			//Vamos a utilizar este:
			Statement sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			String sql = "SELECT * FROM dptos";
	
			ResultSet rs = sentencia.executeQuery(sql);
			
			
			//rs.first(); el primero
			//rs.beforeFirst(); antes del priemro, para leer el primero
			//rs.last(); el último
			//rs.afterLast(); el penultimo
			//rs.getRow();

			//Creo esto para crear una fila vacía:
			/*
			rs.moveToInsertRow();
			
			rs.updateInt(1, 60);
			rs.updateString(2, "dpto56");
			rs.updateString(3, "d");
			rs.updateFloat(4, (float)125.67);
			
			rs.insertRow();
			*/
			
			/*
			rs.last();
			rs.deleteRow();
			rs.afterLast();
			*/
			
			/* Para actualizar alguna linea
			rs.first();
			rs.updateString(2,  "RR.HH.");
			rs.updateRow();
			*/
			
			/*
			 * isAfterLast(); verifica si es el ultimo
			 */
			
			while (rs.next())
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getFloat(4));
					
			//Me posiciono despues de la última línea
			rs.afterLast(); //Para poder leerlo de izquierda a derecha
			while(rs.previous())
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getFloat(4));

			
			
			rs.moveToInsertRow();
			sentencia.close();
			conex.close();
}

}