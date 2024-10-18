class Solution {

    static int search(int arr[], int x) {

        // Your code here
        int a= -1;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                a=i;
                return a;
            }
        }
        return a;
    }
}
