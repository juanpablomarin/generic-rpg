import javax.swing.*;
import java.awt.*;
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
	private Font titleFont;
	private JLabel lblTitle;
	
	public TitlePanel() {
		
		this.setPreferredSize((new Dimension(1080, 720)));	
		
		/**
		 * This is some code I'm ripping from an old project to import custom fonts.
		 */
		
		//Create the font
		try {
			
			//Create path
			String titlePath = "resources/assets/fonts/titleFont/titleFont.ttf";
			
			//Create a file object
			File fontFile = new File(titlePath);
			
			//This creates the actual font
			titleFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(120f);
			
			//I have no idea what this line does but it does something...
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		} catch (IOException | FontFormatException e) {}
		
		
		try {
			
			String backgroundPath = "resources/assets/backgrounds/title/chrono-trigger-wallpaper.jpg";
			img = ImageIO.read(new File(backgroundPath));
		} catch (IOException e) {}
		
		
		lblTitle = new JLabel();
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setFont(titleFont);
		lblTitle.setLocation(10, 100);
		lblTitle.setText("     Generic RPG"); //This was just to help with formatting initially
		
		
		//BEST LAYOUT 2018
		/*
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.insets = new Insets(50, 0, 0, 0);
		gc.gridx = 0;
		gc.gridy = 0;
		this.add(lblTitle, gc);
		*/
		
		this.setLayout(new GridLayout(9, 9, 100, 0)); //just fucking around with layout again
		this.add(lblTitle);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}

}
