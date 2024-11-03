package InlämningsUppgift;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;



public class TestAvHanteraren {


 @Test

 public void rader(){

     Hanteraren hanteraren = new Hanteraren();
     hanteraren.addInput("Valfri rad: Hej");
     hanteraren.addInput("Valfri rad: På dig");



     assertEquals(2,hanteraren.taLinjeAntal());



 }

    @Test

    public void tecken(){

     Hanteraren hanteraren = new Hanteraren();
     hanteraren.addInput("Hej på dig");


        assertEquals(8,hanteraren.taCharAntal());



    }

    @Test

    public void filtrering(){

     Hanteraren hanteraren = new Hanteraren();
     hanteraren.addInput("Hej     ....      på &%()=+- dig!");

     assertEquals(8,hanteraren.taCharAntal());






    }


}
