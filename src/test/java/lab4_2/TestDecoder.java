package lab4_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDecoder {
    @Test
    public void testVowelReplacement(){
        String encodedMessage1 = "M4nk2y";
        String encodedMessage2 = "1m1t25r, v3d24: cr21t3v3ty";

        String decodedMessage1 = Decoder.vowelReplacement(encodedMessage1);
        String decodedMessage2 = Decoder.vowelReplacement(encodedMessage2);

        Assertions.assertEquals("Monkey", decodedMessage1);
        Assertions.assertEquals("amateur, video: creativity", decodedMessage2);
    }
    @Test
    public void testConsonantReplacement(){
        String encodedMessage1 = "sbdjtn";
        String encodedMessage2 = "fyqfsjfodf, Qsphsbnnjoh";

        String decodedMessage1 = Decoder.consonantReplacement(encodedMessage1);
        String decodedMessage2 = Decoder.consonantReplacement(encodedMessage2);

        Assertions.assertEquals("racism", decodedMessage1);
        Assertions.assertEquals("experience, Programming", decodedMessage2);
    }

    @Test
    public void testDecodeMessage(){
        String encodedMessage1 = "5n3v2rs2";
        String decodedMessage1 = Decoder.decodeMessage(encodedMessage1);
        Assertions.assertEquals("universe", decodedMessage1);

        String encodedMessage2 = "Xibu jt ju?";
        String decodedMessage2 = Decoder.decodeMessage(encodedMessage2);
        Assertions.assertEquals("What is it?", decodedMessage2);
    }
}
