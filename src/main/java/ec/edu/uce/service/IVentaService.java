package ec.edu.uce.service;

import ec.edu.uce.repository.modelo.Venta;

public interface IVentaService {


	public void create(Venta venta);
	public Venta read(Integer id);
	public void update(Venta venta);
	public void delete(Integer id);
}
