package task.leetcode;

public class PalindromeWord {
    public static void main(String[] args) {
        System.out.println(isPalindrome("шабаш"));
        System.out.println(isPalindrome("довод"));
        System.out.println(isPalindrome("уха"));
    }

    public static boolean isPalindrome(String x) {
        StringBuilder sb = new StringBuilder(x);
        return sb.reverse().toString().equals(x);
    }
}
