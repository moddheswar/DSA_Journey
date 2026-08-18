import java.util.*;

public class BDominoTiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long mod = 998244353;

        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            int a = -1;
            int b = -1;

            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '?') {
                    continue;
                }

                int x = str.charAt(i) - '0';
                int pos = i + 1;

                if (pos % 4 == 1) {
                    if (a == -1) {
                        a = x;
                    } else if (a != x) {
                        a = 2;
                    }
                } else if (pos % 4 == 3) {
                    x = 1 - x;

                    if (a == -1) {
                        a = x;
                    } else if (a != x) {
                        a = 2;
                    }
                } else if (pos % 4 == 2) {
                    if (b == -1) {
                        b = x;
                    } else if (b != x) {
                        b = 2;
                    }
                } else {
                    x = 1 - x;

                    if (b == -1) {
                        b = x;
                    } else if (b != x) {
                        b = 2;
                    }
                }
            }

            long ans = 1;

            if (a == -1) {
                ans *= 2;
            } else if (a == 2) {
                ans *= 0;
            }

            if (b == -1) {
                ans *= 2;
            } else if (b == 2) {
                ans *= 0;
            }

            ans %= mod;

            System.out.println(ans);
        }

        sc.close();
    }
}