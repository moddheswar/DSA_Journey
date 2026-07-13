import java.util.*;

public class RepresentativeBalls{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int c = sc.nextInt();
            int s = sc.nextInt();
            if(map.containsKey(c)){
                map.put(c,Math.max(s,map.get(c)));
            }
            else{
                map.put(c,s);
            }
        }
        for(int i=1;i<=m;i++){
            if(map.containsKey(i)){
                System.out.print(map.get(i) + " ");
            }
            else{
                System.out.print("-1 ");
            }
        }
        sc.close();
    }
}