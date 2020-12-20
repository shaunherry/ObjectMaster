package com.ObjectMaster1;

public class Wizard extends Human {
	public Wizard(String name) {
		super(name);
		this.intelligence = 8;
		this.health = 50;
		
	}
	
	public void heal(Human human) {
		human.health += this.intelligence;
		System.out.println(human.health);
		
	}
	
	public void fireball(Human human) {
		human.health -= this.intelligence;
		System.out.println(human.health);
	}
	
	
	
	

}
