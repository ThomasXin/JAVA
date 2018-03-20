package code20180320day.encapsulation;

public class Account {
	private String name;
	private double balance;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
//	
//	public void setName(String a){
//		name = a;
//	}
//	
//	public String getName(){
//		return name;
//	}
//	public void setBalance(double b){
//		if (b < 20) {
//			System.out.println("余额不足请充值");
//		}else{
//			balance = b;
//		}
//	}
//	public double getBalance(){
//		return balance;
//	}
//	public void setPassword(String pwd){
//		if (pwd.length() != 4) {
//			System.out.println("密码只能是四位");
//			password = "1234";
//		}else {
//			password = pwd;
//		}
//	}
//	
//	public String getPassword(){
//		return password;
//	}

}
