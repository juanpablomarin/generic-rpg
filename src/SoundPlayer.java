

/**
 * We want this class to be a simple class that can be accessed throughout the project that can allow methods
 * to play simple clip audio. An example use of this class would be
 * 
 * >>> SoundPlayer interfaceSounds = new SoundPlayer("interface");
 * >>> interfaceSounds.playInterfaceAccept();
 * 
 * This would result in playing a file called "interfaceAccept.wav", if the resource exists
 * 
 * >>> SoundPlayer interfaceSounds = new SoundPlayer("interface");
 * >>> interfaceSounds.playBurp();
 * 
 * In this case, playBurp is a "misc" sound and not an "interface" sound, so to handle this
 * we'd throw an exception indicating that this sound does not belong to this set of sounds.
 * 
 * I'm learnung how to play sounds properly in Java SE8, I've only ever done it using SE7
 * so please bear with me while I try to learn this properly.
 * @author Juan Marin
 *
 */
public class SoundPlayer {
	
	private int soundType;
	
	@Override
	public SoundPlayer() {}
	
	
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
		
		
		
	}
	
	
	
	
	
	
	

}
