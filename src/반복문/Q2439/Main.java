package 반복문.Q2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String str = " ".repeat(N);
        StringBuilder space= new StringBuilder(str);

        for (int i=1; i<=N; i++){
            space.setCharAt(N-i,'*');
            System.out.println(space);
        }
        br.close();
    }
}
