package code20180320day.encapsulation;

public class Person {
	
	String name;
	private int age;
	
	 public void setAge(int a){
		 
		 if (a >120 ||  a<=0) {
			 System.out.println("���䲻�Ϸ�");
			age = 18;
		}else{
			age = a;
		}
	 }
	 public int getAge(){
		 return age;
	 }

}
