
public class Hund extends Saeugetier implements Vierbeiner {

	public Hund(String name) {
		super(name);
	}

    public boolean kannKriechen(){
        return false;
    }
    
    public boolean kannLaufen(){
        return true;
    }
}
