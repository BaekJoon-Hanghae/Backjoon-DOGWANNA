package 배열1차원.Q10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int length = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        int[] arr = new int[length];
        Arrays.fill(arr, 0);
        for(int i = 0; i < cnt; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken())-1;
            int to = Integer.parseInt(st.nextToken())-1;
            int num = Integer.parseInt(st.nextToken());
            for(int j = from; j <= to; j++){
                arr[j] = num;
            }
        }

        for(int val : arr){
            sb.append(val).append(" ");
        }
        System.out.println(sb.toString().strip());
        br.close();
    }
}
