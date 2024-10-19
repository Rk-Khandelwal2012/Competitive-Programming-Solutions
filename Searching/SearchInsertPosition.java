class Solution {
    public int searchInsert(int[] nums, int target) {
       int l=0,u=nums.length-1;
       int ind=0;
       
       while(l<=u){
        int mid=(l+u)/2;
        if(nums[mid]==target){
            ind = mid;
            break;
        }
            
        else if (nums[mid]<target){
            ind=mid+1;
            l=mid+1;
        }
        else if (nums[mid]>target){
            if(mid==0)
            ind =mid;
            else if((mid-1)>ind)
            ind=mid-1;
            u=mid-1;
        }

       }
       return ind;
    }
}
