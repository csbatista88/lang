package CircleArea;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.circle;

public class CircleArea {
    double raio;
    static double pi = 3.14;
    public CircleArea(double r) {
        raio = r;
    }
    double area() {
        return pi * raio * raio;
    }
}