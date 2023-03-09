import java.util.Comparator;
public class myCoin implements Comparable<myCoin>{
    private String curr;
    private int value;
    private double weight;

    public myCoin(String curr, int value, double weight) {
        this.curr = curr;
        this.value = value;
        this.weight = weight;
    }

    public String getCurr() {
        return curr;
    }

    public int getValue() {
        return value;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Mince{" +
                "curr='" + curr + '\'' +
                ", value=" + value +
                ", weight=" + weight +
                '}';
    }

    public int compareTo(myCoin coin) {    
        return this.value - coin.getValue();  
    }

    public static final Comparator<myCoin> BY_WEIGHT = new Comparator<myCoin>() {
        public int compare(myCoin c1, myCoin c2) {
            if (c1.getWeight() > c2.getWeight()) {
                return 1;
            }
            else if (c1.getWeight() < c2.getWeight()) {
                return -1;
            }
            return 0;
        }
    };

    public static final Comparator<myCoin> BY_VALUE = new Comparator<myCoin>() {
        public int compare(myCoin c1, myCoin c2) {
            if (c1.getValue() == c2.getValue())
                return 0;
            else if (c1.getValue() > c2.getValue())
                return 1;
            return -1;
        }
    };

    public static final Comparator<myCoin> BY_CURR = new Comparator<myCoin>() {
        public int compare(myCoin c1, myCoin c2) {
            return c1.getCurr().compareTo(c2.getCurr());
        }
    };
};