package com.ObjectMaster1;

//import com.example.demo.Human;

public class Human {
	private String name;
	public Integer strength = 3;
	public Integer stealth = 3;
	public Integer intelligence = 3;
	public Integer health = 100;
	
	public Human(String name) {
		this.name = name;
		
	}
	
	public Integer attack(){
		this.health -= strength;
		System.out.println("You got lit fool"); 
		return health;
	}
	
	public void displayHealth(){
		System.out.println("health is " + health);
	}
	
	

}
