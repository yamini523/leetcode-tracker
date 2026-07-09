// Last updated: 7/9/2026, 10:08:07 AM
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution ob= new Solution();
        ob.moveZeroes(arr);
    }
}
class Solution{
    public void moveZeroes(int[] nums){
        int i=0;
        int j=0;
        while(j<=nums.length-1){
            if(nums[j]!=0){
                int t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
                i++;
            }
            j++;
        }
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]+" ");
        }
    }
}
