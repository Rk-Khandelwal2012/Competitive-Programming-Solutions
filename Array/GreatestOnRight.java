 public int[] replaceElements(int[] arr) {
        int result = new int[arr.length];
        int n= arr.length;
        int max=arr[n-1];
        result[n-1]=-1;
        max=arr[n-1];
        for(int i=n-1-1;i>=0;i--){
            if(max<arr[i])
                max=arr[i];
            result[i]=max;
        }
        return result;
    }
}
