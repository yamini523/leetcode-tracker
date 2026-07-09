// Last updated: 7/9/2026, 10:08:13 AM
import java.util.Scanner;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            // push opening brackets
            if(ch=='{' || ch=='(' || ch=='['){
                stk.push(ch);
            }

            // closing brackets
            else if(ch==')' || ch=='}' || ch==']'){
                if(stk.isEmpty()) return false; // fix 1

                char top = stk.pop(); // fix 2: pop instead of peek

                // fix 3: your condition had a typo
                if(top=='(' && ch==')' ||
                   top=='[' && ch==']' ||
                   top=='{' && ch=='}'){
                    // continue checking next chars (don't return true here!)
                }
                else{
                    return false;
                }
            }
        }
        
        // fix 4: must check if stack empty
        return stk.isEmpty();
    }
}

public class Parenthesis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution sol = new Solution();
        System.out.println(sol.isValid(s)); // fix 5: print result
    }
}
