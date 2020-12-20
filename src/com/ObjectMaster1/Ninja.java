package com.ObjectMaster1;

public class Ninja extends Human{
	public Ninja(String name) {
		super(name);
		this.stealth = 10;
	}
	
	public void steal(Human human) {
		human.health -= this.stealth;
		System.out.println(human.health);
		this.health += this.stealth;
		System.out.println(this.health);
	}

}
