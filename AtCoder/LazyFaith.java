import java.util.*;

public class LazyFaith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = sc.nextInt();

        long[] s = new long[a];
        long[] t = new long[b];

        for (int i = 0; i < a; i++) {
            s[i] = sc.nextLong();
        }

        for (int i = 0; i < b; i++) {
            t[i] = sc.nextLong();
        }

        while (q-- > 0) {
            long x = sc.nextLong();

            int sl = Arrays.binarySearch(s, x);
            int tl = Arrays.binarySearch(t, x);

            if (sl < 0) sl = -sl - 1;
            else sl++;

            if (tl < 0) tl = -tl - 1;
            else tl++;

            long ans = Long.MAX_VALUE;

            // shrine left, temple left
            if (sl > 0 && tl > 0) {
                long ss = s[sl - 1];
                long tt = t[tl - 1];
                ans = Math.min(ans, Math.abs(x - ss) + Math.abs(ss - tt));
            }

            // shrine left, temple right
            if (sl > 0 && tl < b) {
                long ss = s[sl - 1];
                long tt = t[tl];
                ans = Math.min(ans, Math.abs(x - ss) + Math.abs(ss - tt));
            }

            // shrine right, temple left
            if (sl < a && tl > 0) {
                long ss = s[sl];
                long tt = t[tl - 1];
                ans = Math.min(ans, Math.abs(x - ss) + Math.abs(ss - tt));
            }

            // shrine right, temple right
            if (sl < a && tl < b) {
                long ss = s[sl];
                long tt = t[tl];
                ans = Math.min(ans, Math.abs(x - ss) + Math.abs(ss - tt));
            }

            // temple first
            if (tl > 0 && sl > 0) {
                long tt = t[tl - 1];
                long ss = s[sl - 1];
                ans = Math.min(ans, Math.abs(x - tt) + Math.abs(tt - ss));
            }

            if (tl > 0 && sl < a) {
                long tt = t[tl - 1];
                long ss = s[sl];
                ans = Math.min(ans, Math.abs(x - tt) + Math.abs(tt - ss));
            }

            if (tl < b && sl > 0) {
                long tt = t[tl];
                long ss = s[sl - 1];
                ans = Math.min(ans, Math.abs(x - tt) + Math.abs(tt - ss));
            }

            if (tl < b && sl < a) {
                long tt = t[tl];
                long ss = s[sl];
                ans = Math.min(ans, Math.abs(x - tt) + Math.abs(tt - ss));
            }

            System.out.println(ans);
        }

        sc.close();
    }
}