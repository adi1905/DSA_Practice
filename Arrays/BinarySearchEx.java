package Arrays;

public class BinarySearchEx {
    public static boolean binarySearch(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <=high){
            int mid = (high + low)/2;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                high = mid-1;
            }else if(arr[mid] < target){
                low = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {4,10,17,20,38,40,89,100};
        boolean isFound = binarySearch(arr, 50); 
        System.out.println(isFound);
    }
}
