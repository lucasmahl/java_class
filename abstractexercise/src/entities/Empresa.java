package entities;

public class Empresa extends Contribuinte {
	private Integer qtdeFuncionarios;

	public Empresa() {
		super();
	}

	public Empresa(String nome, double rendaAnual, Integer qtdeFuncionarios) {
		super(nome, rendaAnual);
		this.qtdeFuncionarios = qtdeFuncionarios;
	}

	public Integer getQtdeFuncionarios() {
		return qtdeFuncionarios;
	}

	public void setQtdeFuncionarios(Integer qtdeFuncionarios) {
		this.qtdeFuncionarios = qtdeFuncionarios;
	}

	@Override
	public double taxa() {
		if (qtdeFuncionarios > 10) {
			return rendaAnual * 0.14;
		} else {
			return rendaAnual * 0.16;
		}
	}

}
