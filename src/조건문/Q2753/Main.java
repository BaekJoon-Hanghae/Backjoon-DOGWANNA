package 조건문.Q2753;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());

        if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)){
            sb.append(1);
        }else {
            sb.append(0);
        }
        System.out.println(sb);
        br.close();
    }
}
