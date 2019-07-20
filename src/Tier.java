public class Tier {
   
   private int anzahlBeine;   
    private String tier;
    
    public Tier(String name){
        tier = name;
    }
    
    public String getName(){
        return tier;
    }
    
    public void setName(String name){
        tier = name;
    }
        public int getBeine(){
        return anzahlBeine;
    }
    
    public void setBeine(int beine){
        anzahlBeine = beine;
    }
}
