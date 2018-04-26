import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
/**
 * This is our lower level View aspect, this will have all the nitty gritty
 * @author juan
 *
 */
public class TitlePanel extends JPanel{
	
	BufferedImage img = null;
	
	public TitlePanel() {

		try {
			img = ImageIO.read(new File("resources/assets/backgrounds/title/chrono-trigger-wallpaper.jpg"));
		} catch (IOException e) {}
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}

}
