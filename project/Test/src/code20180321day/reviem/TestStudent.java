package code20180321day.reviem;



public class TestStudent {
	public static void main(String[] args) {
		
		Student stus[] = new Student[100];
		
		for (int i = 0; i < stus.length; i++) {
			int	age =(int)(Math.random()*3+16); 
			int height =(int)(Math.random()*5+175);
			int weight =(int)(Math.random()*10+60);
//			System.out.println(age);
//					Student student = new Student();
					stus[i] = new Student("Ð°ÔÆ",age,height,weight);
					if (stus[i].getAge() == 17 ) {
						stus[i].say();
					}
					
		}
		
	}

	
	
	
	
}
class  Student{
	private String name;
	private int  age;
	private int height;
	private int weight;
	
	
	public void say(){
		System.out.println(name+"\t" +age+"\t"+height+"\t"+weight);
	}
	
	
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Student(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public Student() {
		super();
	}
	

}