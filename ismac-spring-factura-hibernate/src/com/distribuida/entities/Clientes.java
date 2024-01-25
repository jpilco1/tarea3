package com.distribuida.entities;

import java.util.Date;

import javax.annotation.Generated;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component

@Entity
@Table(name = "cliente")



//# id_cliente, cedula, nombre, apellido, edad, fecha_nac, direccion, telefono, correo

public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(name = "id_cliente")
	private int idCliente;
	@Column(name = "cedula")
	private String cedula;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "edad")
	private int edad; // int 
	@Column(name = "fecha_nac")
	private Date fechaNacimiento;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "correo")
	private String correo;
	@Column(name = "telefono")
	private String telefono;
	
	public Clientes() {
		
	}
	

	public Clientes(int idCliente,String cedula, String nombre, String apellido,  int edad, Date fechaNacimiento,
			String direccion, String correo, String telefono) {
		
		this.idCliente = idCliente;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
	}


	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Se ejecutan tareas despues de la construccion del bean");
	}
	@PreDestroy
	public void preDestroy(){
	System.out.println("Se ejecutan tareas antes ");
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Clientes [idCliente=" + idCliente + ",cedula="
				+ cedula + ", nombre=" + nombre + ", apellido=" + apellido + ",  edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion
				+ ", correo=" + correo + ", telefono=" + telefono + "]";
	}

	
	
	
}
