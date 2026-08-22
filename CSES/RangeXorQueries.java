import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class RangeXorQueries{
    
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
    static int find(int[] seg,int node,int nl,int nr,int ql,int qr){
        if(nr<ql || nl>qr){
            return 0;
        }
        if(nl>=ql && nr<=qr){
            return seg[node];
        }
        int mid = (nl + nr)/2;
        return find(seg,node * 2,nl,mid,ql,qr) ^ find(seg,node * 2 +1,mid+1,nr,ql,qr);
    }
    public static void main(String[] args) throws Exception{
        FastScanner sc = new FastScanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int newN = 1;
        while(newN < N){
            newN <<= 1;
        }
        int[] seg = new int[newN * 2];
        for(int i=newN;i<newN + N;i++){
            seg[i] = sc.nextInt();
        }

        for(int i=newN - 1;i>=1;i--){
            seg[i] = seg[i+i] ^ seg[i+i+1];
        }
        StringBuilder sb = new StringBuilder();
        while(Q-->0){
            int st = sc.nextInt();
            int ed = sc.nextInt();
            sb.append(find(seg,1,1,newN,st,ed ) + "\n");
        }
        System.out.println(sb);
        
    }
}