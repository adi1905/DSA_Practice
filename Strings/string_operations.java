package Strings;
public class string_operations {
    public static void main(String[] args) {
        String s = "aditya";
        String s1 = " My name is aditya  hello ";
        System.out.println(s.length());
        System.out.println(s.charAt(4));
        System.out.println(s.substring(2));
        System.out.println(s.substring(3,5));
        System.out.println(s.concat(" Hello"));
        System.out.println(s.indexOf("k"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.equalsIgnoreCase("aditya"));
        System.out.println(s.compareToIgnoreCase("aditya"));
        System.out.println(s1.trim());
        System.out.println(s.replace('a', 'y'));
        System.out.println(s1.contains(s));
        char[] c = s.toCharArray();
        for(char ch : c){
            System.out.println(ch);
        }
    }
}
