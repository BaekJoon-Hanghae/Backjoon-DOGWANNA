package Programmers.입문.문자열정렬하기2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
            Solution s = new Solution();

            String result = s.solution("Bcad");
        System.out.println(result);
        }

    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] arr = my_string.toCharArray();
        Arrays.sort(arr);

        return String.valueOf(arr);
    }
}
