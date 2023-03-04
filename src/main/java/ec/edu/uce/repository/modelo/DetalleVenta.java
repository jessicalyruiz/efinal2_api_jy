package ec.edu.uce.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {

	
	@Id
	@Column(name = "deve_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_deve")
	@SequenceGenerator(name = "seq_deve", sequenceName = "seq_deve", allocationSize = 1)
	private Integer id;
	
	@Column(name = "deve_cantidad")
	private Integer cantidad;
	
	@Column(name = "deve_precioUnitario")
	private  BigDecimal precioUnitario;
	
	@Column(name = "deve_subtotal")
	private BigDecimal subtotal;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="deve_fk_venta" )
	private Venta venta;

	@OneToOne(mappedBy = "detalleVenta",cascade =  CascadeType.ALL)
	private Producto producto;
	//getters y setters
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public BigDecimal getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}


	public Venta getVenta() {
		return venta;
	}


	public void setVenta(Venta venta) {
		this.venta = venta;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
	
}
