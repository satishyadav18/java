import java.util.*;

public class Main1 {

    static int N, M;
    static List<Integer>[] graph;
    static int start1, start2, target;
    static int ans = Integer.MAX_VALUE;

    static void dfs(int u1, int u2, boolean[] used, int count) {
        if (u1 == target && u2 == target) {
            ans = Math.min(ans, count);
            return;
        }

        if (count >= ans) return; // prune

        List<Integer> next1 = u1 == target ? List.of(target) : graph[u1];
        List<Integer> next2 = u2 == target ? List.of(target) : graph[u2];

        for (int v1 : next1) {
            if (v1 != target && used[v1]) continue;

            for (int v2 : next2) {
                if (v2 != target && used[v2]) continue;
                if (v1 == v2 && v1 != target) continue;

                boolean markV1 = v1 != target && !used[v1];
                boolean markV2 = v2 != target && !used[v2];

                if (markV1) used[v1] = true;
                if (markV2) used[v2] = true;

                int added = 0;
                if (v1 != target) added++;
                if (v2 != target && v2 != v1) added++;

                dfs(v1, v2, used, count + added);

                if (markV1) used[v1] = false;
                if (markV2) used[v2] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        start1 = sc.nextInt();
        start2 = sc.nextInt();
        target = sc.nextInt();

        boolean[] used = new boolean[N + 1];
        used[start1] = true;
        used[start2] = true;

        int initial = start1 == start2 ? 1 : 2;

        dfs(start1, start2, used, initial);

        System.out.println(ans == Integer.MAX_VALUE ? "Impossible" : ans);
    }
}
