import java.util.ArrayList;
import java.util.List;

/*
 * Klasse in Konstruktion
 */


public class Schiff {
	protected int length = 0;
    protected String text1 = null;
    protected String text2 = "Die Felder müssen zusammehängend und in einer vertikalen oder horizontalen Reihe sein.";
    protected List<Position> positionen;
    protected int tcount = 0;

 
    public Schiff() {
    	positionen = new ArrayList<>();
    }
    

 
    public void setLength(int l) {
        length = l;
    }
 
    public void setText(String t) {
        text1 = t;
    }
 
    public void setText2(String t2) {
        text2 = t2;
    }
 
    public int getLength() {
        return positionen.size();
    }
 
    public String getText() {
        return text1;
    }
 
    public String getText2() {
        return text2;
    }

    
    public boolean trefferCheck(Position position){
    	boolean treffer = false;
    	
    	for (Position element : positionen){
    		if (position.getSpalte() == element.getSpalte()
    				&& position.getZeile() == element.getZeile()){
    			element.setGetroffen(true);
    			treffer = true;
    			tcount++;
    		}
    		
    	}
    	return treffer;
    }
    
   
 
    public boolean versenkt() {
    	boolean versenkt = false;
        if (tcount == positionen.size()) {
        	versenkt = true;
            
        }
        return versenkt;
}
}