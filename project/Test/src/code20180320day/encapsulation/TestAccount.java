package code20180320day.encapsulation;

public class TestAccount {
		public static void main(String[] args) {
			Account account = new Account();
			
			account.setName("а��");
			System.out.println(account.getName());
			account.setBalance(11);
			System.out.println(account.getBalance());
			account.setPassword("12345");
			System.out.println(account.getPassword());
		}
}
