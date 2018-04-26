
public class Player {
	
	private int attack, defense, intelligence, magicDefense, health, gender, tokens;
	private String name;
	
	public Player(int attack, int defense, int intelligence, int magicDefense, int health, int gender, String name) {
		this.attack = attack;
		this.defense = defense;
		this.intelligence = intelligence;
		this.magicDefense = magicDefense;
		this.health = health;
		
		//Gender... 1 = male, 0 = female (easier than using a char imo)
		this.gender = gender;
		
		this.name = name;
		
		//Some starting value we can modify whenever
		//Maybe add different tokens for different things eventually, who knows
		this.tokens = 100;
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
	
	public int getTokens() {
		return this.tokens;
	}
	
	
	//Setters
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

	public void updateTokens(int val) {
		this.tokens += val;
	}
	
	//Check if character is dead (game over)
	public boolean isDead() {
		if (this.health <= 0) {
			return true;
		}
		
		return false;
	}
	
}
