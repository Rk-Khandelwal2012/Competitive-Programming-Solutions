class Solution {
    public boolean search(int[] nums, int target) {
        int l=0,u=nums.length-1;
        while(l<=u){
            int mid=(l+u)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[l]==nums[mid] && nums[mid]==nums[u]){
                l++;
                u--;
                continue;
            }
            else if(nums[l]<=nums[mid]){
                if(target>=nums[l] && target<=nums[mid])
                    u = mid-1;
                else
                    l=mid+1;
            }
            else{
                if(target>=nums[mid] && target<=nums[u])
                    l=mid+1;
                else
                u = mid-1;
            }
        }
        return false;
    }
}
