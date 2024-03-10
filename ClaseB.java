package gitPractica;

public class ClaseB {
	double a;
	double b;
	double c;
	@Override
	public String toString() {
		return "ClaseB [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public ClaseB(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {

		this.c = c;
	}
	public double resultado(){
	}

}
