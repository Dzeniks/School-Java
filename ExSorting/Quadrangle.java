import java.util.Comparator;

public class Quadrangle implements Comparable<Quadrangle> {
    private float a,b;

    public Quadrangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getCircuit(){
        return 2*a+2*b;
    }

    public float getArea(){
        return a*b;
    }
    
    @Override
    public int compareTo(Quadrangle Q) {
        if (this.getArea() > Q.getArea()) { return 1;}
        else if (this.getArea() < Q.getArea()) { return -1;}
        return BY_CIRCUIT.compare(this, Q);
    }

    @Override
    public String toString() {
        return "Quadrangle [a=" + a + ", b=" + b + ", Area=" + this.getArea() + ", Circuit=" + this.getCircuit() + "]";
    }

    public static final Comparator<Quadrangle> BY_CIRCUIT = new Comparator<Quadrangle>() {
        public int compare(Quadrangle q1, Quadrangle q2) {
            if (q1.getCircuit() > q2.getCircuit()) {
                return 1;
            }
            else if (q1.getCircuit() < q2.getCircuit()) {
                return -1;
            }
            return 0;
        }
    };
    
}
