import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SpielfeldZeile {
	Map<Integer, String> spalten = new HashMap<>();
	

	public SpielfeldZeile(){
		for (int i = 0; i< 10; i++){
			spalten.put(i,  "");
		}

	}
		
	public SpielfeldZeile(
			String spalte0
			,String spalte1
			,String spalte2
			,String spalte3
			,String spalte4
			,String spalte5
			,String spalte6
			,String spalte7
			,String spalte8
			,String spalte9
			
			){
		spalten.put(0, spalte0);
		spalten.put(1, spalte1);
		spalten.put(2, spalte2);
		spalten.put(3, spalte3);
		spalten.put(4, spalte4);
		spalten.put(5, spalte5);
		spalten.put(6, spalte6);
		spalten.put(7, spalte7);
		spalten.put(8, spalte8);
		spalten.put(9, spalte9);
		
	}
	
	public String getValue(int x){
		return spalten.get(x);
	}
	
	public void setValue(int spalte, String value){
			spalten.put(spalte, value);
		}

	

}
