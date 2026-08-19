import java.util.*;

public class PackingPotatoes{
    static int lowerBound(List<Long> list, long target) {
        int low = 0;
        int high = list.size() - 1;
        int res = list.size() - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) >= target) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        long a = sc.nextLong();

        long[] arr = new long[n+1];
        List<Long> ps = new ArrayList<>();

        long sum = 0L;
        ps.add(sum);

        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            ps.add(sum);
        }

        Map<Integer,Long> map = new HashMap<>();

        int prev = 0;
        long dis = 0;

        List<Integer> fl = new ArrayList<>();
        List<Long> fw = new ArrayList<>();
        List<Integer> loop;

        long x = a;
        int bp = 0;

        while(true){
            int lb = lowerBound(ps,x);
            
            if(ps.get(lb) < x){
                dis += lb - prev;
                prev = 0;
                x -= ps.get(lb);
                continue;
            }
            else{
                if(map.containsKey(lb)){
                    bp = fl.indexOf(lb);
                    fl.add(lb);
                    map.put(lb,dis + (lb - prev));
                    fw.add(map.get(lb));
                    break;
                }
                else{
                    map.put(lb,dis + (lb - prev));
                }

                fl.add(lb);
                fw.add(map.get(lb));

                dis = 0;
                prev = lb;
                x =  a + ps.get(lb);
            }
        }
        loop = fl.subList(bp + 1,fl.size());

        for(int i=0;i<q;i++){
            long qn = sc.nextLong();

            if(qn <= fl.size()){
                System.out.println(fw.get((int)qn - 1));
            }
            else{
                qn -= fl.size();
                qn %= loop.size();

                if(qn == 0) qn = loop.size();

                System.out.println(map.get(loop.get((int)qn - 1)));
            }
        }
        
        sc.close();
    }
}