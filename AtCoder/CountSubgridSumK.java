import java.util.*;

public class CountSubgridSumK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int[][] grid = new int[R][C];
        for(int row = 0;row<R;row++){
            for(int col = 0;col<C;col++){
                grid[row][col] = sc.nextInt();
            }
        }
        for(int row = 0;row<R;row++){
            int sum = 0;
            for(int col = 0;col<C;col++){
                sum += grid[row][col];
                grid[row][col] = sum;
            }
        }
        for(int col = 0;col<C;col++){
            int sum = 0;
            for(int row = 0;row<R;row++){
                sum += grid[row][col];
                grid[row][col] = sum;
            }
        }
        
        sc.close();
    }
}