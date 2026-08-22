import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class RangeUpdateQueries{
    
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;
        FastScanner(InputStream in) {
            this.in = in;
        }
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) {
                    return -1;
                }
            }
            return buffer[ptr++];
        }
        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');
            long sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            long res = 0;
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return res * sign;
        }
        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
    static void update(long[] seg,int node,int nl,int nr,int ql,int qr,int u){
        if(nr<ql || nl>qr){
            return;
        }
        if(nl>=ql && nr<=qr){
            //System.out.println(node);
            seg[node] += u;
            return;
        }
        int mid = (nl + nr)/2;
        update(seg,node * 2,nl,mid,ql,qr,u);
        update(seg,node * 2 + 1,mid+1,nr,ql,qr,u);
    }
    static long find(long[] seg,int node, int nl,int nr, int ql,int qr){
        if(nl>qr || nr<ql){
            return 0;
        }
        if(nl >= ql && nr <= qr){
            return seg[node];
        }
        int mid = (nl + nr)/2;
        return seg[node] + find(seg,node*2,nl,mid,ql,qr) + find(seg,node*2+1,mid + 1,nr,ql,qr);
    }
    public static void main(String[] args) throws Exception{
        FastScanner sc= new FastScanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int newN = 1;
        while(newN < N){
            newN <<= 1;
        }

        long[] seg = new long[newN * 2 ];
        for(int i=newN;i<newN + N;i++){
            seg[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        while(Q-->0){
            int q = sc.nextInt();
            if(q == 1){
                int st = sc.nextInt();
                int ed = sc.nextInt();
                int up = sc.nextInt();
                update(seg,1,1,newN,st,ed,up);
            }
            else if(q==2){
                int x = sc.nextInt();
                sb.append(find(seg,1,1,newN,x ,x ) + "\n");
            }
        }
        System.out.println(sb);
    }
}