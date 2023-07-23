package Programmers.입문.A로B만들기;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int result = s.solution("olleh","hello");
        System.out.println(result);
    }

    public int solution(String before, String after) {
        // 각 요소들과 요소별 갯수를 세어서 비교해야한다..
        char[] arr = before.toCharArray();
        StringBuffer covertStr = new StringBuffer();
        for(int i=arr.length-1; i>=0; i--){
            covertStr.append(arr[i]);
        }

        if(covertStr.toString().equals(after)){
            return 1;
        }
        return 0;
    }

}
