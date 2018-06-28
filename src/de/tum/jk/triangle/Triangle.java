package de.tum.jk.triangle;

public class Triangle {

	double a;
	double b;
	double c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double calculateArea() {
		double s = (a + b + c) / 2.0;
		return Math.sqrt( s*(s-a)*(s-b)*(s-c)  );
		
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
