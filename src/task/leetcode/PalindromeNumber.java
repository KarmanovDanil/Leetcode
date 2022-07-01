package task.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x) {

//        if (x < 0) {
//            return false;
//        }
//
//        if (x % 10 == 0 && x != 0) {
//            return false;
//        }
//
//        int invertedNumber = 0;
//        int copyOfX = x;
//
//        while (copyOfX != 0) {
//            invertedNumber = invertedNumber * 10 + copyOfX % 10;
//            copyOfX = copyOfX / 10;
//        }
//        return invertedNumber == x;

        //Решение с помощью StringBuilder и функции reverse()

        if (x < 0) return false;
        String s = x + "";
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}
