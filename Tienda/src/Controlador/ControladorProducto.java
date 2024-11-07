package Controlador;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Modelo.Producto;

public class ControladorProducto {
	
	Connection cn;
	PreparedStatement ps;
	
public Connection conectar(){
	try {
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda311","root","");
		//JOptionPane.showMessageDialog(null,"conectado");

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		JOptionPane.showMessageDialog(null,"error al conectar" +e);
	}
	return cn;
	
}
public boolean guardar(Producto pro) { 
	Producto pd=new Producto();
	boolean guarda=false;
	conectar();
	try {
		
		ps=cn.prepareStatement("insert into productos values(?,?,?,?");
		ps.setInt(1,pro.getIdproducto());
		ps.setString(2, pro.getNombreproducto());
		ps.setDouble(3,pro.getPrecio());
		ps.setInt(4,pro.getCantidad());
		int guardado =ps.executeUpdate();
		if(guardado>0) {
			guarda=true;
			JOptionPane.showMessageDialog(null,"guardado");
		}else {
			JOptionPane.showMessageDialog(null,"no guardado");

		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
	return guarda;
	

	
}

}
