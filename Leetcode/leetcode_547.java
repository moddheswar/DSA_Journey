class Solution {
    static void join(int[] leader, int left, int right){
        left = find(leader,left);
        right = find(leader,right);
        
        leader[left] = right;
    }
    static int find(int[] leader,int node){
        if(leader[node] == node){
            return node;
        }
        return leader[node] = find(leader,leader[node]);
    }
    static int findCircleNum(int[][] grid){
        int N = grid.length;
        int[] leader = new int[N + 1];
        for(int i=1;i<=N;i++){
            leader[i] = i;
        }
        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                if(grid[row][col] == 1){
                    join(leader,row+1,col+1);
                }
            }
        }
        int[] grp = new int[N+1];
        for(int i=1;i<=N;i++){
            grp[find(leader,i)]++;
        }
        int ans = 0;
        for(int i=1;i<=N;i++){
            if(grp[i] >= 1){
                ans++;
            }
        }
        return ans;
    }
}