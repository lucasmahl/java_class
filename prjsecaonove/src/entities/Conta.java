package entities;

public class Conta {
	private int numero;
	private String titular;
	private double saldo = 0;

	public Conta(int numero) {
		this.numero = numero;
	}

	public Conta(int numero, String titular, double initialDepositi) {
		this.numero = numero;
		this.titular = titular;
		deposita(initialDepositi);
	}

	public double getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double saldo) {
		this.saldo += saldo;
	}

	public void retira(double saldo) {
		this.saldo = (saldo>0) ? this.saldo - (saldo + 5.0) : this.saldo;
	}

	public String toString() {
		return "Númer conta: " + numero + ", Titular: " + titular + ", Saldo: " + saldo;
	}

}
