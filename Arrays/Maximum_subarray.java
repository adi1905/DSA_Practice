package Arrays;

public class Maximum_subarray {
    public static int maxSumSubarray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static int maxSumKadane(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxSum = Math.max(sum, maxSum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int maxSum = maxSumKadane(arr);
        System.out.println(maxSum);
    }
}
