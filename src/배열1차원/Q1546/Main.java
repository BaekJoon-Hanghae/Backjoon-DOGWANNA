package 배열1차원.Q1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        double max = 0;
        double[] arr = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i] = Double.parseDouble(st.nextToken());

            if(max < arr[i]){
                max = arr[i];
            }
        }

        double sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += (arr[i]/max) * 100;
        }

        sb.append(sum/arr.length);
        System.out.println(sb);
        br.close();
    }
}
