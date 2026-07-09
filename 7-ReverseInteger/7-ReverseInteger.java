// Last updated: 7/9/2026, 10:08:15 AM
class Solution {

    public int reverse(int x) {

        int result = 0;


        while (x != 0) {

            int digit = x % 10;
            x = x / 10;


            // Overflow check
            if (result > Integer.MAX_VALUE / 10 ||
                (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }


            if (result < Integer.MIN_VALUE / 10 ||
                (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }


            result = result * 10 + digit;
        }


        return result;
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Solution ob = new Solution();
        System.out.println(ob.reverse(n));
    }
}