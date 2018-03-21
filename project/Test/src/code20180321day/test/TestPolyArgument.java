package code20180321day.test;


public class TestPolyArgument {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat cat = new Cat(); 
		Women women = new Women();
		women.feed(d);
		women.feed(cat);
	}
}

class Women{
	private String  name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void feed(Animal a){
		a.eat();
		
	}
	
}
	class Animal{
		public void eat(){
			System.out.println("≥‘");
		}
	}
	class Dog extends Animal{
		
		public void eat() {
				System.out.println("π∑≥‘π«Õ∑");
		}
	}
	
	class Cat extends Animal{
		public void eat() {
			System.out.println("√®≥‘”„");
		}
		
	}
