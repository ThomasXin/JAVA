package code20180321day.test;
/**
 * 
 * @author xiegongzi
 *
 */
public class Test {
	public static void main(String[] args) {
		int []  nums= {8,4,200,1,23};
		for (int i = 0; i < nums.length-1; i++) {
			
			for (int j = 0; j < nums.length-1-i; j++) {
				
				if (nums[j]<nums[j+1]) {
					int t = nums[j];
					nums[j]=nums[j+1];
					nums[j+1] = t;
					
				}
				

			}
			for (int j = 0; j < nums.length; j++) {
				System.out.println(nums[j]);
				
			}
			
		}
	}
	
	

}
