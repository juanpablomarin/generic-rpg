    import java.io.File;
    import java.io.IOException;
    import java.net.MalformedURLException;
    import javax.sound.sampled.AudioInputStream;
    import javax.sound.sampled.AudioSystem;
    import javax.sound.sampled.Clip;
    import javax.sound.sampled.LineUnavailableException;
    import javax.sound.sampled.UnsupportedAudioFileException;
/**
 * We want this class to be a simple class that can be accessed throughout the project that can allow methods
 * to play simple clip audio. An example use of this class would be
 * 
 * >>> SoundPlayer interfaceSounds = new SoundPlayer(1);
 * >>> interfaceSounds.playInterfaceAccept();
 * 
 * This would result in playing a file called "interfaceAccept.wav", if the resource exists
 * 
 * >>> SoundPlayer interfaceSounds = new SoundPlayer(1);
 * >>> interfaceSounds.playBurp();
 * 
 * In this case, playBurp is a "misc" sound and not an "interface" sound, so to handle this
 * we'd throw an exception indicating that this sound does not belong to this set of sounds.
 * 
 * I'm learning how to play sounds properly in Java SE8, I've only ever done it using SE7
 * so please bear with me while I try to learn this properly.
 * 
 * I decided to use one class just to keep everything self contained, it would make more sense to use
 * parent -> child system but for practical purposes, keeping it self contained let's us one and done
 * this sound system.
 * 
 * 
 * @author Juan Marin
 *
 */
public class SoundPlayer {
	
	private int soundType;
	private boolean built;
	
	private static final String INIT_PATH="resources/sounds/";
	
	private static final String BATTLE_PATH= INIT_PATH+"battle/";
	
	private static final String INTERFACE_PATH= INIT_PATH+"interface/";
	
	private static final String INVENTORY_PATH= INIT_PATH+"inventory/";
	
	private static final String MISC_PATH= INIT_PATH+"misc/";
	
	private static final String NPC_PATH= INIT_PATH+"NPC/";
	
	private static final String WORLD_PATH= INIT_PATH+"world/";
	
	
	private String folder = null;
	/**
	 * We always want the user to provide an integer specifying which library
	 * they're creating a sound from.
	 * 
	 * 0=battle, 1=interface, 2=inventory, 3=misc, 4=NPC, 5=world
	 * 
	 * @param int lib: the library from which they wish to access files.
	 */
	public SoundPlayer(int lib) {
		
		if (lib < 0 || lib > 5) {
			System.out.println("SoundPlayer: Invalid library");
		}
		
		built = false;
		/**
		 * We only want one SoundPlayer library to exist for each object.
		 * i.e We don't want a battle sound player to also play inventory sounds.
		 */
		switch (lib) {
			case 0:
				folder = BATTLE_PATH;
				break;
			case 1:
				folder = INTERFACE_PATH;
				break;
			case 2:
				folder = INVENTORY_PATH;
				break;
			case 3:
				folder = MISC_PATH;
				break;
			case 4:
				folder = NPC_PATH;
				break;
			case 5:
				folder = WORLD_PATH;
				break;
			default:
				System.out.println("SoundPlayer: Unable to assign folder.");
				
		}
		
		
	}

	
	public void playSound(String fileName) {
		try {
	         // Open an audio input stream.           
	          File soundFile = new File(folder+fileName); //you could also get the sound file with an URL
	          AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);              
	         // Get a sound clip resource.
	         Clip clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.start();
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
	}
	
	
}
	
