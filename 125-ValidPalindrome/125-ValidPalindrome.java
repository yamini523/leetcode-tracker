// Last updated: 7/9/2026, 10:08:10 AM
import java.util.*;

class Solution{
    public boolean isPalindrome(String s){
        String s1= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] arr= s1.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        Solution ob = new Solution();
        System.out.println(ob.isPalindrome(s));
    }
}