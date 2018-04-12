import javax.swing.AbstractListModel;

public class SpielfeldListModel extends AbstractListModel{

	String headers[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	
	@Override
	public Object getElementAt(int index) {
		// TODO Auto-generated method stub
		return headers[index];
	}

	@Override
	public int getSize() {
		return headers.length;
	}

}
