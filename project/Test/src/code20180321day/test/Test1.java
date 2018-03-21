package code20180321day.test;

public class Test1 {
		public static void main(String[] args) {
			Son f = new Son();
//			f.test();
			System.out.println(f.name);
		}
}

class Father{ 
	
	String name = "Father";
	
	public void test(){
		System.out.println(name + "---father¿‡");
	}
}
class Son extends Father{
	String name = "Son";
	public void test(){
		System.out.println(name + "---son¿‡");
	}
} 