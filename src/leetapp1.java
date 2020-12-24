
public class leetapp1 {

	public static void main(String[] args) {
		int nums[]= {3,23,11,15,5,6,7};
		int target =34;
		
        finder(nums,target);
        System.out.println(reverse(321));
	}
	public static int reverse(int x) {
		int num,ans,rev=0;
		while (x!=0) {
			num=x%10;
			rev=rev*10+num;
			ans=x/10;
			
		}
		return rev;
	
	
        
    }
	public static void finder(int nums[], int target) {
		for (int i=0;i<nums.length-1;i++) {
			for (int j=nums.length-1;j>0;--j) {
				if(nums[i]+nums[j]==target) {
					System.out.println(nums[i] +" + "+nums[j]+" = "+target);
					
				}
			}
		}
		
	}
	
}
