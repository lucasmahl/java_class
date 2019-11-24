package entities;

public class Pessoa extends Contribuinte {
	private double gastossaude;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, double rendaAnual, double gastossaude) {
		super(nome, rendaAnual);
		this.gastossaude = gastossaude;
	}

	public double getGastossaude() {
		return gastossaude;
	}

	public void setGastossaude(double gastossaude) {
		this.gastossaude = gastossaude;
	}

	@Override
	public double taxa() {
		if (rendaAnual < 20000) {
			return (rendaAnual * 0.15) - (gastossaude * 0.50);
		}else {
			return (rendaAnual * 0.25) - (gastossaude * 0.50);
		}
	}

}
