import java.util.*;

public class ACreatingAbbreviations{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            Set<Character> set = new HashSet<>();
            for(int i=0;i<n;i++){
                String str = sc.next();
                set.add(str.charAt(0));
            }
            boolean flage = true;
            for(int i=0;i<m;i++){
                String str = sc.next().toLowerCase();
                for(char ch: str.toCharArray()){
                    if(!set.contains(ch)){
                        flage = false;
                    }
                }
            }
            System.out.println(flage ? "YES" : "NO");
        }
        sc.close();
    }
}