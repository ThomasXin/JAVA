package code20180321day.reviem;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 一个增删改查的小项目
 * @author xiegongzi
 *
 */
public class TestCustomer {
	public static void main(String[] args) {
		CustomerBiz biz = new CustomerBiz();
		biz.menu();
	}
}
class CustomerBiz{
	Customer[] customers = new Customer[3];
	Scanner input = new Scanner(System.in);
	
	public CustomerBiz(){
		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer("张三"+i,"00"+(i+1));

		}
	}
	
	public void menu(){
		
		boolean loop = true;
		do {
			System.out.println("-----------------------------------------");
			System.out.println("1.增 2.删 3.改 4. 查  0. 退出\n");
			System.out.println("-----------------------------------------");
			System.out.println("请选择：");
			int key = input.nextInt();
			
			switch (key) {
			case 1:
				add();
					break;
			case 2:
				delete();
					break;
			case 3:
				update();
					break;
			case 4:
				show();
					break;
			case 0:
				loop = exit();
					break;

			default:
					System.out.println("输入有误！！！！！");
					break;
			}
			
		} while (loop);
		
	}
	public void add(){
		System.out.println("-------------添加用户--------------");
		System.out.print("请输入用户姓名：" );
		String name = input.next();
		System.out.print("请输入用户编号：" );
		String customerNo = input.next();
		
		
		customers = Arrays.copyOf(customers, customers.length+1);
		customers[customers.length- 1] = new Customer(name,customerNo);
		System.out.println("添加成功");
		
	}
	
	public void delete(){
		System.out.println("------------------删除客户------------------");
		System.out.println("请输入要删除的用户编号");
		String delete = input.next();
		
		int index = -1;
		for (int i = 0; i < customers.length; i++) {
			if (delete.equals(customers[i].getNu())) {
				index = i;
				System.out.println(customers[i].getDetails());
				break;
			}
		}
		if (index == -1) {
			System.out.println("没有要删除的用户！！！");
			return;
		}
		System.out.print("确认要删除该账号吗？y/n");
		char key = input.next().charAt(0);
		if (key == 'y' || key == 'Y') {
			for (int i = index; i < customers.length - 1; i++) {
				customers[i] = customers[i+1];
			}
			customers[customers.length-1] = null;
			
			customers = Arrays.copyOf(customers, customers.length-1);
			System.out.println("删除成功！！！！");
		}else{
			return;
		}
		
		
	}
	
	public void update(){
		System.out.println("------------修改用户----------------");
		System.out.println("请输入要修改的客户编号：");
		String update = input.next();
		
		
		int index = -1;
		for (int i = 0; i < customers.length; i++) {
			if (update.equals(customers[i].getNu())) {
				index = i ;
				break;
			}
		}
		if (index== -1) {
			
			System.out.println("没有要修改的用户！！！");
			return;
			
		}
		System.out.println("请输入新客户的名称:" );
		String name = input.next();
		customers[index].setName(name);
		System.out.println("修改成功！！！！");
	}

	public void show(){
		System.out.println("打印客户信息:");
		System.out.println("--------------------------------------------");
		System.out.println("姓名\t编号");
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i].getDetails());
		}
	}
	
	public boolean exit(){
		System.out.println("确认要退出吗？y/n");
		char key = input.next().charAt(0);
		if (key  =='y' || key=='Y') {
			System.out.println("已退出！！！");
			return false;
			
		}
		return true;
	}
}




class Customer{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNu() {
		return nu;
	}
	public void setNu(String nu) {
		this.nu = nu;
	}
	private String name;
	private String nu;
	public Customer(String name, String nu) {
		this.name = name;
		this.nu = nu;
	}
	public Customer() {

	}
	public String getDetails(){
		return name +"\t"+ nu;
	}
	
}