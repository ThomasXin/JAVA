package com.keke;

public class Test1 {
	public static void main(String[] args) {
		Td t = new Td(); 
		t.say();
	}

}

class Td{
	String name = "Ð°¹«×Ó";
	int age = 25;
	
	public void say(){
		System.out.println(name + "\t" + age);
	}
	
}