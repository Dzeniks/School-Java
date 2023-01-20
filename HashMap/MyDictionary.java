public class MyDictionary{

    private String[][] Map;
    private int count, MaxCount;

    public MyDictionary(){
        this.Map = new String[10][2];
        this.MaxCount = 7;
        this.count = 0; 
    }

    public boolean addWord(String czech, String english){
        if (this.count < this.MaxCount){
            int idx = myHash(czech);
            for(int i=0; i < this.Map.length; i++){
                if (Map[idx][0] == null || Map[idx][0].equals(czech)){
                    if (Map[idx][0] == null){
                        this.count++;
                    }
                    Map[idx][0] = czech;
                    Map[idx][1] = english;   
                    return true;
                }
                idx = ++idx % 10;
            }
        }
        return false;
    }

    public String translate(String key){
        int idx = myHash(key);
        for(int i=0; i < this.Map.length; i++){
            if (Map[idx][0] == null){
                break;
            }
            else if (Map[idx][0].equals(key)){
                return Map[idx][1];
            }
            idx = ++idx % 10;
        }
        return null;
    }

    private int myHash(String key){
        int asciiValue = 0;
        for(char c : key.toCharArray()){
            asciiValue += (int) c;
        }
        return asciiValue%10;
    }

    @Override
    public String toString(){
        String out = "";
        for (String[] strings : Map) {
            out += "[" +strings[0] + ": " + strings[1] + "]\n";
        }
        return out;
    }

}