import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainWindow extends JFrame{
	
	
	
	public MainWindow(String titel){
		super(titel);
		final JFrame frame = new JFrame(titel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//Enth�lt Label und Spielfelder
		final JPanel panelSpielfelder = new JPanel();
		panelSpielfelder.setLayout(new BoxLayout(panelSpielfelder, BoxLayout.X_AXIS));
		//panelSpielfelder.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		final JPanel buttonPanel = new JPanel(new GridLayout(12,0));
		
		
		final JPanel panelSpielfeld = new JPanel();
		panelSpielfeld.setLayout(new BoxLayout(panelSpielfeld, BoxLayout.Y_AXIS));
		panelSpielfeld.setBorder(new EmptyBorder(10, 10, 10, 10));

		
		final JPanel panelSpielfeldG = new JPanel();
		panelSpielfeldG.setLayout(new BoxLayout(panelSpielfeldG, BoxLayout.Y_AXIS));
		panelSpielfeldG.setBorder(new EmptyBorder(10, 10, 10, 10));

		
		final JLabel labelSpielfeld = new JLabel("Eigenes Spielfeld", SwingConstants.LEFT);
		labelSpielfeld.setBorder(new EmptyBorder(10, 10, 10, 10));
		final JLabel labelSpielfeldG = new JLabel("Gegnerisches Spielfel");
		labelSpielfeldG.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		final JTextArea labelMessageBoard = new JTextArea("Hier steht eine Anweisung oder Information f�r den Spieler, Hier steht eine Anweisung oder Information f�r den Spieler");
		labelMessageBoard.setWrapStyleWord(true);
		labelMessageBoard.setLineWrap(true);
		labelMessageBoard.setEditable(false);
		labelMessageBoard.setPreferredSize(new Dimension(80, 80));
		labelMessageBoard.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		final List<SpielfeldZeile> spielfeldZeilen = DatenDefinition.spielfeldzeilen;
		final SpielfeldTableModel tableModel = new SpielfeldTableModel(spielfeldZeilen);
		
		final List<SpielfeldZeile> spielfeldZeilenG = DatenDefinition.gegnerspielfeldzeilen;
		final SpielfeldTableModel tableModelG = new SpielfeldTableModel(spielfeldZeilenG);
		
		final JTable table = new JTable(tableModel);
		table.setRowHeight(25);
		table.setDefaultRenderer(Object.class,  new CustomCellRenderer());
		
		final JTable tableG = new JTable(tableModelG);
		tableG.setRowHeight(25);
		tableG.setDefaultRenderer(Object.class,  new CustomCellRenderer());

		
		table.setCellSelectionEnabled(true);
		ListSelectionModel cellSelectionModel = table.getSelectionModel();
		cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		tableG.setCellSelectionEnabled(true);
		ListSelectionModel cellSelectionModelG = tableG.getSelectionModel();
		cellSelectionModelG.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
		
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
		
		tableG.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				if (e.getClickCount() == 1){
					int s = tableG.getSelectedColumn();
					int z = tableG.getSelectedRow();
					System.out.println("Geklickte Spalte: " + s);
					System.out.println("Geklickte Zeile: " + z);
					tableModelG.setValue("x", tableG.getSelectedRow(), tableG.getSelectedColumn());
					System.out.println("Wert in der Zelle: " + tableG.getValueAt(z, s));
				}
			}
		});
		
		SpielfeldListModel spielfeldListModel = new SpielfeldListModel();
		JList rowHeader = new JList(spielfeldListModel);
		rowHeader.setCellRenderer(new RowHeaderRenderer(table));
		rowHeader.setFixedCellWidth(50);
		rowHeader.setFixedCellHeight(table.getRowHeight());
    //            + table.getRowMargin());
		
		SpielfeldListModel spielfeldListModelG = new SpielfeldListModel();
		JList rowHeaderG = new JList(spielfeldListModelG);
		rowHeaderG.setCellRenderer(new RowHeaderRenderer(tableG));
		rowHeaderG.setFixedCellWidth(50);
		rowHeaderG.setFixedCellHeight(tableG.getRowHeight());
    //            + table.getRowMargin());

		
				

		
		final JButton button = new JButton("Wert y bei Zeile 3, Spalte C setzen");
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setRowHeaderView(rowHeader);
		
		JScrollPane scrollG = new JScrollPane(tableG);
		scrollG.setRowHeaderView(rowHeaderG);
		
		panelSpielfeld.add(labelSpielfeld);
		panelSpielfeld.add(scroll);
		panelSpielfeldG.add(labelSpielfeldG);
		panelSpielfeldG.add(scrollG);
		//panelSpielfelder.add(labelMessageBoard);
		
		panelSpielfelder.add(panelSpielfeld);
		panelSpielfelder.add(panelSpielfeldG);
		
		buttonPanel.add(button);
		buttonPanel.add(new JButton("Test"));
		
		frame.add(panelSpielfelder,BorderLayout.CENTER);
		frame.add(buttonPanel, BorderLayout.WEST);
		frame.add(labelMessageBoard, BorderLayout.SOUTH);
		frame.setSize(1000, 451);
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
