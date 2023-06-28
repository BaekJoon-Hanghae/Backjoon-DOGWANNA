public class Solution {
    public static void main(String[] args) {
            Solution s = new Solution();

            int result = s.solution(29423);
        System.out.println(result);
        }

    public int solution(int order) {
        int answer = 0;

        String str = Integer.toString(order);
        int[] arrNum = new int[str.length()];

        for(int i=0; i<str.length(); i++){
            arrNum[i] = str.charAt(i) - '0';

            if(arrNum[i] == 3 || arrNum[i] == 6 || arrNum[i] == 9){
                answer += 1;
            }
        }
        return answer;
    }
}
