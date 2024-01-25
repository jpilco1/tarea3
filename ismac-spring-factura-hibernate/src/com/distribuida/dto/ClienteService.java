package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Clientes;

public interface ClienteService {

	//CRUD :CREATE,   READ,     UPDATE, DELETE
		//		(ADD), (FIND-SELECT),(UP), (DEL)
		
		public List<Clientes> findAll();
		
		public Clientes findOne(int id);
		
		public void add(int idCliente,String cedula, String nombre, String apellido,  int edad, Date fechaNacimiento,
				String direccion, String correo, String telefono);
		
		public void up(int idCliente,String cedula, String nombre, String apellido,  int edad, Date fechaNacimiento,
				String direccion, String correo, String telefono);
		
		public void del(int id);
}
