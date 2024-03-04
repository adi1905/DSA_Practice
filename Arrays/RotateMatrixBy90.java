package Arrays;

public class RotateMatrixBy90 {
    public static void swap(int arr[][], int i, int j){
        // System.out.println(i + " " + j);
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
        // System.out.println(i + " " + j);
    }
    public static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }
    }
    public static void rotateMatrix(int arr[][]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                swap(arr, i, j);
            }
        }
        
        
        for(int i=0;i<n;i++){
            reverseArray(arr[i], 0, n-1);
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
