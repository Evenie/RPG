package RPG;

public interface Character {

	/* Returns this character's name
	 * Postconditions: /First/ =~ this.name()
	 */
	public String name();
	
	/* Returns an integer representing the health of this character
	 * Postconditions: this.hp() >= 0
	 */
	public int hp();
	
	/* Returns the level of this Character
	 * Postconditions: this.level() >= 0
	 */
	public int level();
	
	/* Returns true if this character has died
	 * Postconditions: returns true iff this.hp() == 0
	 */
	public boolean isDead();
	
	public Weapon weapon();
	
	public boolean equals(Object o);
	
	/*
	 * Reduces this PlayerCharacter's hp by the given damage
	 * Preconditions: damage >= 0
	 * Postconditions: this.hp() == this.hp() - damage 
	 *          	   || if(damage >= this.hp()), this.hp() == 0
	 */
	public void takeDamage(int damage);
	
	// contract here
	public void gainHp(int hp);
	
	/* This character causes q to take damage
	 * Precondition: 
	 * Postconditions: 
	 */
	public void attack(Character q);
	

}