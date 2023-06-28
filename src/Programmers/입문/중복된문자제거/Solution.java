package Programmers.입문.중복된문자제거;

public class Solution {
    public static void main(String[] args) {
            Solution s = new Solution();

            String result = s.solution("people");
        System.out.println(result);
        }

    public String solution(String my_string) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            if(!answer.contains(String.valueOf(my_string.charAt(i)))){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
