
public class Kreuzer extends Schiff {
    public Kreuzer(){

        super.text1   = "Position des 4er Schiffes bitte im Spielfeld erfassen.";
    }
    public void setPositionen(Position pos1, Position pos2, Position pos3, Position pos4){
        super.positionen.add(pos1);
        super.positionen.add(pos2);
        super.positionen.add(pos3);
        super.positionen.add(pos4);
    }
}
