class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean find3Numbers(int arr[], int n, int x) {

        // Your code Here
        int flag=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;
            while(l<r){
                if(arr[l]==arr[i]){
                    l++;
                }
                if(arr[r]==arr[i]){
                    r--;
                }
                if(arr[l]+arr[r]+arr[i] == x){
                    flag=1;
                    break;
                }
                else if(arr[l]+arr[r]+arr[i] < x){
                    l++;
                }
                else{
                    r--;
                }
            }
            if(flag==1){
                break;
            }
        }
        if(flag==1)
        return true;
        else
        return false;
    }
}
