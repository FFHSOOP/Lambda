import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

public class MainWindow extends JFrame{
	
	
	
	public MainWindow(String titel){
		super(titel);
		final JFrame frame = new JFrame(titel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		final List<SpielfeldZeile> spielfeldzeilen = DatenDefinition.spielfeldzeilen;
		final SpielfeldTableModel tableModel = new SpielfeldTableModel(spielfeldzeilen);
		
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(JLabel.CENTER);
		
		final JTable table = new JTable(tableModel);
		table.setRowHeight(20);
		table.setDefaultRenderer(Object.class, dtcr);


		
		table.setCellSelectionEnabled(true);
		ListSelectionModel cellSelectionModel = table.getSelectionModel();
		cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				if (e.getClickCount() == 1){
					int s = table.getSelectedColumn();
					int z = table.getSelectedRow();
					System.out.println("Geklickte Spalte: " + s);
					System.out.println("Geklickte Zeile: " + z);
					System.out.println("Wert in der Zelle: " + table.getValueAt(z, s));
				}
			}
		});
		
		SpielfeldListModel spielfeldListModel = new SpielfeldListModel();
		JList rowHeader = new JList(spielfeldListModel);
		rowHeader.setCellRenderer(new RowHeaderRenderer(table));
		rowHeader.setFixedCellWidth(50);
		rowHeader.setFixedCellHeight(table.getRowHeight());
    //            + table.getRowMargin());

		
		
		
	/*	cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int s = table.getSelectedColumn();
				int z = table.getSelectedRow();
				System.out.println("Geklickte Spalte: " + s);
				System.out.println("Geklickte Zeile: " + z);
				System.out.println("Wert in der Zelle: " + table.getValueAt(z, s));
						
				
			}
		});*/
		
		final JButton button = new JButton("Wert y bei Zeile 3, Spalte C setzen");
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setRowHeaderView(rowHeader);
		frame.add(scroll, BorderLayout.CENTER);
//		frame.add(new JScrollPane(table), BorderLayout.CENTER);
		frame.add((button),BorderLayout.SOUTH);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					tableModel.setValue("y", 3, 3);
					System.out.println("Der Wert bei Zeile 3, Spalte C ist: " + tableModel.getValueAt(3, 3));
				} catch (IllegalArgumentException | SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		
		
			

		
	}
	
	
	
	
	

}
