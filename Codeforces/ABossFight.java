import java.util.*;

public class ABossFight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            int s = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                s += x;
                if(map.containsKey(x)){
                    map.put(x, map.get(x) + 1);
                }
                else{
                    map.put(x,1);
                }
            }

            int max = 0;
            int value = 0;

            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (e.getValue() > max) {
                    max= e.getValue();
                    value = e.getKey();
                }
            }

            int others = n - max;

            if (max <= others + 1) {
                System.out.println(s);
            } 
            else {
                int otherSum = s - max * value;
                int ans = otherSum + (others + 2) * value;
                System.out.println(ans);
            }
        }
    }
}