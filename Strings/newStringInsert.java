package Strings;
public class newStringInsert {
    public static String insertNewString(String oldString,String newString, int index){
        String mainString = new String();
        for(int i=0;i<oldString.length();i++){
            mainString += oldString.charAt(i);

            if(i == index){
                mainString +=newString;
            }
        }
        return mainString;
    }
    public static void main(String[] args) {
        String s = "Geeksgeeks";
        String newString = "for";
        int index = 4;
        String mainString = insertNewString(s, newString, index);
        System.out.println(mainString);
    }
}
