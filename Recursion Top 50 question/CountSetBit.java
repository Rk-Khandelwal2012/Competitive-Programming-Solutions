public class countSetbit {
    public static int findBinary(int n){
        if(n==0){
            return 0;
        }
        else {
            return n%2+10*findBinary(n/2);
        }
    }
    public static void main(String args[]){
        int a = findBinary(21);
        int count =0;
        while(a>0){
            if(a%10==1)
                count++;
           a = a/10;
        }
        System.out.println(count);
    }
   
    }
