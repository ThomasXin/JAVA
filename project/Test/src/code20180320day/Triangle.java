package code20180320day;

public class Triangle {
	public static void main(String[] args) {
		Triangleson son = new Triangleson() ;
		son.printTriangle(100, '$');
		double getarea = son.getarea(10, 10);
		System.out.println(getarea);
	}


}

class Triangleson{
	
	public double getarea(int hang,int lie){
		
		return hang *lie;
		
	}
	
	public  void printTriangle(int hang, char ch){
			
			for (int i = 1; i <= hang; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(ch);
					
				}
				System.out.println();
				
			}
			
		}
}