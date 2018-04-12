import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.table.AbstractTableModel;



public class SpielfeldTableModel extends AbstractTableModel{

	
	private Map<Integer, String> spalten;	
	
	private final List<SpielfeldZeile> spielfeldzeilen;
	
	private static final String[] COLUMN_NAMES = {"A", "B", "C", "D","E","F", "G","H","I","J"};
	private static final Class<?>[] COLUMN_CLASSES = { 
			 String.class
			, String.class
			,String.class
			,String.class
			,String.class
			,String.class
			,String.class
			,String.class
			,String.class
			,String.class};
	
	public SpielfeldTableModel(final List<SpielfeldZeile> spielfeldzeilen) {
		this.spielfeldzeilen = new ArrayList<>(spielfeldzeilen);
		this.spalten = new HashMap<>();
		this.spalten.put(0, "A");
		this.spalten.put(1, "B");
		this.spalten.put(2, "C");
		this.spalten.put(3, "D");
		this.spalten.put(4, "E");
		this.spalten.put(5, "F");
		this.spalten.put(6, "G");
		this.spalten.put(7, "H");
		this.spalten.put(8, "I");
		this.spalten.put(9, "J");
	}
	
	@Override
	public int getColumnCount() {
		
		return COLUMN_NAMES.length;
	}

	@Override
	public int getRowCount() {
		return spielfeldzeilen.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		String r = "";
//		System.out.println("arg0 = " + rowIndex);
//		System.out.println("arg1 = " + columnIndex);
		SpielfeldZeile spielfeldzeile = spielfeldzeilen.get(rowIndex);
		try {
//			System.out.println(spalten.get(columnIndex));
			r = spielfeldzeile.getValue(spalten.get(columnIndex));
			//System.out.println( spielfeldzeile.getRowContent(spalten.get(columnIndex)));
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	
	
	public void setValue(String value, int rowIndex, int columnIndex){
		SpielfeldZeile spielfeldzeile = spielfeldzeilen.get(rowIndex);
		spielfeldzeile.setValue(spalten.get(columnIndex), value);
		fireTableDataChanged();
	}
	
    @Override
    public Class<?> getColumnClass(final int columnIndex)
    {
        return COLUMN_CLASSES[columnIndex];
    }
    
    @Override
    public String getColumnName(int columnIndex){
    	return COLUMN_NAMES[columnIndex];
    }
    
    public void test1(){
    	System.out.println("test");
    }

}
