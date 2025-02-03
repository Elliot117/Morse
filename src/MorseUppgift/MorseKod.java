package MorseUppgift;

import java.util.Objects;
import java.util.Scanner;

public class MorseKod {

    public static void main(String[] args) {

        EngelskaTillMorseLogik morseLogik = new EngelskaTillMorseLogik();

        Scanner scan = new Scanner(System.in);

        Boolean Programm = true;

        while (Programm) {
            System.out.println("Skriv Eng för Engelska:");
            System.out.println("Skriv Morse för Morsekod :");
            String Alternativ = scan.nextLine();
            Alternativ = Alternativ.toUpperCase();


            if (Objects.equals(Alternativ, "ENG"))

            {

                System.out.println("Skriv ett ord på engelska");
                String val = scan.nextLine();

                EngelskaTillMorseLogik.konverteraTillMorse(val, morseLogik);


            }

            if (Objects.equals(Alternativ, "MORSE"))

            {

                System.out.println("Skriv morse kod till engelska");
                String val = scan.nextLine();


                EngelskaTillMorseLogik.Reverskonvertering(val, morseLogik);


            }

            else if(Objects.equals(Alternativ, "STOP")) {
                System.out.println("Pågrammet stängs ner:");
                Programm = false;
                break;

            }



        }

    }

    }

