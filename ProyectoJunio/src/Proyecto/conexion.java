package Proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

	/**
	 * @see conexion()
	 * @param String servidor
	 * @param String user
	 * @param String pass
	 * @param String driver
	 */
	private String servidor="jdbc:mysql://localhost/prueba1";
	private String user="root";
	private String pass="";
	private String driver="com.mysql.jdbc.Driver";
	private Connection conexion;
	
	public conexion() {
		
		try {
			Class.forName(driver);
			conexion=DriverManager.getConnection(servidor, user, pass);
			System.out.println("exito");
			
		}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return conexion;
	}
}