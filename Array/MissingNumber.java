class Solution {
    public static int missingNumber(int n, int[] arr) {
        // code here
        int sum = n*(n+1)/2;
        int arrsum=0;
        for(int i=0;i<arr.length;i++){
            arrsum+=arr[i];
        }
        return sum-arrsum;
    }
}
        
