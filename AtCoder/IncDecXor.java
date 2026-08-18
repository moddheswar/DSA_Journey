import java.util.*;

public class IncDecXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] a = new int[n + 1];
        Set<Integer> active = new HashSet<>();

        int ans = 0;

        while (q-- > 0) {
            int type = sc.nextInt();

            if (type == 1) {
                int x = sc.nextInt();

                ans ^= a[x];
                a[x]++;
                ans ^= a[x];

                active.add(x);
            } 
            else {
                Set<Integer> next = new HashSet<>();

                ans = 0;

                for (int x : active) {
                    a[x]--;

                    if (a[x] > 0) {
                        next.add(x);
                    }

                    ans ^= a[x];
                }

                active = next;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}