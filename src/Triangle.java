public class Triangle extends Figura {
    private double base;
    private double altura;

    public Triangle(double b, double a) {
        this.base = b;
        this.altura = a;
    }

    @Override
    public double area() {
        return ((base * altura) / 2);
    }
}