package ec.edu.uce.repository;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Venta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VentaRepoImpl implements IVentaRepo{

	@PersistenceContext 
	EntityManager entityManager;
	
	@Override
	public void create(Venta venta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(venta);
	}

	@Override
	public Venta read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Venta.class, id);
	}

	@Override
	public void update(Venta venta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(venta);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

}
