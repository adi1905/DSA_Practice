package Arrays;

public class ConvertToList {
    public static void main(String[] args) {
        int arr[] = {1,3,4};
        String s = arrayToString(arr);
        System.out.println(s);
    }
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        return sb.toString();
    }
}
