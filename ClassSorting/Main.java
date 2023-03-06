import java.util.ArrayList;
import java.util.Comparator;
import java.lang.Comparable;

public class Main{


    public static void main(String[] args) {

        ArrayList<myCoin> Ok = new ArrayList<myCoin>();


    }

}


class KomparatorPodleVahy implements Comparator<myCoin> {
    public int compare(myCoin os1, myCoin os2) {
      return (int)(os1.value - os2.value);
    }
}