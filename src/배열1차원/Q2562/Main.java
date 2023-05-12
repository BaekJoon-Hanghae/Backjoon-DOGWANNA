package 배열1차원.Q2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int max = 0;
        int index = 0;

        for(int i=1; i<=9; i++){
            int var = Integer.parseInt(br.readLine());

            if(var > max){
                max = var;
                index = i;
            }
        }
        sb.append(max + "\n").append(index);
        System.out.println(sb);
        br.close();
    }
}
