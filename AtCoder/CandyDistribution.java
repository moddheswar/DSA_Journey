import java.util.*;

public class CandyDistribution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<Long,Long> map = new HashMap<>();
        map.put(0L,1L);

        long ans = 0;
        long mod = 0;
        
        for(int i=0;i<N;i++){
            long temp = sc.nextInt();
            mod = (mod + temp) % M;
            ans+=map.getOrDefault(mod,0L);
            map.put(mod,map.getOrDefault(mod,0L) + 1);
        }
        
        System.out.println(ans);
        sc.close();
    }
}