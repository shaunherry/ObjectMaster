package com.ObjectMaster1;

public class HumanTest {
	public static void main(String[] args) {
		
		Human h = new Human("shaun");
		Wizard w = new Wizard("dylan");
		Ninja n = new Ninja("Rob");
		Samurai s = new Samurai("Bridget");
		Samurai k = new Samurai("yew");
		
//		System.out.println(h.displayHealth());
//		
		h.displayHealth();
		w.heal(h);
		w.fireball(w);
		n.steal(h);
		s.deathBlow(h);
		h.attack();
		s.howMany();
		s.meditate(w);
		
		
//		
//		System.out.println(h.strength);
//		System.out.println(h.intelligence);
//		System.out.println("Health Stat " + h.health);
//		
//		System.out.println("This is your Health "+ h.attack());
//		
//		


	}

}
