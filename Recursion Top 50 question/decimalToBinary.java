public class decimalToBinary {
    public static int findBinary(int n){
        if(n==0){
            return 0;
        }
        else {
            return n%2+10*findBinary(n/2);
        }
    }
}
