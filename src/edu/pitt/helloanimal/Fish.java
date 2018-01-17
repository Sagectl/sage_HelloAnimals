package edu.pitt.helloanimal;

public class Fish extends Animal{

	public Fish(){
		
	}
	
    public Fish(String age, String color, int weight, int minimumWeight){
    	this.age = age;
    	this.color= color;
    	this.weight= weight;
    	this.minimumWeight= minimumWeight;
    }
    
    public void swim(){
    	if(this.weight <= this.minimumWeight){
    	    System.out.println("Fish cannot swim anymore!");
    	}else{
    		this.weight--;	
    	}
    	
    }
}
