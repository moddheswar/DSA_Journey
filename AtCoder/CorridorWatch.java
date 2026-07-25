import java.util.*;

public class CorridorWatch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        String str = sc.next();
        int[] arr = new int[M + 1];
        for(int i=0;i<M;i++){
            if(str.charAt(i) == 'G'){
                int st = i - (D);
                int ed = i + (D + 1);
                if(st <0){
                    st = 0;
                }
                if(ed > M){
                    ed = M; 
                }
                arr[st] += 1;
                arr[ed] -= 1;
            }
        }
        int sum = 0;
        int c = 0;
        for(int i=0;i<M;i++){
            sum += arr[i];
            if(sum == 0){
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}