package ec.edu.uce.repository;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.DetalleVenta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DetalleVentaRepoImpl implements IDetalleVentaRepo{

	@PersistenceContext 
	EntityManager entityManager;
	
	@Override
	public void create(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(detalleVenta);
	}

	@Override
	public DetalleVenta read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(DetalleVenta.class, id);
	}

	@Override
	public void update(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(detalleVenta);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

}
