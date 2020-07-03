 interface Pastry  
  {
    String getFirstTimeImpression();
  }
enum PastryType {
    Puff,
    Baklava,
    Flaky,
    CinnamonRoll
}
//Puff
 class Puff implements Pastry {
    Puff(){}
    @Override
    public String getFirstTimeImpression() {
        return "Puff is so so.";
    }
}
//Baklava
 class Baklava implements Pastry {
    Baklava(){}
    @Override
    public String getFirstTimeImpression() {
        return "Baklava is good but a bit too sweet for me.";
    }
}
//Flaky
 class Flaky implements Pastry {
    Flaky(){}
    @Override
    public String getFirstTimeImpression() {
        return "Flaky is really good specially while still warm.";
    }
}
//CinnamonRoll
 class CinnamonRoll implements Pastry {
    CinnamonRoll(){}
    @Override
    public String getFirstTimeImpression() {
        return "CinnamonRoll is one of my favorite pastries.";
    }
}
public class PastryFactory {
    public static Pastry GetPastry(PastryType type){
        switch (type){
            case Puff:
                return new Puff();
            case Baklava:
                return new Baklava();
            case Flaky:
                return new Flaky();
            case CinnamonRoll:
                return new CinnamonRoll();
            default:
                return puff();
        }
    }
}