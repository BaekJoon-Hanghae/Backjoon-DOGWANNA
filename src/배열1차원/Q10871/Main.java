package 배열1차원.Q10871;

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
        int X = Integer.parseInt(st.nextToken());

        int num;
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            if((num = Integer.parseInt(st.nextToken())) < X){
                sb.append(num + " ");
            }
        }
        System.out.println(sb.toString().strip());
        br.close();
    }
}
