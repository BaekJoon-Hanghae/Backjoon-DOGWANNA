import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
////        sb.append();
//        System.out.println(sb);
//        br.close();d

        int a = 3000;
        int b = 5000;
        int budget = 23000;
        int result = 0;
        int length = budget / a;

        for(int i=1; i<=length; i++){
            int total = budget;
            total -= a*i;

            if(total == 0){
                result += 1;
                continue;
            }
            if(total < b){
                continue;
            }
            if (total % b == 0){
                result += 1;
            }
        }
        System.out.println(result);
    }
}
