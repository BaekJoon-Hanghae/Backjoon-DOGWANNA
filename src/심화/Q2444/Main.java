package 심화.Q2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int star = Integer.parseInt(br.readLine());
        for(int i=1; i <= star; i++){
            for(int j=i ; j < star; j++){
                sb.append(" ");
            }
            for(int k=0; k < i*2-1; k++){
                sb.append("*");
            }
            sb.append("\n");
        }

        for(int i=2; i <= star; i++){
            for(int j=1; j < i; j++){
                sb.append(" ");
            }
            for(int k = (star*2)-(i*2-1); k > 0; k--){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
