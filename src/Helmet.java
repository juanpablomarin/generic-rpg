
public class Helmet {
	
	private int strength;
	private String name;
	
	public Helmet(int strength, String name) {
		this.strength = strength;
		this.name = name;
	}
	
	public int getStrength() {
		return this.strength;
	}
	
	public void upgrade(int val) {
		this.strength += val;
	}
}
