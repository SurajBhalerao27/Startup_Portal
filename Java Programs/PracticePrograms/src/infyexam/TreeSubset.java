package infyexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreeSubset {

    static final int MOD = 1000000007;

    static List<Integer>[] tree;
    static long[][] dp;
    static long[] val;

    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			tree = new ArrayList[n];
			for (int i = 0; i < n; i++) {
			    tree[i] = new ArrayList<>();
			}
			for (int i = 1; i < n; i++) {
			    int u = sc.nextInt() - 1;
			    int v = sc.nextInt() - 1;
			    tree[u].add(v);
			    tree[v].add(u);
			}
			val = new long[n];
			for (int i = 0; i < n; i++) {
			    val[i] = sc.nextLong();
			}
			dp = new long[n][2];
		}
        dfs(0, -1);
        long ans = Math.max(dp[0][0], dp[0][1]);
        System.out.println(ans % MOD);
    }

    static void dfs(int u, int p) {
        dp[u][0] = 0;
        dp[u][1] = val[u];
        long sum0 = 0, sum1 = val[u];
        for (int v : tree[u]) {
            if (v != p) {
                dfs(v, u);
                dp[u][1] += dp[v][0];
                sum1 += dp[v][0];
                if (dp[v][1] > dp[v][0]) {
                    sum0 += dp[v][1];
                } else {
                    sum0 += dp[v][0];
                }
            }
        }
        dp[u][0] = Math.max(sum0, sum1);
    }
}
