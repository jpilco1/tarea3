package com.distruibuida.principalDto;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.ClienteService;
import com.distribuida.entities.Clientes;

public class PrincipalClienteDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteService clienteService = context.getBean("clienteServiceImpl",ClienteService.class);
		
		
		//CRUD
		
		//ADD
		//Clientes cliente =new Clientes(0,"1755378385","Jimmy","Pilco",15,new Date(),"Calderon","0968241486","jp15@gmail.com");
		//clienteService.add(0,"Jimmy","Pilco","1758629584",15,new Date(),"Calderon","0968241486","jp15@gmail.com");
		
		//UP
		//Clientes cliente1 =new Clientes(33,"Jose","Mena","1755378385",11,new Date(),"Calderon","jp@gmail.com","0968241486");
		clienteService.up(39,"Jim","Pilco","1758629584",15,new Date(),"Calderon","0968241486","jp15@gmail.com");
		
		
		
		
		//	DEL
		
		//clienteService.del(37);
		
		//findAll
		List<Clientes> clientes = clienteService.findAll();
		
		
		
		
		//impresion
		for (Clientes item : clientes) {
			System.out.println(item.toString());
		}
		
		//findOne
		//Clientes cliente =clienteService.findOne(3);
		
		//System.out.println(cliente.toString());
		
		context.close();
	}

}
