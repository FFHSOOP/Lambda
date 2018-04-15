
/*
 * Klasse in Konstruktion
 */


public class Schiff {
	protected int length = 0;
    protected String text1 = null;
    protected String text2 = "Die Felder müssen zusammehängend und in einer vertikalen oder horizontalen Reihe sein.";
    public int[] posi;
    private int[] belegt = new int [5]; // Position 
    private int[] checkb = new int [5]; // bereits getroffene Position
    protected int tcount = 0;
    boolean treffer = false;
    boolean versenkt = false;
 
    public Schiff() {
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
        return length;
    }
 
    public String getText() {
        return text1;
    }
 
    public String getText2() {
        return text2;
    }
 
    public int[] getPosi() {
        return posi;
    }
 
    public boolean treffer(int position) {
        treffer = false;
        for (int counter = 0; counter < length; counter++) {
            if (position == posi[counter]) {
                    treffer = true;
                    tcount++;
                    if (belegt[counter] == position && checkb[counter] == 1){
                        treffer = false;
                        tcount--;   
                    }
                    else{
                        belegt[counter] = position;
                        checkb[counter] = 1;
                    }
            }
        }
        return treffer;
    }
 
    public boolean versenkt() {
        if (tcount == length) {
            versenkt = true;
        }
        return versenkt;
}
}