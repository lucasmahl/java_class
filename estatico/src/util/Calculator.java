package util;

public class Calculator {

	// final pq � constante e n�o ir� mudar
	// PI EM MAIUSCULO PQ � CONSTANTE
	// se fosse + de 1 palavra, usaria underline
	public static final double PI = 3.14159;// aqui n�o ser� necess�rio declarar como static

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * (radius * radius * radius) / 3;
	}

}
