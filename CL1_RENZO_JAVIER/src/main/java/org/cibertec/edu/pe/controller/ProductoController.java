package org.cibertec.edu.pe.controller;


import java.util.List;

import org.cibertec.edu.pe.entity.Producto;
import org.cibertec.edu.pe.interfaceService.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {

	@Autowired
	private IProductoService servicio;
	
	@GetMapping("/listar")
	public String Listar(Model m) {
		List<Producto> lista = servicio.Listado();
		m.addAttribute("productos", lista);
		return "listar";
	}
	
	@GetMapping("/nuevo")
	public String agregar(Model m) {
		m.addAttribute("producto", new Producto());
		return "form";
	}
	
	@GetMapping("/salvar")
	public String salvar(Producto c, Model m) {
		servicio.Grabar(c);
		return "redirect:/listar";
	}
	
	/*@PostMapping("/salvar")
    public String salvar(@Valid @ModelAttribute("producto") Producto c, BindingResult result, Model m) {
        if (result.hasErrors()) {
            return "form";
        }

        if (!validarProducto(c)) {
            m.addAttribute("error", "Error: Formato de producto inválido.");
            return "form"; 
        }
        servicio.Grabar(c);
        return "redirect:/listar";
    }

	private boolean validarProducto(Producto producto) {
        boolean isValid = true;

        if (producto.getDescripcion() == null || producto.getDescripcion().length() < 1 || producto.getDescripcion().length() > 50) {
            isValid = false;
        }

        if (producto.getPrecioUnidad() < 50 || producto.getPrecioUnidad() > 500) {
            isValid = false;
        }

        if (producto.getStock() <= 0) {
            isValid = false;
        }

        if (producto.getEstado() != '0' && producto.getEstado() != '1') {
            isValid = false;
        }

        return isValid;
    }*/
}
