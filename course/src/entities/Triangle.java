//pacote da classe
package entities;

public class Triangle {
	//public significa q pode ser usado em outros arquivos
	public double a;
	public double b;
	public double c;

	//retorna double, se fosse void não retornava nada
	public double area() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
