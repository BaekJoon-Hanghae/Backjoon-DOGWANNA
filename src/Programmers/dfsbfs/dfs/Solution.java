package Programmers.dfsbfs.dfs;

public class Solution {
    int answer = 0;
    public static void main(String[] args) {
            Solution s = new Solution();
            int[] numbers = {1, 1, 1, 1, 1};
            int target = 3;

            int result = s.solution(numbers, target);

        System.out.println(result);
        }

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);

        System.out.println();
        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){ // 마지막 노드 까지 탐색한 경우
            if(target == sum) answer++;
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]); // 해당 노드의 값을 더하고 다음 깊이 탐색
            dfs(numbers, depth + 1, target, sum - numbers[depth]); // 해당 노드의 값을 빼고 다음 깊이 탐색
        }
    }
}
