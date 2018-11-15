package model;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import com.mysql.jdbc.SQLError;

import util.Conexion;

import java.io.Console;
import java.sql.*;

public class ConexionUser extends Conexion {
	
	public boolean Sign_Up(Usuarios user){
		
		int valor=-1;
		Connection con=null;
		PreparedStatement pstm=null;
		try {
			con= new Conexion().getConexion();
			String sql= "insert into tb_Usuario values (null,?,?,?,?,?,?)";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, user.getUsuario());
			pstm.setString(2,user.getContrase�a());
			pstm.setString(3, user.getCorreo());
			pstm.setString(4, user.getNombre());
			pstm.setString(5, user.getApellido());
			pstm.setInt(6, user.getTipo());
			
			pstm.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No registrado");
			return false;
		}
		finally {
			try {
				con.close();
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, e2.toString());
			}
		}
		//https://gist.github.com/jujogracu/3069429
		
		
		
	}

}