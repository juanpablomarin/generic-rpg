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
	
	
	
	public TitleView() {
		super("Working Title");
		
		Container c = this.getContentPane();
		
		this.setFocusable(true);
		this.setVisible(true);
	}

}
