import java.io.File;
import java.io.IOException;

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
				//Build the battle sound library for use
			case 1:
				//Build the interface sound library for use
				buildInterfaceLibrary();
			case 2:
			case 3:
			case 4:
			case 5:
			default:
				System.out.println("SoundPlayer: Unable to build sound files.");
				built = false;
				
		}
		
		
	}

	private void buildInterfaceLibrary() {
		

		
	}
	
	
}
	
