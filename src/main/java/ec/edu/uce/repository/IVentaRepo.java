package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.Venta;

public interface IVentaRepo {


	public void create(Venta venta);
	public Venta read(Integer id);
	public void update(Venta venta);
	public void delete(Integer id);
}
