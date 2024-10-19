public class problem3 {
    public static int sum(int n){
        if (n==1){
             return 1;
        }
        else{
            int s = sum(n-1)+n;
            return s;
        }
        
    }
}
