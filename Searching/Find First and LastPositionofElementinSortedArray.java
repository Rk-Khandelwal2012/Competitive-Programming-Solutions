class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int l=0,u=n-1;
        int a=-1,b=-1;
        int ar[]=new int[2];
        ar[0]=ar[1]=-1;
        while(l<=u){
            int mid = (l+u)/2;
            if(nums[mid]==target){
                int left=mid;
                while(left>=l && nums[left]==target){
                    ar[0]=left;
                    left--;
                }
                int right=mid;
                while(right<=u && nums[right]==target){
                    ar[1]=right;
                    right++;
                }
                break;
            }
            else if(nums[mid]<target){
                a=mid+1;
                l=mid+1;
            }
            else if(nums[mid]>target){
                b=mid-1;
                u=mid-1;
            }
        }
        
       
        return ar;
    }
}
