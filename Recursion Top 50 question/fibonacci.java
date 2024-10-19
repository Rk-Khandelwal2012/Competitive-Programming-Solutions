import java.util.*;
public class fibonacci {
    public static int dp[]=new int[101];
    public static int  series(int n,int dp[]){
        
        if(n==0){
             return 0;}
        if(n==1 || n==2){
            return 1;
        }
        if(dp[n] !=-1){
            return dp[n];
        }
        return (dp[n]=((series(n-1,dp)+series(n-2,dp))));
          //  dp[n] = ((series(n-1)+series(n-2)));
       // return dp[n];
    }
    
    

public static void main(String args[]){
    for(int i=0;i<dp.length;i++){
        if(i==0 && i==1)
            dp[0]=dp[1]=1;
        dp[i]=-1;

    }
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = series(n,dp);
    System.out.println(a);
}
}
