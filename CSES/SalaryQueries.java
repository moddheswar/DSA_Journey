import java.util.*;

public class SalaryQueries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int newN = 1;
        while(newN < N){
            newN = newN << 1;
        }

        int[] seg = new int[newN * 2];
        for(int i=newN;i<newN+N;i++){
            seg[i] = sc.nextInt();
        }
        sc.close();
    }
}