package Strings;

public class add_string {
    public static String add_string_using_substring(String str1,String newString,int pos){
        return str1.substring(0,pos) + newString + str1.substring(pos);
    }
    public static void main(String[] args) {
        String str1 = "Adya";
        int pos = 2;
        String newString = "it";
        System.out.println(add_string_using_substring(str1, newString, pos));
    }
}
