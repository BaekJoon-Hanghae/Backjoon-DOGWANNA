package 문자열.Q5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] arr = br.readLine().toCharArray();
        int totalTime = 0;

        for(int i=0; i<arr.length; i++){
            int ascii = arr[i];

            switch (ascii){
                case 'A' : case 'B' : case 'C' :
                    totalTime += 3;
                    break;
                case 'D' : case 'E' : case 'F' :
                    totalTime += 4;
                    break;
                case 'G' : case 'H' : case 'I' :
                    totalTime += 5;
                    break;
                case 'J' : case 'K' : case 'L' :
                    totalTime += 6;
                    break;
                case 'M' : case 'N' : case 'O' :
                    totalTime += 7;
                    break;
                case 'P' : case 'Q' : case 'R' : case 'S' :
                    totalTime += 8;
                    break;
                case 'T' : case 'U' : case 'V' :
                    totalTime += 9;
                    break;
                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    totalTime += 10;
                    break;
            }
        }
        sb.append(totalTime);
        System.out.println(sb);
        br.close();
    }
}
