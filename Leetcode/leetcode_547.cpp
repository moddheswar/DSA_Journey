class Solution {
public:
    void join(vector<int>& leader, int left,int right){
        left = find(leader,left);
        right = find(leader, right);
        
        leader[left] = right;
    }
    int find(vector<int>& leader, int node){
        if(leader[node] == node){
            return node;
        }
        return leader[node] = find(leader,leader[node]);
    }
    int findCircleNum(vector<vector<int>>& isConnected) {
        int N = isConnected.size();
        vector<int> leader(N+1);
        for(int i=0;i<N;i++){
            leader[i] = i;
        }
        for(int row = 0;row<N;row++){
            for(int col = 0;col<N;col++){
                if(isConnected[row][col] == 1){
                    join(leader,col,row);
                }
            }
        }
        int ans = 0;
        for(int i=0;i<N;i++){
            if(leader[i] == i){
                ans++;
            }
        }
        return ans;
    }
};