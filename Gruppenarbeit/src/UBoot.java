
public class UBoot extends Schiff {
    public UBoot(){
   	
        super.text1   = "Position des 2er Schiffes bitte im Spielfeld erfassen.";
    }
    
    public void setPositionen(Position pos1, Position pos2){
    	super.positionen.add(pos1);
    	super.positionen.add(pos2);
    }
}
