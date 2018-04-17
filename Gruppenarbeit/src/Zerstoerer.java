
public class Zerstoerer extends Schiff {
    public Zerstoerer(){
        super.text1   = "Position des 3er Schiffes bitte im Spielfeld erfassen.";
    }
    
    public void setPositionen(Position pos1, Position pos2, Position pos3){
    	super.positionen.add(pos1);
    	super.positionen.add(pos2);
    	super.positionen.add(pos3);
    }
}
