package 배열1차원.Q10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = -1000001;
        int min = 1000001;
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        sb.append(min + " ").append(max);
        System.out.println(sb);
        br.close();
    }
}
