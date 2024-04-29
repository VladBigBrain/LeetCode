package Easy.palindromenumber;

class Solution {

    public static boolean isPalindrome(int x) {

        String palidrome = String.valueOf(x);
        StringBuilder builder = new StringBuilder(palidrome);

        return palidrome.equals(builder.reverse().toString());
    }

    public static void main(String[] str) {
        
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
}
