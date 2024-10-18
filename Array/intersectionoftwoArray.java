class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        int n1= nums1.length;
        int n2= nums2.length;

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    s.add(nums1[i]);
                }
            }
        }
      
          int[] a = new int[s.size()];
        int index = 0;
        for (Integer i : s) {
            a[index++] = i; // Autounboxing here
        }
        return a;
    }
}
