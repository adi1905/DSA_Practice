package Strings;
public class palindromeChecker {
    public static boolean isPalindromeString(String str){
        int i=0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "Malayalam";
        s = s.toLowerCase();
        boolean isPalindrome = isPalindromeString(s);
        System.out.println(isPalindrome);
    }
}
