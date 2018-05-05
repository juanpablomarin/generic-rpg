import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class StartGameButton extends JButton implements ActionListener{
		
	/**
	 * This class is a JButton for our main screen.
	 * When clicked, it uses the SoundPlayer class
	 * to play the intro sound
	 * 
	 * 
	 * [NO VISUALS DONE THIS IS PURELY FOR TESTING]
	 */
	
	private static final long serialVersionUID = 1L;
	SoundPlayer soundPlayer;

	public StartGameButton(SoundPlayer soundPlayer) {
		this.soundPlayer = soundPlayer;
		this.setText("Start game [TEST]");
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		soundPlayer.playSound("test.wav");
	}
}
