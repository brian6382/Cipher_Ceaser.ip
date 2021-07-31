package Ceaser;

public class Cypher {

    public static  String EncodeText(String message, int shiftKey){
        //c(x) + x shiftKey %26;
        final String ALPHABETS = "qwertyuiopasdfghjklzxcvbnm";
        message = message.toLowerCase();
        StringBuilder cypherText = new StringBuilder();

        for (int counter = 0; counter< message.length();counter++){
            if (!Character.isLetter(message.charAt(counter))){
                cypherText.append(message.charAt(counter));

            }else {
                int charPosition = ALPHABETS.indexOf(message.charAt(counter));
                int keyValue = (charPosition + shiftKey)% 26;

                char cypherValue = ALPHABETS.charAt(keyValue);
                cypherText.append(cypherValue);


            }
        }
        return cypherText.toString();

    }
    public String unDoCeaseCipher(String message, int shiftKey){
        return EncodeText(message, 26 - shiftKey);
    }


}
