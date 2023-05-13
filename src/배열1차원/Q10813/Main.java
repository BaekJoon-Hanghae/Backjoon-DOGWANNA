package 배열1차원.Q10813;

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
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1 ;
            int b = Integer.parseInt(st.nextToken())-1;
            int c = arr[a];

            arr[a] = arr[b];
            arr[b] = c;
        }

        for(int i : arr){
            sb.append(i + " ");
        }

        System.out.println(sb.toString().strip());
        br.close();
    }
}
