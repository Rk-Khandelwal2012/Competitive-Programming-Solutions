public class sumOfArray {
    public static int sumOf(int a[],int n){
        if(n==0){
            return 0;
        }
        else{
        return a[n-1]+ sumOf(a,n-1);
        }
    }
}
