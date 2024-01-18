package com.distruibuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Clientes;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		
		
		//CRUD
		
		//ADD
		Clientes cliente =new Clientes(0,"1755378385","Jose","Mena",11,new Date(),"Calderon","0968241486","jp@gmail.com");
		//clienteDAO.add(cliente);
		
		//UP
		Clientes cliente1 =new Clientes(33,"Jose","Mena","1755378385",11,new Date(),"Calderon","jp@gmail.com","0968241486");
		//clienteDAO.up(cliente1);
		
		//	DEL
		
		clienteDAO.del(31);
		
		//findAll
		List<Clientes> clientes = clienteDAO.findAll();
		
		
		
		
		//impresion
		for (Clientes item : clientes) {
			System.out.println(item.toString());
		}
		
		//findOne
		//Clientes cliente =clienteDAO.findOne(3);
		
		//System.out.println(cliente.toString());
		
		context.close();
	}

}
