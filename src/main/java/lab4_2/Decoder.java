package lab4_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decoder {
    public static String vowelReplacement(String message){
        return message.replaceAll("1", "a")
                .replaceAll("2", "e")
                .replaceAll("3", "i")
                .replaceAll("4", "o")
                .replaceAll("5", "u");
    }
    public static String consonantReplacement(String message){
        StringBuilder decoded = new StringBuilder();
        for(int i = 0; i < message.length(); i++){
            char currentSymb = message.charAt(i);
            char decodedSymb = currentSymb;
            if(Character.isLetter(currentSymb)){
                if(currentSymb == 'a' || currentSymb == 'A'){
                    decodedSymb = (char) (decodedSymb + 25);
                } else {
                    decodedSymb = (char) (currentSymb - 1);
                }
            }
            decoded.append(decodedSymb);
        }
        return decoded.toString();
    }
    public static boolean isVowelReplacement(String message){
        Pattern pattern = Pattern.compile("[1-5]+");
        Matcher matcher = pattern.matcher(message);
        return matcher.find();
    }

    public static boolean isConsonantReplacement(String message){
        Pattern pattern = Pattern.compile("[bcdfghjklmnpqrstvwxyz]+");
        Matcher matcher = pattern.matcher(message);
        return matcher.find();
    }
    public static String decodeMessage(String message){
        String[] words = message.split("\\s+");
        StringBuilder decodedMessage = new StringBuilder();
        for(String word : words){
            if(isVowelReplacement(word)){
                decodedMessage.append(vowelReplacement(word));
            } else if(isConsonantReplacement(word)){
                decodedMessage.append(consonantReplacement(word));
            } else{
                decodedMessage.append(word);
            }
            decodedMessage.append(" ");
        }
        return decodedMessage.toString().trim();
    }
}
