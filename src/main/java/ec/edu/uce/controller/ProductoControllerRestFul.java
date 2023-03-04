package ec.edu.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.uce.service.IProductoService;
import ec.edu.uce.service.to.ProductoTO;

@RestController
@RequestMapping(path = "/productos")
public class ProductoControllerRestFul {

	
	@Autowired
	IProductoService productoService;
	
	@PostMapping
	public void ingresarProducto(@RequestBody ProductoTO productoTO) {
		this.productoService.ingresarProducto(productoTO);
	}

}
