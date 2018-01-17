package edu.pitt.helloanimal;

public class Bird extends Animal{
	
	public Bird(){
		
	}
	
    public Bird(String age, String color, int weight, int minimumWeight){
    	this.age = age;
    	this.color= color;
    	this.weight= weight;
    	this.minimumWeight= minimumWeight;
    }
    
    public void fly(){
    	if(this.weight <= this.minimumWeight){
    	    System.out.println("Bird cannot fly anymore!");
    	}else{
    		this.weight-=2;	
    	}
    }

}
