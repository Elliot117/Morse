package MorseUppgift;

import java.util.HashMap;


public class EngelskaTillMorseLogik {

    private HashMap<String, Character> ReversCodeMap = new HashMap<>();
    private HashMap<Character, String> morseCodeMap = new HashMap<>();

    public EngelskaTillMorseLogik() {
        ReversCodeMap = new HashMap<>();
        ReversCodeMap.put(".-", 'A');
        ReversCodeMap.put("-...", 'B');
        ReversCodeMap.put("-.-.", 'C');
        ReversCodeMap.put("-..", 'D');
        ReversCodeMap.put(".", 'E');
        ReversCodeMap.put("..-.", 'F');
        ReversCodeMap.put("--.", 'G');
        ReversCodeMap.put("....", 'H');
        ReversCodeMap.put("..", 'I');
        ReversCodeMap.put(".---", 'J');
        ReversCodeMap.put("-.-", 'K');
        ReversCodeMap.put(".-..", 'L');
        ReversCodeMap.put("--", 'M');
        ReversCodeMap.put("-.", 'N');
        ReversCodeMap.put("---", 'O');
        ReversCodeMap.put(".--.", 'P');
        ReversCodeMap.put("--.-", 'Q');
        ReversCodeMap.put(".-.", 'R');
        ReversCodeMap.put("...", 'S');
        ReversCodeMap.put("-", 'T');
        ReversCodeMap.put("..-", 'U');
        ReversCodeMap.put("...-", 'V');
        ReversCodeMap.put(".--", 'W');
        ReversCodeMap.put("-..-", 'X');
        ReversCodeMap.put("-.--", 'Y');
        ReversCodeMap.put("--..", 'Z');


        morseCodeMap = new HashMap<>();
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
    }

    public static void konverteraTillMorse(String Input, EngelskaTillMorseLogik morseLogik) {

        Input = Input.toUpperCase();

        String HelaMeningen = "";

        try
        {


        for (int i = 0; i < Input.length(); i++) {
            char c = Input.charAt(i);
            String morseKod = morseLogik.getMorseCode(c);

            if (c == ' ')

            {
                HelaMeningen += " ";
            }


            else if(morseKod != null) {
                HelaMeningen += morseKod + " ";
                System.out.println("Morse kod för '" + c + "' är: " + morseKod);


            } else {
                System.out.println("Bokstaven '" + c + "' finns inte i morsekodtabellen.");
            }
        }
            System.out.println("Översättningen blev:" + " " + HelaMeningen);
        }
        catch (Exception e)

        {
            System.out.println("Fel inmatning");


        }


    }

    public static void Reverskonvertering(String Input, EngelskaTillMorseLogik morseLogik) {


        String helaMeningen = "";
        String[] morseCodes = Input.split(" ");

        try
        {
            for (String morse : morseCodes)
            {
                if(morse.isEmpty())

                {
                 helaMeningen += "";
                }

                char bokstav = morseLogik.getEnglishWords(morse);

                if (bokstav != 0)
                {
                    helaMeningen += bokstav;
                    System.out.println("Morsekod: " + morse +" " +"Motsvarar bokstav: " + bokstav);

                }

            }

        }

        catch (Exception e)
        {

            System.out.println("Din inmatning var fel:");
        }


        System.out.println("Översättningen blev:" + " " + helaMeningen);


    }

    public String getMorseCode(char bokstav) {
        return morseCodeMap.get(bokstav);

    }

    public char getEnglishWords(String morseKod) {

        return ReversCodeMap.get(morseKod);

    }
}