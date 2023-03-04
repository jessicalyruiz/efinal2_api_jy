package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.Producto;

public interface IProductoRepo {


	public void create(Producto producto);
	public Producto read(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	public Producto buscarCodigoBarras(String codigoBarras);
	
}
