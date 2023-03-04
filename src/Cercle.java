public class Cercle extends Figura {
    private double radi;

    public Cercle(double l) {
        this.radi = l;
    }

    @Override
    public double area() {
        return (Math.pow(radi, 2)) * Math.PI;
    }
}
