

/**
 * For the sake of this title screen, we'll implement a view+controller aspect
 * This is our high top level.
 * @author juan
 *
 */
public class TitleScreen {

	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new TitleScreen();
			}
			
		});
	}
	
	TitlePanel titlePanel;
	
	public TitleScreen() {
	
	}

}
