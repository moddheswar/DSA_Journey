import java.util.*;

public class SurveyTabulation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int max = 0;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String str = sc.next().toLowerCase();
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
                max = Math.max(map.get(str),max);
            }
            else{
                map.put(str,1);
            }
        }
        System.out.println(max);
        sc.close();
    }
}