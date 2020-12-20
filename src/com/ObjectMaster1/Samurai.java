package com.ObjectMaster1;

public class Samurai extends Human{
	static Integer totalSamurai = 0;
	public Samurai(String name) {
		super(name);
		this.health = 200;
		this.totalSamurai += 1; 
	}
	
	public void deathBlow(Human human) {
		human.health = 0;
		System.out.println("Samurai deathblow");
		this.health = this.health/2;
		System.out.println(this.health);
	}
	
	public void meditate(Human human) {
		this.health -= this.health + (this.health/2);
		System.out.println("Samurai is meditating, and health is now " + this.health);
	}
	
	public void howMany() {
		 System.out.println("Total Samurai is " + totalSamurai);
	}
}
