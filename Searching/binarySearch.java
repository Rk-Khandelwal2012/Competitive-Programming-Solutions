public class binarySearch {
    public static void main(String args[]){
        int ar[]={12,13,14,15,16,17};
        
        int n=ar.length;
        int s=0,l=n-1;
        int target = 13;
        while(s<=l){
           int  mid = (s+l)/2;
            if(ar[mid]==target){
                System.out.println(mid);
                break;}
            if(ar[mid]<target)
                s=mid+1;
            if(ar[mid]>target)
                l = mid-1;
        }
    }
}
