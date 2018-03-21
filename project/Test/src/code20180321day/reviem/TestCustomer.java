package code20180321day.reviem;
import java.util.Arrays;
import java.util.Scanner;
/**
 * һ����ɾ�Ĳ��С��Ŀ
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
			customers[i] = new Customer("����"+i,"00"+(i+1));

		}
	}
	
	public void menu(){
		
		boolean loop = true;
		do {
			System.out.println("-----------------------------------------");
			System.out.println("1.�� 2.ɾ 3.�� 4. ��  0. �˳�\n");
			System.out.println("-----------------------------------------");
			System.out.println("��ѡ��");
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
					System.out.println("�������󣡣�������");
					break;
			}
			
		} while (loop);
		
	}
	public void add(){
		System.out.println("-------------����û�--------------");
		System.out.print("�������û�������" );
		String name = input.next();
		System.out.print("�������û���ţ�" );
		String customerNo = input.next();
		
		
		customers = Arrays.copyOf(customers, customers.length+1);
		customers[customers.length- 1] = new Customer(name,customerNo);
		System.out.println("��ӳɹ�");
		
	}
	
	public void delete(){
		System.out.println("------------------ɾ���ͻ�------------------");
		System.out.println("������Ҫɾ�����û����");
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
			System.out.println("û��Ҫɾ�����û�������");
			return;
		}
		System.out.print("ȷ��Ҫɾ�����˺���y/n");
		char key = input.next().charAt(0);
		if (key == 'y' || key == 'Y') {
			for (int i = index; i < customers.length - 1; i++) {
				customers[i] = customers[i+1];
			}
			customers[customers.length-1] = null;
			
			customers = Arrays.copyOf(customers, customers.length-1);
			System.out.println("ɾ���ɹ���������");
		}else{
			return;
		}
		
		
	}
	
	public void update(){
		System.out.println("------------�޸��û�----------------");
		System.out.println("������Ҫ�޸ĵĿͻ���ţ�");
		String update = input.next();
		
		
		int index = -1;
		for (int i = 0; i < customers.length; i++) {
			if (update.equals(customers[i].getNu())) {
				index = i ;
				break;
			}
		}
		if (index== -1) {
			
			System.out.println("û��Ҫ�޸ĵ��û�������");
			return;
			
		}
		System.out.println("�������¿ͻ�������:" );
		String name = input.next();
		customers[index].setName(name);
		System.out.println("�޸ĳɹ���������");
	}

	public void show(){
		System.out.println("��ӡ�ͻ���Ϣ:");
		System.out.println("--------------------------------------------");
		System.out.println("����\t���");
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i].getDetails());
		}
	}
	
	public boolean exit(){
		System.out.println("ȷ��Ҫ�˳���y/n");
		char key = input.next().charAt(0);
		if (key  =='y' || key=='Y') {
			System.out.println("���˳�������");
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