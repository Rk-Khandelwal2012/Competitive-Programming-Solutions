class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        // ArrayList<Integer> a1 = new ArrayList<>();
        // ArrayList<Integer> a2 = new ArrayList<>();
        // ArrayList<Integer> a3 = new ArrayList<>();
        // for(int i=0;i<a.length;i++){
        //     a1.add(a[i]);
        // }
        // for(int i=0;i<b.length;i++){
        //     a2.add(b[i]);
            
        // }
        // for(int i=0;i<n;i++){
        //     if(a2.contains(a1.get(i))){
        //         continue;
        //     }
        //     else{
        //         a3.add(a1.get(i));
        //     }
        // }
        // return a3;
        
        HashSet<Integer> setB = new HashSet<>();
        ArrayList<Integer> missing = new ArrayList<>();

        // Add all elements of array b to the HashSet
        for (int i = 0; i < m; i++) {
            setB.add(b[i]);
        }

        // Check each element of array a
        for (int i = 0; i < n; i++) {
            if (!setB.contains(a[i])) {
                missing.add(a[i]);
            }
        }

        return missing;
    }
}
