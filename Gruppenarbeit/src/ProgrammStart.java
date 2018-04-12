import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;



public class ProgrammStart {

	public static void main(String[] args) {
		


			SwingUtilities.invokeLater(new Runnable(){
				@Override
				public void run(){
					JFrame main = new MainWindow("Schiffe versenken");
//					main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//					main.setVisible(true);
				}
			});
	}

}
