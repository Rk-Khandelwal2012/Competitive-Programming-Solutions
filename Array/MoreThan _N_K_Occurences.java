class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        Map<Integer,Integer> m = new HashMap<>();
        for(int num : arr){
            m.put(num, m.getOrDefault(num,0)+1);
        }
        int max_value=n/k;
        int key=0;
        
        for(Map.Entry<Integer, Integer>p : m.entrySet()){
            if(max_value < p.getValue()){
                
                key++;
            }
        }
       
            return key;
        
        
    }
}
