import java.util.*;

public class BMergeToMatch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int len1 = sc.nextInt();
            int len2 = sc.nextInt();
            int[] arr1 = new int[len1];
            int[] arr2 = new int[len2];
            for(int i=0;i<len1;i++){
                arr1[i] = sc.nextInt();
            }
            Arrays.sort(arr1);
            for(int i=0;i<len2;i++){
                arr2[i] = sc.nextInt();
            }
            Arrays.sort(arr2);
            
            if(2*len2 > len1){
                System.out.println("NO");
                continue;
            }
            boolean flage = true;
            for(int i=0;i<len2;i++){
                if(arr1[i] > arr2[i]){
                    flage = false;
                    break;
                }
                if(arr1[len1 - len2 + i] < arr2[i]){
                    flage = false;
                    break;
                }
            }
            System.out.println(flage ? "YES" : "NO");
        }
        sc.close();
    }
}