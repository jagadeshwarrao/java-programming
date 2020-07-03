import java.util.logging.Logger;
import java.util.logging.*;
import java.util.logging.Level;

interface Pastry 
{

public void assemble();
}
class BasicCake implements Pastry {

public void assemble() {
System.out.print("Basic Cake.");
}

}

class CakeDecorator implements Pastry {

protected Pastry pastry;

public CakeDecorator(Pastry c){
this.pastry=c;
}


public void assemble() {
this.pastry.assemble();
}

}
 class StrawBerryCake extends CakeDecorator {

public StrawBerryCake(Pastry c) {
super(c);
}


public void assemble(){
super.assemble();
System.out.print(" Adding more flavours to the Straw Berry cake.");
}
}
 class ChocolateCake extends CakeDecorator {

public ChocolateCake(Pastry c) {
super(c);
}


public void assemble(){
super.assemble();
System.out.print(" Adding more flavours to the Chocolate cake.");
}
}


public class App8
{
      private static final Logger l=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
   
    public static void main( String[] args )
    {
       l.log(Level.INFO,"use of memento behaviour pattern and decorate structural pattern");
       Pastry StrawBerryCake = new StrawBerryCake(new BasicCake());
       Pastry cc=new ChocolateCake(new BasicCake());
StrawBerryCake.assemble();
                cc.assemble();
System.out.println("\n*****");

Pastry StrawBerryChocolateCake = new StrawBerryCake(new ChocolateCake(new BasicCake()));
StrawBerryChocolateCake.assemble();
       l.log(Level.INFO,"program terminated");
       
    }
}
