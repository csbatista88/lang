package circleArea;

public class math {
	double raio;
	static double pi = 3.14;
	
	public math(double raio) {
		this.raio = raio;
	}
	
	double area() {
		return pi * Math.pow(raio, raio);
	}

}
