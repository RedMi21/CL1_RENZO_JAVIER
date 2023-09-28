package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.entity.Producto;

public interface IProductoService {
	public List<Producto> Listado();
	public Optional<Producto> Buscar(int id);
	public int Grabar(Producto ObjC);
	public void Suprimir(int id);
}
