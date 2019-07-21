
public class Echse extends Reptil implements Vierbeiner {
    
    public Echse(String name){
        super(name);
    }
    
    public boolean kannKriechen(){
        return false;
    }
    
    public boolean kannLaufen(){
        return true;
    }
}
