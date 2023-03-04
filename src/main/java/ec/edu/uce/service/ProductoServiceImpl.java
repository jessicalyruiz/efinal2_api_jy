package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IProductoRepo;
import ec.edu.uce.repository.modelo.Producto;
import ec.edu.uce.service.to.ProductoTO;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	IProductoRepo productoService;
	
	@Override
	public void create(Producto producto) {
		// TODO Auto-generated method stub
		this.productoService.create(producto);
	}

	@Override
	public Producto read(Integer id) {
		// TODO Auto-generated method stub
		return this.productoService.read(id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		this.productoService.update(producto);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.productoService.delete(id);
	}

	@Override
	public ProductoTO buscarCodigoBarras(String codigoBarras) {
		// TODO Auto-generated method stub
		return this.convertirProductoTO(this.productoService.buscarCodigoBarras(codigoBarras));
	}

	@Override
	public void ingresarProducto(ProductoTO productoTO) {
		// TODO Auto-generated method stub
		Producto producto= this.productoService.buscarCodigoBarras(productoTO.getCodigoBarras());
		
		if(producto!=null) {
			producto.setStock(producto.getStock()+productoTO.getStock());
			this.productoService.update(producto);
		}else {
		
		this.create(this.convertirProducto(productoTO));
		}
	}
	
	public Producto convertirProducto(ProductoTO productoTO) {
		Producto producto=new Producto();
		producto.setCategoria(productoTO.getCategoria());
		producto.setCodigoBarras(productoTO.getCodigoBarras());
		producto.setNombre(productoTO.getNombre());
		producto.setPrecio(productoTO.getPrecio());
		producto.setStock(productoTO.getStock());
		
		return producto;
	}
	
	public ProductoTO convertirProductoTO(Producto producto) {
		ProductoTO productoTO=new ProductoTO();
		productoTO.setCategoria(producto.getCategoria());
		productoTO.setCodigoBarras(producto.getCodigoBarras());
		productoTO.setNombre(producto.getNombre());
		productoTO.setPrecio(producto.getPrecio());
		productoTO.setStock(producto.getStock());
		
		return productoTO;
	}

}
