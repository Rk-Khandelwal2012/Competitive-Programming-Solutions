class linear{
    public static int search(int ar[],int t){
        for(int i=0;i<ar.length;i++){
            if(ar[i]==t){
                return i;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        int a = search(arr,target);
        System.out.println(a);

        
    }
}
