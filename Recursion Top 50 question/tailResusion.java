public class tailResusion {
    public static int value(int a[],int size,int sum){
        if(size==0){
            return sum;
        }
        else
        return value(a,size-1,sum+a[size-1]);
    }
}
