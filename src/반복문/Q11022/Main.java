package 반복문.Q11022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i=1; i<=T; i++){
            String str = br.readLine();
            int target = str.indexOf(" ");
            int A = Integer.parseInt(str.substring(0,target));
            int B = Integer.parseInt(str.substring(target + 1));
            sb.append("Case #" + i + ": " + A + " + " + B + " = " + (A+B) +"\n");
        }
        br.close();
        System.out.println(sb);
    }
}
