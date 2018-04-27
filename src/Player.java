
public class Player {
	
	private Helmet helmet;
	private Armor armor;
	private Weapon weapon;
	private int attack, defense, intelligence, magicDefense, health, gender, tokens, shieldPoints;
	private String name;
	
	public Player(int attack, int defense, int intelligence, int magicDefense, int health, int gender, String name) {
		this.attack = attack;
		this.defense = defense;
		this.intelligence = intelligence;
		this.magicDefense = magicDefense;
		this.health = health;
		this.name = name;
		this.shieldPoints = 0;
		
		//We can assign these laters once we figure more stuff out
		this.weapon = null;
		this.armor = null;
		this.helmet = null;
		
		//Gender... 1 = male, 0 = female (easier than using a char imo)
		this.gender = gender;
		
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
	
	public int getShieldPoints() {
		return this.shieldPoints;
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
	
	public void updateShieldPoints(int val) {
		this.shieldPoints += val;
	}
	
	public void setWeapon(Weapon w) {
		this.weapon = w;
	}
	
	public void setArmor(Armor a) {
		this.armor = a;
	}
	
	public void setHelmet(Helmet h) {
		this.helmet = h;
	}
	
	//Check if character is dead (game over)
	public boolean isDead() {
		if (this.health <= 0) {
			return true;
		}
		
		return false;
	}
	
	public void meleeAttack(Enemy e) {
		//HOW DO YOU WANT TO STRUCTURE THIS
		//ATTACKING LOGIC
		
		if (e.isDead()) {
			//DO SOMETHING
		}
	}
	
	public void magicAttack(Enemy e) {
		//HOW DO YOU WANT TO STRUCTURE THIS
		//ATTACKING LOGIC
		
		if (e.isDead()) {
			//DO SOMETHING
		}
	}
	
}
