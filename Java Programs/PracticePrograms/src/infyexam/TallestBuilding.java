package infyexam;

import java.util.PriorityQueue;
import java.util.Scanner;

public class TallestBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int A = sc.nextInt();
        int X = sc.nextInt();
        int B = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findMinimumCost(N, K, A, X, B, arr);
        System.out.println(ans);
        sc.close();
    }

    public static int findMinimumCost(int N, int K, int A, int X, int B, int[] arr) {
        int MOD = 1000000007;
        int max_floors = 0;
        for (int i = 0; i < N; i++) {
            max_floors = Math.max(max_floors, arr[i]);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0]-a[0]);
        int cost = 0;
        for (int i = 0; i < N; i++) {
            if (i != K-1 && arr[i] < arr[K-1]) {
                pq.add(new int[]{arr[i], i});
            }
            while (!pq.isEmpty() && pq.peek()[0] >= arr[K-1]) {
                pq.poll();
            }
            while (!pq.isEmpty() && pq.peek()[0] < arr[i]) {
                int[] building = pq.poll();
                int j = building[1];
                cost = (cost + (i-j)*2*B) % MOD;
                building[0] = arr[i];
                pq.add(building);
            }
        }
        cost = (cost + (max_floors-arr[K-1])*A) % MOD;
        return cost;
    }
}
