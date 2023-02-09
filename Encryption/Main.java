public class Main{

    public static void main(String[] args) {

        System.out.println("Ceasar's Cipher");
        String text = "a a a a a a a a a a a";
        System.out.println(text);
        String textEncrypt = ceasarEncrypt(text);
        System.out.println(textEncrypt);
        System.out.println(ceasarDecrypt(textEncrypt));
        
        System.out.println();

        System.out.println("Substitute Encryption");
        text = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String kez = "123456789!@#$%^&*()";
        textEncrypt = substituteEncrypt(text, kez);
        System.out.println(textEncrypt);

    }

    public static String ceasarEncrypt(String inpuString){
        String[] words = inpuString.split(" "); 
        String ciphertext = "";
        for (int key = 0; key < words.length; key++){
            if (key != 0) {ciphertext += " ";}
            for(int idx = 0; idx < words[key].length(); idx++){
                char c = words[key].charAt(idx);
                if (Character.isLetter(c)) {
                    int offset = 'a';
                    if(Character.isUpperCase(c)){offset = 'A';}
                    c = (char)(((c + (key + 1) - offset) % 26) + offset);
                }
                ciphertext += (c);
            }
        }
        return ciphertext;
    }

    public static String ceasarDecrypt(String inpuString){
        String[] words = inpuString.split(" "); 
        String ciphertext = "";
        for (int key = 0; key < words.length; key++){
            for(int idx = 0; idx < words[key].length(); idx++){
                char c = words[key].charAt(idx);
                if (Character.isLetter(c)) {
                    int offset = 'a';
                    if(Character.isUpperCase(c)){offset = 'A';}
                    c = (char)((((c - (key + 1) - offset) ) % 26) + offset);
                }
                ciphertext += (c);
            }
            ciphertext += " ";
        }
        return ciphertext;
    }
    
    public static String substituteEncrypt(String inpuString, String key){
        int offset = 'a';
        char[] keyAlphabet = key.toCharArray();
        // Show alphabet
        for(int i = 0; i < 26; i++){
            char c = (char)(i + offset);
            System.out.print(c + " ");
        }
        System.out.println();

        // Show key 
        for(int i = 0; i < key.length(); i++){
            char c = (char)(key.charAt(i));
            System.out.print(c + " ");
        }
        System.out.println();
        
        // Show lost letters
        for(int i = key.length(); i < 26; i++){
            char c = (char)(i + offset);
            System.out.print(c + " ");
        }
        System.out.println();

        // Encrypt
        String Encrypted = "";
        for (String string : inpuString.split("")) {
            char c = string.charAt(0); 
            if (Character.isLetter(c)){
                int index = c - offset;
                if (index < (keyAlphabet.length)){
                    Encrypted += keyAlphabet[index];
                }
            }
            else{ Encrypted += c; }
        }
    return Encrypted;
    }

}
