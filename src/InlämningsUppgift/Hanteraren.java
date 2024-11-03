package InlämningsUppgift;

public class Hanteraren {

    private int linjeAntal = 0;
    private int charAntal = 0;

    public void addInput(String text)
    {
        if (!text.equalsIgnoreCase("stop"))

        {

            linjeAntal++;
            charAntal += text.replaceAll("[^a-öA-Ö]", "").length();




        }


    }

    public int taLinjeAntal() {
        return linjeAntal;
    }

    public int taCharAntal() {
        return charAntal;
    }



}
