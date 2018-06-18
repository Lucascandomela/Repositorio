package Proyecto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;



public class BD {

	private conexion conexion= new conexion();
	
	/**
	 * @see tiradas(int)
	 * @param vidatotal
	 */
	 public void tiradas(int vidatotal){
		 
			conexion = new conexion();
			Connection con = conexion.getConnection();
			Statement st;
			String sql="UPDATE jugador SET vida='"+vidatotal+"'";
			
		
			try{
				st=con.createStatement();
				st.executeUpdate(sql);
				//Cerramos conexiones
				con.close();
				st.close();
				System.out.println("Modificado con exito \n");
			}catch(SQLException e){
				JOptionPane.showMessageDialog(null, "NO  modificados");
			} 
	 }
	 
	 
	 /**
	  * @see tiradas()
	  */
	 public void tiradas(){
		 	
	
			conexion = new conexion();
			Connection con = conexion.getConnection();
			Statement st;
			int vidatotal=30;
			String sql="UPDATE jugador SET vida='"+vidatotal+"'";
			
		
			try{
				st=con.createStatement();
				st.executeUpdate(sql);
				//Cerramos conexiones
				con.close();
				st.close();
				System.out.println("Remodificado con exito \n");
			}catch(SQLException e){
				JOptionPane.showMessageDialog(null, "NO  modificados");
			} 
	 }
	 /**
	  * @see buscarvida()
	  * @return
	  */
	 public ResultSet buscarvida(){
			
		 	conexion = new conexion();
			Connection con = conexion.getConnection();
			Statement st;
			ResultSet rt = null;
		
			String sql="SELECT vida FROM jugador";
			
			try{
				st=con.createStatement();
				rt=st.executeQuery(sql);
				
				System.out.println("ok \n");
			}catch(SQLException e){
				JOptionPane.showMessageDialog(null, "Incorrecto");
			}
			return rt;
		}
}
