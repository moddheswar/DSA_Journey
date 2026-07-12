import java.util.*;

public class BEzraftAndArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            if(n == 1){
                System.out.println(1);
            }
            else if(n == 2){
                System.out.println(-1);
            }
            else{
                System.out.print("1 2 3");
                long num = 6;
                for(int i= 3;i<n;i++){
                    System.out.print(" " + num);
                    num += num;
                }
                System.out.println();
            }
        }
        sc.close();
    }
}