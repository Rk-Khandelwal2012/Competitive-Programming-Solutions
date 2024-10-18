class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int left=0;
        int right=n-1;
        int lmax = arr[left];
        int rmax=arr[right];
        long ans=0;
        
        while(left<right){
            if(arr[left]<arr[right]){
                lmax=Math.max(lmax,arr[left]);
                ans+=lmax-arr[left];
                left++;
            }else{
                rmax= Math.max(rmax,arr[right]);
                ans+=rmax-arr[right];
                right--;
            }
        }
        return ans;
    
}
}
