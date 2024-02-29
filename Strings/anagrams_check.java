package Strings;
import java.util.Arrays;

public class anagrams_check {
    public static boolean check_anagrams_base(String str1, String str2){
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();

        int n = charStr1.length;
        int m = charStr2.length;
        if(n != m){
            return false;
        }
        Arrays.sort(charStr1);
        Arrays.sort(charStr2);

        for(int i=0;i<charStr1.length;i++){
            if(charStr1[i]!=charStr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "integral";
        String str2 = "taiangle";
        boolean check_ana = check_anagrams_base(str1, str2);
        System.out.println(check_ana);
    }
}

// base anagram checker complexities
// time complexity : O(nlogn + mlogm)
// space complexity : O(n+m)



// 