package 조건문.Q14681;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        int x = Integer.parseInt(st.nextToken());
//        int y = Integer.parseInt(st.nextToken());
//
//        if(0 < x && 0 < y){
//            sb.append("1");
//        }else if(x < 0 && 0 < y){
//            sb.append("2");
//        }else if(x < 0 && y < 0) {
//            sb.append("3");
//        }else if(0 < x && y < 0){
//            sb.append("4");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());

        if(X > 0) {
            if(Y > 0) {
                System.out.print(1);
            }
            else {
                System.out.print(4);
            }
        }

        else {
            if(Y > 0) {
                System.out.print(2);
            }
            else {
                System.out.print(3);
            }
        }
    }

}