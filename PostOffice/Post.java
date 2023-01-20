import java.util.ArrayList;

public class Post {

    private ArrayList<Package> Packages = new ArrayList<>();
    private static int ID;

    public void CreatePackage(String Adress, int Weight){
        ID++;
        Packages.add(new Package(Integer.toString(ID), Adress, Weight));
    }

    public Package getPackage(String ID){
        for (Package package1 : Packages) {
            if(package1.getID().equals(ID)){
                return package1;
            }
        }
        return null;
    }

    public boolean deliverPackage(String ID){
        Package pack = getPackage(ID);
        if(pack != null){
            pack.deliever();
        }
        return false;
    }
    
    public ArrayList<Package> getPackages(){
        return Packages;
    }

}
