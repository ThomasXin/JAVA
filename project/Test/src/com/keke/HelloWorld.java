package com.keke;


public class HelloWorld {
	public static void main(String[] args) {
		Test t = new Test();
		
		t.say();
	}

	
}
class Test{
	
	String name = "Ãð¾ø";
	int age = 18;
	
	public void say(){
		System.out.println(name +"\t" + age);
	}
}
	
