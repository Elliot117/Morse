package MorseUppgift;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class MorseKodTest
{

    @Test
    public void testKonverteraTillMorse() {

        String input = "HELLO";
        EngelskaTillMorseLogik.konverteraTillMorse(input, new EngelskaTillMorseLogik());

    }

    @Test
    public void testKonverteraTillMorseMedMellanslag() {

        String input = "HELLO WORLD";
        EngelskaTillMorseLogik.konverteraTillMorse(input, new EngelskaTillMorseLogik());

    }

    @Test
    public void testReverskonvertering() {

        String input = ".... . .-.. .-.. ---";
        EngelskaTillMorseLogik.Reverskonvertering(input, new EngelskaTillMorseLogik());

    }

    @Test
    public void testReverskonverteringMedMellanslag() {

        String input = ".... . .-.. .-.. --- .-- --- .-. .-.. -..";
        EngelskaTillMorseLogik.Reverskonvertering(input, new EngelskaTillMorseLogik());

    }

    @Test
    public void testFelaktigMorseInmatning() {

        String input = ".... . .-.. .-.. --- XYZ";
        EngelskaTillMorseLogik.Reverskonvertering(input, new EngelskaTillMorseLogik());

    }

}
