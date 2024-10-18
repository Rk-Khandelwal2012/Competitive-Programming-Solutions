class Solution {
    public int print2largest(int[] arr) {
        // Code Here
        int max=-1;
        int sec=-1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(max>arr[i] && arr[i]>sec && max!=sec){
                sec=arr[i];
            }
        }
        return sec;
    }
}
