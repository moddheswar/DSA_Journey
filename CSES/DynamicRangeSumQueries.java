import java.io.*;

public class DynamicRangeSumQueries {

    static long[] bit;
    static long[] arr;
    static int n;

    static void add(int i, long value) {
        while (i <= n) {
            bit[i] += value;
            i += i & -i;
        }
    }

    static long sum(int i) {
        long res = 0;

        while (i > 0) {
            res += bit[i];
            i -= i & -i;
        }

        return res;
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        n = fs.nextInt();
        int q = fs.nextInt();

        arr = new long[n + 1];
        bit = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = fs.nextLong();
            add(i, arr[i]);
        }

        StringBuilder out = new StringBuilder();

        while (q-- > 0) {
            int type = fs.nextInt();
            int a = fs.nextInt();
            long b = fs.nextLong();

            if (type == 1) {
                long difference = b - arr[a];
                arr[a] = b;
                add(a, difference);
            } else {
                int right = (int) b;
                out.append(sum(right) - sum(a - 1)).append('\n');
            }
        }

        System.out.print(out);
    }

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
}