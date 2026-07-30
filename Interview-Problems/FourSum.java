import java.util.*;

public class FourSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(map.containsKey(arr[i])){
                map.put(arr[i],new ArrayList<>());
                map.get(arr[i]).add(i);
            }
            else{

            }
        }
        sc.close();
    }
}