import java.util.*;

public class WordChain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Character, List<String>> map = new HashMap<>();
        int[] cnt = new int[26];
        for(int i=0;i<n;i++){
            String str = sc.next();
            if(map.containsKey(str.charAt(0))){
                map.get(str.charAt(0)).add(str);
            }
            else{
                map.put(str.charAt(0),new ArrayList<>());
                map.get(str.charAt(0)).add(str);
            }
        }
        char ch = sc.next().charAt(0);
        sc.close();
    }
}
