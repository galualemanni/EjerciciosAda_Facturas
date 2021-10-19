package facturas;

public class Factura {
	private Integer numero;
	private Float importe;
	private String cliente;

	public Factura(String cliente, Float importe, int numero) {
		this.cliente = cliente;
		this.importe = importe;
		this.numero = numero;

	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Float getImporte() {
		return importe;
	}

	public void setImporte(Float importe) {
		this.importe = importe;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

}
