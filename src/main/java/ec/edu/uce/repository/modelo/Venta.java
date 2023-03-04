package ec.edu.uce.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {

	
	@Id
	@Column(name = "vent_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_venta")
	@SequenceGenerator(name = "seq_venta", sequenceName = "seq_venta", allocationSize = 1)
	private Integer id;
	
	@Column(name = "vent_numero")
	private String numero;
	
	@Column(name = "vent_cedula_cliente")
	private String cedulaCliente;
	
	@Column(name = "vent_total_vental")
	private BigDecimal totalVental;
	
	@OneToMany(mappedBy = "venta",cascade =  CascadeType.ALL)
	private List<DetalleVenta> detalles;
	
	@OneToMany(mappedBy = "venta", cascade =  CascadeType.ALL)
	private List<Producto> productos;

	
	//getters y setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public BigDecimal getTotalVental() {
		return totalVental;
	}

	public void setTotalVental(BigDecimal totalVental) {
		this.totalVental = totalVental;
	}

	public List<DetalleVenta> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleVenta> detalles) {
		this.detalles = detalles;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	
}
