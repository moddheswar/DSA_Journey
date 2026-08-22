class Solution {
    static class Trie{
        Trie[] trie = new Trie[26];
        String word;
        boolean flag = false;
    }
    static int[] dir = {1,0,-1,0,1};
    static boolean isbound(int r,int c,int R,int C){
        return (r>=0 && r<R && c>= 0 && c<C);
    }
    static void dfs(char[][] board,int r,int c,Trie root,List<String> res,boolean[][] vis){
        if(root.word != null && root.word.length() > 0 && !root.flag){
            res.add(root.word);
            root.flag = true;
        }
        vis[r][c] = true;
        int R = board.length;
        int C = board[0].length;
        for(int d=0;d<4;d++){
            int ar = r + dir[d];
            int ac = c + dir[d + 1];
            if(isbound(ar,ac,R,C) && !vis[ar][ac] && root.trie[board[ar][ac] -'a']!=null){
                dfs(board,ar,ac,root.trie[board[ar][ac] - 'a'],res,vis);
                vis[ar][ac] = false;
            }
        }
    }
    public List<String> findWords(char[][] board, String[] words) {
        Trie root = new Trie();
        Trie ptr;
        Trie prv;
        for(String str:words){
            prv = root;
            ptr = root;
            for(char ch:str.toCharArray()){
                if(ptr.trie[ch - 'a'] == null){
                    Trie t= new Trie();
                    ptr.trie[ch - 'a'] = t;
                    prv = ptr;
                    ptr = t;
                }
                else{
                    prv = ptr;
                    ptr = ptr.trie[ch - 'a'];
                }
            }
            prv.trie[str.charAt(str.length() - 1) - 'a'].word = str;
        }
        List<String> res = new ArrayList<>();
        int R = board.length;
        int C = board[0].length;
        for(int row =0;row<R;row++){
            for(int col = 0;col<C;col++){
                char ch = board[row][col];
                if(root.trie[ch - 'a'] != null){
                    dfs(board,row,col,root.trie[ch - 'a'],res,new boolean[R][C]);
                }
            }
        }
        return res;
    }
}
/*
[["o","a","a","n"]
,["e","t","a","e"]
,["i","h","k","r"]
,["i","f","l","v"]]
*/