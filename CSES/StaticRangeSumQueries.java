import java.io.*;

public class StaticRangeSumQueries {
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

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            long num = 0;
            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }
            return num;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        int Q = sc.nextInt();

        long[] arr = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = arr[i - 1] + sc.nextLong();
        }

        StringBuilder sb = new StringBuilder();

        for (int q = 0; q < Q; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            sb.append(arr[j] - arr[i - 1]).append('\n');
        }

        System.out.print(sb);
    }
}