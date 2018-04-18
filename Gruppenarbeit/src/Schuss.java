import java.io.Serializable;

public class Schuss implements Serializable{
	private Position position;
	private Spieler spieler;
	private int modus;
	private String nachricht;
	private boolean verloren;
	
	Schuss(Position position, Spieler spieler, int modus, String nachricht, boolean verloren){
		this.position = position;
		this.spieler = spieler;
		this.modus = modus;
		this.nachricht = nachricht;
		this.verloren = verloren;
	}
	
	public Position getPosition(){
		return position;
	}
	
	public Spieler getSpieler(){
		return spieler;
	}
	
	public int getModus(){
		return modus;
	}
	
	public String getNachricht(){
		return nachricht;
	}
	
	public boolean getVerloren(){
		return verloren;
	}
	
	
}
