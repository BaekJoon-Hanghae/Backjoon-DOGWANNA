package 배열1차원.Q5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> arr = new LinkedList<>();
        for(int i=0; i<30; i++){
            arr.add(i+1);
        }

        for(int i=0; i<28; i++){
            arr.remove(arr.indexOf(Integer.parseInt(br.readLine())));
        }
        sb.append(arr.get(0) + " " + arr.get(1));
        System.out.println(sb);
        br.close();
    }
}
