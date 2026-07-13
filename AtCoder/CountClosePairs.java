import java.util.*;

public class CountClosePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long ans = 0;
        int j = 1;

        for (int i = 1; i <= n - 1; i++) {
            if (j < i) j = i;
            while (j < n) {
                System.out.println("? " + i + " " + (j + 1));
                System.out.flush();
                String resp = sc.next();
                if (resp.equals("Yes")) {
                    j++;
                } else {
                    break;
                }
            }
            ans += (j - i);
        }

        System.out.println("! " + ans);
        System.out.flush();

        sc.close();
    }
}