import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;
import java.util.ArrayList;

/**This is our top level View
 * 
 * @author juan
 *
 */
public class TitleView extends JFrame{
	
	private TitlePanel titlePanel;
	
	public TitleView() {
		super("Working Title");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		
		this.titlePanel = new TitlePanel();
		
		c.add(this.titlePanel, BorderLayout.CENTER);
		
		
		this.pack();
		this.setFocusable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
