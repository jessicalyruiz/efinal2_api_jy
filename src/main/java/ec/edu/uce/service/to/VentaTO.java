package ec.edu.uce.service.to;

import java.util.List;

public class VentaTO {

	private String numerVenta;
	private String cedula;
	List<ProductoGuardarTO> productos;
	public String getNumerVenta() {
		return numerVenta;
	}
	public void setNumerVenta(String numerVenta) {
		this.numerVenta = numerVenta;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public List<ProductoGuardarTO> getProductos() {
		return productos;
	}
	public void setProductos(List<ProductoGuardarTO> productos) {
		this.productos = productos;
	}
	
	
	
}
