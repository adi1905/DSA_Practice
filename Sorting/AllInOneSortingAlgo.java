package Sorting;

public class AllInOneSortingAlgo {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = key;
        }
    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {7,3,9,6,10,1};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
