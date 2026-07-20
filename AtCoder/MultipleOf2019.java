import java.util.*;

public class MultipleOf2019 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int rem = 0;
        int pow = 1;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=n-1;i>=0;i--){
            rem = (rem + (str.charAt(i) - '0') * pow)%2019;
            if(map.containsKey(rem)){
                ans += map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
            else{
                map.put(rem,1);
            }
            pow = (pow*10) % 2019;
        }
        System.out.println(ans);
        sc.close();
    }
}
