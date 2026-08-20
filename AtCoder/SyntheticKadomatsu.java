import java.util.*;

public class SyntheticKadomatsu{

    static int n, a, b, c;
    static int[] arr;
    static int ans = Integer.MAX_VALUE;

    static void dfs(int i, int x, int y, int z, int cx, int cy, int cz) {

        if (i == n) {

            if (cx == 0 || cy == 0 || cz == 0) {
                return;
            }

            int cost = 0;

            cost += Math.abs(x - a);
            cost += Math.abs(y - b);
            cost += Math.abs(z - c);

            cost += (cx - 1) * 10;
            cost += (cy - 1) * 10;
            cost += (cz - 1) * 10;

            ans = Math.min(ans, cost);

            return;
        }

        dfs(i + 1, x, y, z, cx, cy, cz);

        dfs(i + 1, x + arr[i], y, z, cx + 1, cy, cz);

        dfs(i + 1, x, y + arr[i], z, cx, cy + 1, cz);

        dfs(i + 1, x, y, z + arr[i], cx, cy, cz + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        dfs(0, 0, 0, 0, 0, 0, 0);

        System.out.println(ans);
    }
}