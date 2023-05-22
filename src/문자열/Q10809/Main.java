package 문자열.Q10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String[] arr = new String[26];

        for(int i=0; i<arr.length; i++){
            arr[i] = String.valueOf((char)('a' + i));
        }

        for(int i=0; i<arr.length; i++){
            if(str.contains(arr[i])){
                sb.append(str.indexOf(arr[i])).append(" ");
            }else{
                sb.append("-1").append(" ");
            }
        }

        System.out.println(sb);
        br.close();
    }
}
