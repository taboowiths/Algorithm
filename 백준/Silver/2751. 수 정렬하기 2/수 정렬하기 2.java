import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(input);
        for (int i = 0; i < N; i++) {
            sb.append(input[i]).append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
}