package code20180320day;
/**
 * 此类演示全局变量和局部变量的区别
 * @author Administrator
 *属性：又称为实例变量或成员变量又称为全局变量
 *作用范围：定义变量最近的大括号。
 *
 *
 *全局变量与局部变量的区别：
 *1.作用于不同：
 *全局变量：作用域是整个类体
 *局部变量：作用域所在的方法或代码块中
 *2.访问原则：
 *当全局变量和局部变量重名时，访问遵循就近原则。
 *两个局部变量在同一个范围内，不允许重名
 *3.修饰符
 *全局变量可以加修饰符
 *局部变量不可以加修饰符
 *4.变量赋值
 *全局变量可以不显示赋值直接使用
 *局部变量必须先赋值才能使用	
 *5.生命周期
 *全局变量：随着对象的创建而创建，随着对象的消亡而消亡
 *局部变量：随着方法的调用而创建，随着方法的结束而消亡
 *
 *	
 */
public class Test11 {
	public static void main(String[] args) {
		Animal animal  = new  Animal() ;
		animal.say();
	}
		
}

class Animal{
	String name = "邪公子" ;
	int age ;
	
	public void say(){
		String name = " 邪云";
		int height;
		System.out.println(name +"\t" + age);
	}
	
	public void run(){
		int i=1;
		while(i<=10){
			int j;
			i++;
		}
		System.out.println();
	}
}
