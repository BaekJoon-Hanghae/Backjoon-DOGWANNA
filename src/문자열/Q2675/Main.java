package 문자열.Q2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j=0; j<str.length(); j++){
                sb.append(String.valueOf(str.charAt(j)).repeat(repeat));
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
