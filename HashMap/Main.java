public class Main {

    public static void main(String[] args) {
        MyDictionary dictionary = new MyDictionary();

        dictionary.addWord("lev", "lion");
        dictionary.addWord("tygr", "tiger");
        dictionary.addWord("slon", "elephant");
        dictionary.addWord("slon", "elephanth");
        dictionary.addWord("pes", "dog");
        dictionary.addWord("kočka", "cat");
        dictionary.addWord("had", "snake");
        dictionary.addWord("kůň", "horse");
        dictionary.addWord("měsíc", "moon");
        dictionary.addWord("slunce", "sun");
        System.out.println(dictionary);

        System.out.println("slunce - " + dictionary.translate("slunce"));
        System.out.println("pes - " + dictionary.translate("pes"));
        System.out.println("kočka - " + dictionary.translate("kočka"));
        System.out.println("slon - " + dictionary.translate("slon"));
    }

}
