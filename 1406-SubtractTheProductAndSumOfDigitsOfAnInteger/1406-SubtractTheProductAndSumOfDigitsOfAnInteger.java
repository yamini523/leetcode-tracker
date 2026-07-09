// Last updated: 7/9/2026, 10:08:00 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n!=0){
            int temp=n%10;
            sum=sum+temp;
            pro=pro*temp;
            n=n/10;
        }
        int ans= pro-sum;
        return ans;
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Solution ob = new Solution();
        ob.subtractProductAndSum(n);
    }
}