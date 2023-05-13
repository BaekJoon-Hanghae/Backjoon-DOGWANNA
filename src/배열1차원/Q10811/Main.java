package 배열1차원.Q10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }

        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken())-1;
            int to = Integer.parseInt(st.nextToken())-1;

            while (from < to){
                int temp = arr[from];
                arr[from++] = arr[to];
                arr[to--] = temp;
            }
        }

        for(int i=0; i<arr.length; i++){
            sb.append(arr[i] + " ");

        }
        System.out.println(sb.toString().strip());
        br.close();
    }
}
