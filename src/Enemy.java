
public class Enemy {
	
	private int attack, defense, intelligence, magicDefense, health;
	private String name;
	
	public Enemy(int attack, int defense, int intelligence, int magicDefense, int health, String name) {
		this.attack = attack;
		this.defense = defense;
		this.intelligence = intelligence;
		this.magicDefense = magicDefense;
		this.health = health;
		this.name = name;
	}
	
	//Getters
	public int getAttack() {
		return this.attack;
	}
	
	public int getDefense() {
		return this.defense;
	}
	
	public int getIntelligence() {
		return this.intelligence;
	}
	
	public int getMagicDefense() {
		return this.magicDefense;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	//Setters
	//0nly reason we have setters is so that
	//if an enemy can regen health or have some
	//special ability where it boosts a certain stats
	//or if the player can decrease enemy stats for a
	//limited time
	public void updateAttack(int val) {
		this.attack += val;
	}
	
	public void updateDefense(int val) {
		this.defense += val;
	}
	
	public void updateIntelligence(int val) {
		this.intelligence += val;
	}
	
	public void updateMagicDefense(int val) {
		this.magicDefense += val;
	}
	
	public void updateHealth(int val) {
		this.health += val;
	}

	//Check if enemy is dead (game over)
	public boolean isDead() {
		if (this.health <= 0) {
			return true;
		}
		
		return false;
	}

}
