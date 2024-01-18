package com.distruibuida.principal;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebaJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String urlJDBC ="jdbc:mysql://localhost:3306/bdfactura";
		String user = "root";
		String clave ="root";

		try {
			System.out.println("Estableciendo conexión....");
			
			Connection connection =DriverManager.getConnection(urlJDBC, user, clave);

			System.out.println("Conexión establecida!!!");		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
