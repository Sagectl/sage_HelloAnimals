package edu.pitt.helloanimal;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Fish fish = new Fish("7","red",10,3);
		Mammal mammal = new Mammal("23","gray",500,90);
		Bird bird = new Bird("2","yellow",6,1);

		Fish fish1 = new Fish("7","red",12,3);
		Mammal mammal1 = new Mammal("23","gray",400,90);
		Bird bird1 = new Bird("2","yellow",8,1);
		
		ArrayList<Animal> object = new ArrayList<Animal>();
		
		object.add(fish);
		object.add(mammal);
		object.add(bird);
		object.add(fish1);
		object.add(mammal1);
		object.add(bird1);		
		
		
		int rounds = 5 ;
		
	    for(int i = 0 ; i < object.size(); i++){
	    	object.get(i).eat();
	    	//Animal o;
	    	if(object.get(i) instanceof Fish)  {
	    		System.out.println("Fish "+i+" Eat!");
	    		
	    		Fish o = (Fish) object.get(i);
	    		
	    		for(int j = 0; j< rounds; j++){
	    			System.out.println("Fish "+i+" Swim x "+j);
	    		    o.swim();
	    		}
	    		System.out.print("The final weight of Fish "+i+" = ");
	    	}
	    	
	    	if(object.get(i) instanceof Mammal)  {
	    		System.out.println("Mammal "+i+" Eat!");
	    		Mammal o = (Mammal) object.get(i);
	    		for(int j = 0; j<rounds; j++){
	    			System.out.println("Mammal "+i+" Run x "+j);
	    		    o.run();
	    		}
	    		System.out.print("The final weight of Mammel "+i+" = ");
	    	}
	    	
	    	if(object.get(i) instanceof Bird)  {
	    		System.out.println("Bird "+i+" Eat!");
	    		Bird o = (Bird) object.get(i);
	    		
	    		for(int j = 0; j<rounds; j++){
	    			System.out.println("Bird "+i+" Fly x " +j);
	    		    o.fly();
	    		}
	    		System.out.print("The final weight of Bird "+i+" = ");
	    	}
	    	//if(object.get(i) instanceof Mammal) object.get(i).run();
	    	//if(object.get(i) instanceof Bird) object.get(i).fly();
	    	
	    	
	    	
	    	object.get(i).output();
	    	System.out.println();
	    }
		
		
		
	}

}
