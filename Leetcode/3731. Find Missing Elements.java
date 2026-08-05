class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum =0;
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            if(n>max){
                max = n;
            }
            if(n < min){
                min = n;
            }
            set.add(n);
        }
        List<Integer> lst = new ArrayList<>();
        for(int i = min;i<=max;i++){
            if(!set.contains(i)){
                lst.add(i);
            }
        }
        return lst;
    }
}