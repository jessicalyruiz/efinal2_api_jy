package ec.edu.uce.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.uce.repository.modelo.DetalleVenta;
import ec.edu.uce.service.IProductoService;
import ec.edu.uce.service.to.DetalleVentaTO;
import ec.edu.uce.service.to.ProductoGuardarTO;
import ec.edu.uce.service.to.ProductoTO;
import ec.edu.uce.service.to.VentaTO;

@RestController
@RequestMapping(path = "/ventas")
public class VentaControllerRestFul {

	@Autowired
	IProductoService productoService;
	
	@GetMapping(path = "/productos")
	public DetalleVentaTO ProductoEnStock(@RequestBody DetalleVentaTO detalleVentaTO) {
		ProductoTO productoTO=this.productoService.buscarCodigoBarras(detalleVentaTO.getCodigoBarras());
		detalleVentaTO.setSubtotal(productoTO.getPrecio().multiply(new BigDecimal(detalleVentaTO.getCantidad())));
		detalleVentaTO.setNombreProducto(productoTO.getNombre());
		detalleVentaTO.setPrecio(productoTO.getPrecio());
		if((productoTO.getStock()-detalleVentaTO.getCantidad())>=0) {
			return detalleVentaTO; //si hay producto en stock
		}else {
			detalleVentaTO.setNombreProducto("No hay");
			return detalleVentaTO; // no hay producto
		}
			
	}
	
	
	@PostMapping
	public BigDecimal guardarVenta(@RequestBody VentaTO venta) {
		List<ProductoGuardarTO> productos=venta.getProductos();
		BigDecimal total= new BigDecimal(0);
		for (ProductoGuardarTO p : productos) {
			ProductoTO prod=this.productoService.buscarCodigoBarras(p.getCodigoBarras());
			
			total=total.add(prod.getPrecio().multiply(new BigDecimal(p.getCantidad())));
			
		}
		return total;
	}
	
	

}
