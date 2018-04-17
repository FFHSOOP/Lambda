
public class Position {
	private int spalte;
	private int zeile;
	private boolean getroffen;
	
	Position(int spalte, int zeile, boolean getroffen){
		this.spalte = spalte;
		this.zeile = zeile;
		this.getroffen = getroffen;
	}
	
	public void setZeile(int zeile){
		this.zeile = zeile;
	}
	
	public void setSpalte(int spalte){
		this.spalte = spalte;
	}
	
	public void setGetroffen(boolean getroffen){
		this.getroffen = getroffen;
	}
	
	public int getZeile(){
		return this.zeile;
	}
	
	public int getSpalte(){
		return this.spalte;
	}
	
	public boolean getGetroffen(){
		return this.getroffen;
	}
}
