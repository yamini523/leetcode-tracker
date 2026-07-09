// Last updated: 7/9/2026, 10:08:05 AM

/*

class Solution{
    public int findDuplicate(int[] nums ){
        int rep=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]==nums[j]){
                    rep=nums[i];
                }
            }
        }
        return rep;
    }
}
*/


class Solution{
    public int findDuplicate(int[] nums){
        int n=nums.length;
        int rep=0;
        int[] freq=new int[n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]=freq[nums[i]]+1;
        }
        for(int i=1;i<=n;i++){
            if(freq[i]>1){
                rep=i;
            }
        }
        return rep;

    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution ob =new Solution();
        System.out.println(ob.findDuplicate(arr));
    }
}