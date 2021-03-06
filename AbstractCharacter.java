package RPG;

public abstract class AbstractCharacter implements Character {
	
	private String name;
	private int hp;
	private int maxHp;
	private int level;
	private Weapon weapon;

	public AbstractCharacter(String name, int hp, int maxHp, int level, Weapon weapon) {
		this.name = name;
		this.maxHp = maxHp;
		this.hp = hp;
		this.level = level;
		this.weapon = weapon;	
	}
	
	public String name() {
		return name;
	}
	
	public int hp() {
		return hp;
		
	}
	
	public int level() {
		return level;
		
	}
	
	public boolean isDead() {
		return (hp <= 0);
		
	}
	
	public Weapon weapon() {
		return weapon;
		
	}
	
	public boolean equals(Object obj) {
		boolean equal = false;
		if (obj instanceof Character) {
			Character casted = (Character)obj;
			equal = name.equals(casted.name());
		}
		return equal;
	}
	
	public void changeWeapon(Weapon newWeapon) {
		weapon = newWeapon;
	}
	
	public void takeDamage(int damage) {
		if(damage >= hp) {
			hp = 0;
		}
		else {
			hp = hp - damage;
		}
		
	}
	
	// contract here
	public void gainHp(int hp) {
		hp = Math.abs(hp);
		if (this.hp + hp <= maxHp) {
			this.hp = this.hp + hp;
		}
		else {
			this.hp = maxHp;
		}
	}
	
	public abstract void attack(Character q);
}
