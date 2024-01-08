package lab4_2;

public class Main {
    public static void main(String[] args){
        String encodedMessage1 = "t2st3ng";
        String encodedMessage2 = "uftujoh";

        String decodedMessage1 = Decoder.decodeMessage(encodedMessage1);
        String decodedMessage2 = Decoder.decodeMessage(encodedMessage2);

        System.out.println("Decoded message 1: " + decodedMessage1);
        System.out.println("Decoded message 2: " + decodedMessage2);
    }
}
