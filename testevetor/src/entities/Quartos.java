package entities;

public class Quartos {
	private String cliente;
	private int nQuarto;

	public Quartos(String cliente, int nQuarto) {
		this.cliente = cliente;
		this.nQuarto = nQuarto;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getnQuarto() {
		return nQuarto;
	}

	public void setnQuarto(int nQuarto) {
		this.nQuarto = nQuarto;
	}

}
