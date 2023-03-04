package ec.edu.uce.service;

import ec.edu.uce.repository.modelo.DetalleVenta;

public interface IDetalleVentaService {


	public void create(DetalleVenta detalleVenta);
	public DetalleVenta read(Integer id);
	public void update(DetalleVenta detalleVenta);
	public void delete(Integer id);
}
