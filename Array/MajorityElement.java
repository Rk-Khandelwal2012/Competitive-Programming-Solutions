class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        Map<Integer,Integer> m = new HashMap<>();
        for(int num : a){
            m.put(num, m.getOrDefault(num,0)+1);
        }
        int max_value=0;
        int key=0;
        for(Map.Entry<Integer, Integer>p : m.entrySet()){
            if(max_value < p.getValue()){
                max_value=p.getValue();
                key=p.getKey();
            }
        }
        if(max_value > size/2){
            return key;
        }
        else{
            return -1;
        }
    }
}
