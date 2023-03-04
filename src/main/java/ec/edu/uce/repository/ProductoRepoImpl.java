package ec.edu.uce.repository;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo{

	@PersistenceContext 
	EntityManager entityManager;
	
	@Override
	public void create(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

	@Override
	public Producto buscarCodigoBarras(String codigoBarras) {
		// TODO Auto-generated method stub
		TypedQuery<Producto>myQuery=this.entityManager.createQuery("Select p from Producto p where p.codigoBarras=:valor", Producto.class);
		myQuery.setParameter("valor", codigoBarras);
		return myQuery.getSingleResult();
	}

}
