package Strings;
public class even_length_words {

    public static void getEvenWords(String s){
        String words[] = s.split(" "); 
        for(String word: words){
            if((word.length() %2) == 0){
                System.out.println(word);
            }
        }
    }
    public static void main(String[] args) {
        String s = "I am not Aditya";
        getEvenWords(s);
    }
}
