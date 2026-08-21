import java.io.*;

public class StaticRangeMinimumQueries {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int num = 0;

            while (c > ' ') {
                num = num * 10 + c - '0';
                c = read();
            }

            return num;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int size = 1;

        while (size < N) {
            size <<= 1;
        }

        int[] seg = new int[size * 2];

        for (int i = 0; i < seg.length; i++) {
            seg[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < N; i++) {
            seg[size + i] = sc.nextInt();
        }

        for (int i = size - 1; i >= 1; i--) {
            seg[i] = Math.min(seg[i * 2], seg[i * 2 + 1]);
        }

        StringBuilder sb = new StringBuilder();

        while (Q-- > 0) {
            int l = sc.nextInt() - 1 + size;
            int r = sc.nextInt() + size;

            int ans = Integer.MAX_VALUE;

            while (l < r) {
                if ((l & 1) == 1) {
                    ans = Math.min(ans, seg[l]);
                    l++;
                }

                if ((r & 1) == 1) {
                    r--;
                    ans = Math.min(ans, seg[r]);
                }

                l >>= 1;
                r >>= 1;
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}