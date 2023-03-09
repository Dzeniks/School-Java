import java.util.ArrayList;
import java.util.Collections;;


public class Main{

    public static void main(String[] args) {
        ArrayList<myCoin> coins = new ArrayList<>();
        coins.add(new myCoin("USD", 25, 10.0));
        coins.add(new myCoin("ADK", 40, 1.0));
        coins.add(new myCoin("EUR", 20, 9.0));
        coins.add(new myCoin("JPY", 10, 5.0));
        coins.add(new myCoin("ABC", 10, 5.0));

        
        Collections.sort(coins);

        for (myCoin myCoin : coins) {
            System.out.println(myCoin);
        }
        
        // coins.sort(myCoin.BY_CURR);
        // displayList(coins);
        // coins.sort(myCoin.BY_VALUE);
        // displayList(coins);
        // coins.sort(myCoin.BY_WEIGHT);
        // displayList(coins);

    }


    public static void displayList(ArrayList<myCoin> coins){
        for (myCoin coin : coins) {
            System.out.println(coin.getCurr() + ": " + coin.getValue() + ", " + coin.getWeight());
        }
        System.out.println();
    }

}