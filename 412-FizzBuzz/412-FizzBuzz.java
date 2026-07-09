// Last updated: 7/9/2026, 10:08:01 AM
import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }
            else if(i%3==0){
                list.add("Fizz");
            }
            else if(i%5==0){
                list.add("Buzz");
            }
            else{
                String val=String.valueOf(i);
                list.add(val);
            }
        }
        return list;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Solution ob = new Solution();
        System.out.print(ob.fizzBuzz(n));
    }
}