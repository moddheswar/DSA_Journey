import java.util.*;

public class C0MarAndAlternatingSums{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long md = 1000000007L;

        int tt = sc.nextInt();

        while (tt-- > 0) {

            int nn = sc.nextInt();

            long[] ar = new long[nn];

            for (int ii = 0; ii < nn; ii++) {
                ar[ii] = sc.nextLong();
            }

            long mm = 0;
            int ii = 0;

            while (ii < nn && ar[ii] == -1) {
                mm++;
                ii++;
            }

            long np = nn - mm;
            long rr = 0;
            long dd = 0;
            long pr = -2;

            for (; ii < nn; ii++) {
                if (ar[ii] != pr) {
                    if (rr > 0 && ar[ii] == pr + 1)
                        dd++;
                    rr++;
                    pr = ar[ii];
                }
            }

            long p1 = 1;
            long b1 = 2;
            long e1 = np - rr;

            while (e1 > 0) {
                if ((e1 & 1) == 1)
                    p1 = (p1 * b1) % md;
                b1 = (b1 * b1) % md;
                e1 >>= 1;
            }

            if (mm == 0) {
                System.out.println(p1);
                continue;
            }

            long p2 = 1;
            long b2 = 2;
            long e2 = mm - 1;

            while (e2 > 0) {
                if ((e2 & 1) == 1)
                    p2 = (p2 * b2) % md;
                b2 = (b2 * b2) % md;
                e2 >>= 1;
            }

            long an = (p1 * p2) % md;
            an = (an * (dd + 1)) % md;

            System.out.println(an);
        }
    }
}