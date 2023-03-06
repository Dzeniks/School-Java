import java.lang.Comparable;

public class myCoin implements Comparable<myCoin>{

    String cur;
    float value, m;

    public int compareTo(myCoin coin){
        if (this.value > coin.value){ return 1;}
        else if (this.value < coin.value){ return -1;}
        return 0;
    }


    
}