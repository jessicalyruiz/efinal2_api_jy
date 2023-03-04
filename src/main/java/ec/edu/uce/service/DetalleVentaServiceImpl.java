package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IDetalleVentaRepo;
import ec.edu.uce.repository.modelo.DetalleVenta;



@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService{

	@Autowired
	IDetalleVentaRepo detalleVentaService;
	
	@Override
	public void create(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.detalleVentaService.create(detalleVenta);
	}

	@Override
	public DetalleVenta read(Integer id) {
		// TODO Auto-generated method stub
		return this.detalleVentaService.read(id);
	}

	@Override
	public void update(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.detalleVentaService.update(detalleVenta);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.detalleVentaService.delete(id);
	}

}
