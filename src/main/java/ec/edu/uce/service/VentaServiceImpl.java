package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IVentaRepo;
import ec.edu.uce.repository.modelo.Venta;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	IVentaRepo ventaService;
	
	@Override
	public void create(Venta venta) {
		// TODO Auto-generated method stub
		this.ventaService.create(venta);
	}

	@Override
	public Venta read(Integer id) {
		// TODO Auto-generated method stub
		return this.ventaService.read(id);
	}

	@Override
	public void update(Venta venta) {
		// TODO Auto-generated method stub
		this.ventaService.update(venta);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.ventaService.delete(id);
	}

}
