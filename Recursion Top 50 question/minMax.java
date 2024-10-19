public class minMax {
    public static int minN(int a[],int size){
        if(size==1)
            return a[0];
        else
            return Math.min(a[size-1], minN(a, size-1));
    }
    public static int maxN(int a[],int size){
        if(size==1)
            return a[0];
        else
            return Math.max(a[size-1], maxN(a, size-1));
    }
    public static void main(String[] args) {
        int a[]={20,1,23,43,12,50};
        int min = minN(a, 6);
        int max = maxN(a, 6);
        System.out.println("Min Value :"+min);
        System.out.println("Max Value :"+max);
    }
}
