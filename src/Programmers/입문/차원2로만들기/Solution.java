package Programmers.입문.차원2로만들기;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int[][] result = s.solution(num_list, 2);
        System.out.println(Arrays.deepToString(result));
    }

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int index = 0;

        for(int i=0; i<num_list.length/n; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[index++];
            }
        }

        return answer;
    }
}
