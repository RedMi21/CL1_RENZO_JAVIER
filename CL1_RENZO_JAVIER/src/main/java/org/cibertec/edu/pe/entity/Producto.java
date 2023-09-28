package org.cibertec.edu.pe.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	private int IdProducto;
    private String Descripcion;
    private int PrecioUnidad;
    private int Stock;
    private char Estado;
    
	public Producto() {
	}
	
	public Producto(int idProducto, String descripcion, int precioUnidad, int stock, char estado) {
		IdProducto = idProducto;
		Descripcion = descripcion;
		PrecioUnidad = precioUnidad;
		Stock = stock;
		Estado = estado;
	}
	
	public int getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(int idProducto) {
		IdProducto = idProducto;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getPrecioUnidad() {
		return PrecioUnidad;
	}
	public void setPrecioUnidad(int precioUnidad) {
		PrecioUnidad = precioUnidad;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public char getEstado() {
		return Estado;
	}
	public void setEstado(char estado) {
		Estado = estado;
	}
    
    
}
