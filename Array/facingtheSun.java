class Solution {
    int countBuildings(int h[], int n) {
        // code here

	    int a[]= new int[n];
	    for(int i =0;i<n;i++){
	        a[i]=h[i];
	    }
	    int c=a[0];
	    int count = 0;
	    for(int i=1;i<n;i++){
	        if(a[i]>a[i-1] && a[i]>c){
	            count+=1;
	            c=a[i];
	        }
	    }
	    count+=1;
	    return count;
	}
}
class demo{
    public static void main(String args[]){
        Solution ob= new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h[] = new int[n];
        for(int i=0;i<n;i++){
            h[i] = sc.nextInt();
        }
        int x = ob.countBuildings(h,n);
        System.out.println(x);
    }
}
