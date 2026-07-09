// Last updated: 7/9/2026, 10:08:04 AM

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k=sc.nextInt();
        Solution ob = new Solution();
        System.out.println(ob.reversePrefix(s,k));
    }
}

class Solution{
    public String reversePrefix(String s,int k){
        String s1=s.substring(0,k);
        String s2=s.substring(k);
        String rev="";
        for(int i=k-1;i>=0;i--){
            rev=rev+s1.charAt(i);
        }
        String ans =rev+s2;
        return ans;
    }
}