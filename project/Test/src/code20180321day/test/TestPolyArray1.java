package code20180321day.test;
/**
 * 此程序是冒泡排序
 * @author xiegongzi
 *
 */
public class TestPolyArray1 {
		public static void main(String[] args) {
			Person[] pers =  new Person[5];
			
			pers[0] = new Person("张飞",30);
			pers[1] = new Student("悟空", 520, 90);
			pers[2] = new Student("八戒", 521, 59);
			pers[3] = new Teacher("唐僧", 30, 10000);
			pers[4] = new Teacher("白骨精", 18, 2000);
			
			
			for (int i = 0; i < pers.length; i++) {
				System.out.println(pers[i].say());
			}
			
			for (int i = 0; i < pers.length-1; i++) {//轮数
				for (int j = 0; j < pers.length-1-i; j++) {//次数
					if (pers[j].getAge()>pers[j+1].getAge()) {
						//从小到大排序
						Person tenm = pers[j+1];
						pers[j+1]= pers[j];
						pers[j] = tenm;  
						
					}
					
				}
				
				
			}
			for (int i = 0; i < pers.length; i++) {
				System.out.println(pers[i].say());
			}
					
			
		}
}
class Person{
	private  String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String say(){
		return name + "\t" + age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	} 
	
}


class Student extends Person{
	
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	public String say(){
		return  super.say() +"\t"+ score;
	}
	
}

class Teacher extends Person{
	
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Teacher(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	public  String  say(){
		return super.say() + "\t" + salary;
	}
	
}




