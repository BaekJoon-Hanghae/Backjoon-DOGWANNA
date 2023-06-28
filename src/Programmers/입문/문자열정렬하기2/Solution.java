package Programmers.입문.문자열정렬하기2;

public class Solution {
    public static void main(String[] args) {
            Solution s = new Solution();

            int result = s.solution(15);
        System.out.println(result);
        }

    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            int cnt = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt >= 3){
                answer++;
            }
        }
        return answer;
    }
}
