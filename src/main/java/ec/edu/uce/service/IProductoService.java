package ec.edu.uce.service;

import ec.edu.uce.repository.modelo.Producto;
import ec.edu.uce.service.to.ProductoTO;

public interface IProductoService {

	public void create(Producto producto);
	public Producto read(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	
	public ProductoTO buscarCodigoBarras(String codigoBarras);
	public void ingresarProducto(ProductoTO productoTO);
}
