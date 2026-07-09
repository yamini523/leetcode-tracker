// Last updated: 7/9/2026, 10:08:08 AM
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Solution ob = new Solution();
        System.out.println(ob.addDigits(n));
    }
}


class Solution{
    public int addDigits(int n){
        int ans;
        int temp=0;
        while(n>9){
            ans=0;
            while(n!=0){
                temp=n%10;
                ans=ans+temp;
                n=n/10;
            }
            n=ans;
        }
        return n;
    }
}