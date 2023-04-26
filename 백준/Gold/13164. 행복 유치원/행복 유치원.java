import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] children = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            children[i] = Integer.parseInt(st.nextToken());
        }
        int[] diff = new int[N-1];
        for (int i = 0; i < N-1; i++) {
            diff[i] = children[i+1]-children[i];
        }
        Arrays.sort(diff);
        int ans = 0;
        for (int i = 0; i < N-K; i++) {
            ans += diff[i];
        }
        System.out.println(ans);
    }
}
