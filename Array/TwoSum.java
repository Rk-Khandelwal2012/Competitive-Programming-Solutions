class Solution {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        // code here
        Arrays.sort(arr);
        int l=0;
        int flag=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]+arr[r] == x){
                flag=1;
                break;
            }
            else if(arr[l]+arr[r] < x){
                l++;
            }
            else{
                r--;
            }
        }
        if(flag == 1)
        return true;
        else
        return false;
    }
}
