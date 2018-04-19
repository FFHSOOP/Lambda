import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class CustomCellRenderer extends DefaultTableCellRenderer{

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row,
			int column) {
		Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

		this.setHorizontalAlignment(JLabel.CENTER);
		
        if(table.getValueAt(row, column).equals("x")){
            cellComponent.setBackground(Color.green);
        } 
        
        else if(table.getValueAt(row, column).equals("o")){
            cellComponent.setBackground(Color.LIGHT_GRAY);
        }
        
	   else if(table.getValueAt(row, column).equals("y")){
          cellComponent.setBackground(Color.RED);
      }
        
        else{
        	cellComponent.setBackground(Color.white);
        }
        return cellComponent;
    }

}
