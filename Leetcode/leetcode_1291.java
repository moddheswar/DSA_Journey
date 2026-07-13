import java.util.*;
public class leetcode_1291{
    class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<Integer>();
        int temp  = low;
        int std=0;
        int ltd=0;
        while(temp != 0){
            temp /= 10;
            std++;
        }
        temp = high;
        while(temp != 0){
            temp /= 10;
            ltd++;
        }
        System.out.println(std +" "+ltd);
        String s = "123456789";
        for(int i=std;i<=ltd;i++){
            for(int j = 0;j<=9 - i;j++){
                int t = Integer.parseInt(s.substring(j,j+i));
                if(t >= low && t <= high){
                    res.add(t);
                }
            }
        }
        return res;

    }
}
}
