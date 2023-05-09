package 조건문.Q2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 조건을 순서대로 나열한다.
        if(a == b && a == c){ // 모두 같을 경우
            sb.append(10000 + a * 1000);
        }else if(a == b || a == c){ // 2개 같을 경우
            sb.append(1000 + a * 100);
        }else if(b == c){ // 2개 같을 경우
            sb.append(1000 + b * 100);
        }else{ // 모두 다를 경우
            sb.append(Math.max(a, Math.max(b,c)) * 100);
        }

        System.out.println(sb);
        br.close();
    }
}
