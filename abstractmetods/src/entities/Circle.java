package entities;

import entities.enums.Color;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
	}

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	// METODO ABSTRATO
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
