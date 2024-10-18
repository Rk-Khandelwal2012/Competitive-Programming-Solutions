
class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        ArrayList <Integer> l = new ArrayList<>();
        
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                if(!l.contains(arr[i]))
                l.add(arr[i]);
            }
        }
        if(l.size()==0){
            l.add(-1);
        }
        return l;
    }
}
