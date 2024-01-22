package infyexam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class CloudServerUsage {
    private int n;
    private int m;
    private int k;
    private int[] usage;

    public CloudServerUsage(int n, int m, int k, int[] usage) {
        this.n = n;
        this.m = m;
        this.k = k;
        this.usage = usage;
    }

    public int getMaxSubset() {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            minHeap.offer(usage[i]);
        }

        for (int i = 0; i < m; i++) {
            int leastBusy = minHeap.poll();
            minHeap.offer(leastBusy + 1);
        }

        ArrayList<Integer> usageList = new ArrayList<>(minHeap);
        Collections.sort(usageList);

        return usageList.get(k - 1);
    }


    public static void main(String[] args) {
        int n = 5;
        int m = 10;
        int k = 3;
        int[] usage = {1, 3, 2, 5, 4};

        CloudServerUsage cloudServerUsage = new CloudServerUsage(n, m, k, usage);
        int result = cloudServerUsage.getMaxSubset();

        System.out.println("The largest possible value for the " + k + "-th smallest usage value is: " + result);
    }
}
