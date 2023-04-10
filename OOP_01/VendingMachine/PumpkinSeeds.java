package VendingMachine;

public class PumpkinSeeds extends Seeds{
    private String pumpkinSeeds;

    public PumpkinSeeds(String name, double price, Integer wt, Integer count, String pumpkinSeeds) {
        super(name, price, wt, count);
        this.pumpkinSeeds=pumpkinSeeds;
     
    }
   @Override
   public String toString() {
       
       return String.format("%s %s",super.toString(), pumpkinSeeds);
   } 
}
