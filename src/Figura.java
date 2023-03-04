public abstract class Figura implements Comparable<Figura> {
    public abstract double area();
    int res;
    @Override
    public int compareTo (Figura f){
        res=Double.compare(this.area(), f.area());
        return res;
    }
    public String toString(){
        return getClass().getName();
    }
}