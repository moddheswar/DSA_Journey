class Solution {
    static class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first = first;
            this.second = second;
        }

    }
    public int largestRectangleArea(int[] heights) {
        int N = heights.length;
        Stack<Pair> stk = new Stack<>();
        int max = 0;
        for(int i=0;i<=N;i++){
            int coin=(i==N)?0:heights[i];
            int start=i;
            while(!stk.isEmpty() && stk.peek().first>coin){
                Pair p=stk.pop();
                max=Math.max(max,p.first*(i-p.second));
                start=p.second;
            }
            stk.push(new Pair(coin,start));
        }
        return max;
    }
}