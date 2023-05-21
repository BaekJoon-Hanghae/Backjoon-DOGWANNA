package 문자열.Q11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int length = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result = 0;
        for(int i=0; i<length; i++){
            int num = Integer.parseInt(str.substring(i,i+1));
            result += num;
        }
        sb.append(result);
        System.out.println(sb);
        br.close();
    }
}
