package 조건문.Q2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        if(M < 45){
            H--;
            M = 60 - (45 - M);
            if(H < 0){
                H = 23;
            }
            sb.append(H + " " + M);
        }else {
            sb.append(H + " " + (M - 45));
        }
        System.out.println(sb);
        br.close();
    }
}
