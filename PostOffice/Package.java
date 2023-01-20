public class Package {
    
    private String ID, adress;
    private int  weight, price;
    private boolean delivered;

    public Package(String ID, String adress, int weight) {
        this.ID = ID;
        this.adress = adress;
        this.weight = weight;
        this.price = calcPrice(weight);
        this.delivered = false;
    }

    public int calcPrice(int weight){
        if (weight >= 5){return 5;}
        else {
            return 40;
        }
    }
    
    public boolean deliever(){
        return delivered = true;
    }

    public String getID(){
        return ID;
    }

    @Override
    public String toString() {
        return "Package [ID=" + ID + ", adress=" + adress + ", weight=" + weight + ", price=" + price + ", delivered="
                + delivered + "]";
    }
}
