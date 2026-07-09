// Last updated: 7/9/2026, 10:08:12 AM
import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String ans = arr[arr.length-1];
        int len = ans.length();
        return len;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution ob = new Solution();
        System.out.println(ob.lengthOfLastWord(s));
    }
}