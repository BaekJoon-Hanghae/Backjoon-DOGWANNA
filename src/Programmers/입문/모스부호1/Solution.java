package Programmers.입문.모스부호1;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
            Solution s = new Solution();

            String result = s.solution(".--. -.-- - .... --- -.");
//            int result = s.solution(0);
        System.out.println(result);
        }

    public String solution(String letter) {
        StringBuffer bf = new StringBuffer();
        StringTokenizer st = new StringTokenizer(letter);
        HashMap<String, Character> map = new HashMap<String, Character>();

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char key = 'a';

        for(int i=0; i<morse.length; i++){
            map.put(morse[i], key);
            System.out.println(key);
            key += 1;
        }

        while (st.hasMoreTokens()){
            bf.append(map.get(st.nextToken()));
        }

        return bf.toString();
    }

//    public int solution(int letter) {
//        int answer = 0;
//
//        return answer;
//    }
}
