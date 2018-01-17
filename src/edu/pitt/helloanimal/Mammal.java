package edu.pitt.helloanimal;

public class Mammal extends Animal{


	public Mammal(){
		
	}
	
    public Mammal(String age, String color, int weight, int minimumWeight){
    	this.age = age;
    	this.color= color;
    	this.weight= weight;
    	this.minimumWeight= minimumWeight;
    }
    
    public void run(){
    	if(this.weight <= this.minimumWeight){
    	    System.out.println("Mammal cannot run anymore!");
    	}else{
    		this.weight--;	
    	}
    }
}

