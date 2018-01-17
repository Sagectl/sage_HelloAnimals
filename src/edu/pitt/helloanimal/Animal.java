package edu.pitt.helloanimal;

public class Animal {

		protected String age;
		protected String color;
		protected String type;
		protected int weight;
		protected int minimumWeight;
		
		public Animal(){
			
		}
		
		public Animal(String age, String color, String type, int weight, int minimumWeight){
			this.age= age;
			this.color= color;
			this.type= type;
			this.weight= weight;
			this.minimumWeight= minimumWeight;
		}
		
		public void eat(){
			this.weight++;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}
		
		public void output(){
			System.out.println(getWeight());
		}
		

	}


