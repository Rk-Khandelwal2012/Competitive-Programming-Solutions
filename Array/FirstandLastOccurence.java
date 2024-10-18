class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        int l=0;
        int r=n-1;
        int midd=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==x){
                midd= mid;
                break;
            }
            if(arr[mid] <x){
                l=mid+1;
            }
            else
                r=mid-1;
        }
        if(midd==-1){
            a.add(-1);
            a.add(-1);
            return a;
        }
        int left =midd;
        while(arr[left]==x){
            left--;
        }
        a.add(left+1);
        int right = midd;
        while(arr[right]==x){
            right++;
        }
        a.add(right-1);
        return a;
    }
}
