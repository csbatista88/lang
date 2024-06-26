public class Main {
	public static void main(String[] args) {
		Cookie cookieOne = new Cookie("green");
		Cookie cookieTwo = new Cookie("blue");
		

		//received new color
		cookieOne.setColor("yellow");
		
		System.out.println(cookieOne.getColor());
		System.out.println(cookieTwo.getColor());
	}
}
