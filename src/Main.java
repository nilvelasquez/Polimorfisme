import java.util.Arrays;

public class Main {
    public static double suma(Figura[] l) {
        double res = 0;
        for (Figura s : l) {
            res += s.area();
        }
        return res;
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new Triangle(5, 10);

        double res = suma(v);

        System.out.println("suma: " + res);

        System.out.println("Lo que tenemos originalmente: "+Arrays.toString(v));

        Arrays.sort(v);

        System.out.println("Ordenado por tamaño: "+Arrays.toString(v));
    }
}