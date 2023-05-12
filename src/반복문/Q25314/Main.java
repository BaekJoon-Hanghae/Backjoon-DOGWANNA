package 반복문.Q25314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i=4; i<=N; i+=4){
            if(i==N){
                sb.append("long int");
                break;
            }
            sb.append("long ");
        }
        System.out.println(sb);
        br.close();
    }
}
