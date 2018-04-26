
public class Weapon {
	
	private int damage;
	private String name;
	
	public Weapon(int damage, String name) {
		this.damage = damage;
		this.name = name;
	}
	
	public int getDamage() {
		return this.damage;
	}
	
	public void upgrade(int val) {
		this.damage += val;
	}
}
