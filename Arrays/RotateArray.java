package Arrays;

public class RotateArray {
    public static void arrayReverse(int arr[],int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArray(int arr[], int pos){
        pos = pos % arr.length;
        arrayReverse(arr,0, pos-1);
        arrayReverse(arr, pos, arr.length);
        arrayReverse(arr, 0, arr.length);
    }
    public static void main(String[] args) {
        int arr[] = {4,1,3,1,7};
        rotateArray(arr, 2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
