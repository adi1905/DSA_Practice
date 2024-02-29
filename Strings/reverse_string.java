package Strings;
public class reverse_string {
    public static String string_reverse(String str1){
        String reversed = new String();
        for(int i=str1.length()-1;i>=0;i--){
            reversed += str1.charAt(i);
        }
        return reversed;
    }

    public static StringBuilder string_reverse_stringbuilder(String str1){
        StringBuilder reversed = new StringBuilder();
        reversed.append(str1);
        reversed.reverse();
        return reversed;
    }
    public static void main(String[] args) {
        String str1 = "Aditya";
        System.out.println(string_reverse(str1));
        System.out.println(string_reverse_stringbuilder(str1));
    }
}
