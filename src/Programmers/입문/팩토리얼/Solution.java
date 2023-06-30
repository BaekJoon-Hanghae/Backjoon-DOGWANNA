package Programmers.입문.팩토리얼;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int result = s.solution(3628800);
        System.out.println(result);
    }


    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=10; i++){
            if(factorial(i) <= n){
                answer = i;
            }
        }

        return answer;
    }

    public static int factorial(int n){
        return (n<=1) ? n : factorial(n-1) * n;
    }
}
