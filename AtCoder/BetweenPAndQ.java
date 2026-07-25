import java.util.*;

public class BetweenPAndQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        int rankP = 0;
        int rankQ = 0;
        int rank = 1;
        while (true) {
            if (Arrays.equals(a, p)) {
                rankP = rank;
            }
            if (Arrays.equals(a, q)) {
                rankQ = rank;
            }
            int i = n - 2;
            while (i >= 0 && a[i] >= a[i + 1]) {
                i--;
            }

            if (i < 0) {
                break;
            }

            int j = n - 1;
            while (a[j] <= a[i]) {
                j--;
            }

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }

            rank++;
        }

        if (rankP < rankQ) {
            System.out.println(rankQ - rankP - 1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}