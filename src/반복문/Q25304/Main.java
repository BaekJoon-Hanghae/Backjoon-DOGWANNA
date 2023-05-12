package 반복문.Q25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            result += (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }

        if(result == X){
            sb.append("Yes");
        }else{
            sb.append("No");
        }
        System.out.println(sb);
        br.close();
    }
}
