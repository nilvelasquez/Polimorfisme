public class Quadrat extends Figura {
    private double costat;

    public Quadrat(double l) {
        this.costat = l;
    }

    @Override
    public double area() {
        return costat * costat;
    }
}