/*
Gal to Lit converter
*/
class GalToLit {
	public static void main(String args[]) {
		double gallons;
		double liters;
		final double UNIT;	
		UNIT = 3.7854;
		gallons = 10;
		

		liters = gallons * UNIT;
		System.out.println(UNIT);
		System.out.println(gallons + " gallons is " + liters + " liters.");
		
	}
}
