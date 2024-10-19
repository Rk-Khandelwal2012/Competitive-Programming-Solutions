class Solution {
    public int findMin(int[] nums) {
        
        int l=0,u=nums.length-1;
        while(l<u){
            int m=(l+u)/2;
            if(nums[m]<nums[u]){
                u=m;
            }
            else{
                l=m+1;
            }
        }
        return nums[l];
    }
}
