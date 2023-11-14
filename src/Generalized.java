public class Generalized <T,V,K>{
    private T a;
    private V b;
    private K c;

    public Generalized(T a, V b, K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public V getB() {
        return b;
    }

    public void setB(V b) {
        this.b = b;
    }

    public K getC() {
        return c;
    }

    public void setC(K c) {
        this.c = c;
    }
    @Override
    public String toString() {
        return "Generalized{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
