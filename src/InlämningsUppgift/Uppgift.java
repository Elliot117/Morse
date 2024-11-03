package InlämningsUppgift;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Uppgift {

        public static void main(String[] args) {

            Hanteraren räknare = new Hanteraren();
            Scanner scanner = new Scanner (System.in);
            System.out.println("Skriv in text tills du vill avbryta, skriv stop");

            List<String> textList = new ArrayList<>();

            while (true)

            {
                String text = scanner.nextLine();

                if(text.equalsIgnoreCase("stop"))

                {
                    System.out.println("Du skrev detta");


                    for (String inmatningar : textList)
                    {

                        System.out.println(inmatningar);

                    }

                    break;


                }

                else
                {
                    räknare.addInput(text);
                    textList.add(text);


                }


            }

            System.out.println("Antal rader: " + räknare.taLinjeAntal());
            System.out.println("Totalt antal bokstäver: " + räknare.taCharAntal());
            //






        }
















}
