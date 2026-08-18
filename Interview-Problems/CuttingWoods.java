import java.util.*;

public class CuttingWoods{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        TreeSet<Integer> arr = new TreeSet<>();
        arr.add(0);
        arr.add(n);
        for(int i=0;i<q;i++){
            int qt = sc.nextInt();
            int x = sc.nextInt();
            if(qt == 1){
                arr.add(x);
            }
            else if(qt == 2){
                System.out.println(arr.higher(x) - arr.floor(x));
            }
        }
        sc.close();
    }
}