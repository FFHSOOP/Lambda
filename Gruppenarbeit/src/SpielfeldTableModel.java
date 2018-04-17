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
			 int.class
			, int.class
			, int.class
			, int.class
			, int.class
			, int.class
			, int.class
			, int.class
			, int.class
			, int.class};
	
	public SpielfeldTableModel(final List<SpielfeldZeile> spielfeldzeilen) {
		this.spielfeldzeilen = new ArrayList<>(spielfeldzeilen);
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
			r = spielfeldzeile.getValue(columnIndex);
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
		spielfeldzeile.setValue(columnIndex, value);
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
