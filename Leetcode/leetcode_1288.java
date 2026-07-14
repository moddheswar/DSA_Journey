import java.util.*;
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(b[1], a[1]));
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Set<Integer> st = new HashSet<Integer>();
        for(int i=0;i<intervals.length;i++){
            for(int j = i + 1;j<intervals.length;j++){
                if(intervals[i][1] >= intervals[j][1]){
                    st.add(j);
                }
            }
        }
        return intervals.length - st.size();
    }
}