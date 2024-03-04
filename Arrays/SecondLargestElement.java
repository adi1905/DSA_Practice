package Arrays;

public class SecondLargestElement {
    public static int secondLargest(int arr[]){
        int n = arr.length;
        int max = arr[0];
        int secondMax = -1;
        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] < max && arr[i] >secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println(max);
        return secondMax;
    }
    public static void main(String[] args) {
        int arr[] = {4,1,6,10,197,19};
        int secondMax = secondLargest(arr);
        System.out.println(secondMax);
    }
}
