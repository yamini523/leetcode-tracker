// Last updated: 7/9/2026, 10:08:03 AM
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution ob = new Solution();
        System.out.println(ob.firstMatchingIndex(s));
    }
}


class Solution{
    public int firstMatchingIndex(String s){
        char[] arr = s.toCharArray();
        int ind=-1;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]==arr[j]){
                ind=i;
                break;
            }
            i++;
            j--;
        }
        return ind;
    }
}