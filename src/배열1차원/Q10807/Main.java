package 배열1차원.Q10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        String str = br.readLine();
        int target = Integer.parseInt(br.readLine());
        int num;

        StringTokenizer st = new StringTokenizer(str);

        for(int i=0; i<length; i++){
            if((num = Integer.parseInt(st.nextToken())) == target){
                arr.add(num);
            }
        }
        System.out.println(arr.size());
        br.close();
    }
}
