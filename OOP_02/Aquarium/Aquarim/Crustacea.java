package Aquarim;

public class Crustacea extends Bilateralia{
    public Crustacea(String title,Integer counter) {
        super(title, counter);
       

    }

   @Override 
   public String movement(){
    return "ползает и пятится задом";
   }
  
   
   @Override 
   public String feed(){
    return "всё : живое, мёртвое, растительность";
   }

	}

    // @Override
    // public Integer weight() {
    // return -1;
    // }
    // // rak


