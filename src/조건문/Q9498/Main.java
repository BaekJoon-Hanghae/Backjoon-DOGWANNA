package 조건문.Q9498;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append(
                90 <= a && a <= 100 ? "A" :
                80 <= a && a <= 89 ? "B" :
                70 <= a && a <= 79 ? "C" :
                60 <= a && a <= 69 ? "D" :
                "F");
        System.out.println(sb);
        br.close();
    }
}
