import java.io.*;
import java.util.*;

public class Main {
    static int N, dice[][], max;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        dice = new int[N][7];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= 6; j++) {
                dice[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        max = -1;
        rollDice();
        System.out.println(max);
    }

    public static void rollDice () {
        for (int t = 1; t <= 6; t++) {
            int up = dice[0][t];
            int result = 0;
            for (int k = 1; k <= 6; k++) {
                if (k == t || k == findSide(t)) continue;
                result = Math.max(result, dice[0][k]);
            }

            for (int i = 1; i < N; i++) {
                for (int j = 1; j <= 6; j++) {
                    int max = -1;
                    if (dice[i][j] == up) { // 아래로 맞춰야 함
                        for (int k = 1; k <= 6; k++) {
                            if (k == j || k == findSide(j)) continue;
                            max = Math.max(max, dice[i][k]);
                        }
                        result += max;
                        up = dice[i][findSide(j)];
                        break;
                    }
                }
            }
            max = Math.max(max, result);
        }
    }


    public static int findSide (int side) {
        switch (side) {
            case 1: return 6;
            case 2: return 4;
            case 3: return 5;
            case 4: return 2;
            case 5: return 3;
            default: return 1;
        }
    }
}
