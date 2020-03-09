package me.boj.graph.ps_1707;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BipartiteGraph {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (n-- > 0) {
            ArrayList<ArrayList<Integer>> graphs = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            for (int i = 0; i < v + 1; i++) {
                graphs.add(new ArrayList<>());
            }

            for (int i = 0; i < e; i++) {
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());

                graphs.get(from).add(to);
                graphs.get(to).add(from);
            }

            int[] color = new int[v + 1];

            boolean ok = true;
            for (int i = 1; i <= v; i++) {
                if (color[i] == 0) {
                    if (!dfs(graphs, color, i, 1)) {
                        ok = false;
                    }
                }
            }

            if (ok) {
                bw.append("YES");
            } else {
                bw.append("NO");
            }
            bw.newLine();
        }
        bw.close();
    }

    static boolean dfs(ArrayList<ArrayList<Integer>> graphs, int[] color, int x, int group) {
        color[x] = group;
        for (int v : graphs.get(x)) {
            if (color[v] == 0) {
                if (!dfs(graphs, color, v, 3 - group)) return false;
            } else if (color[v] == color[x]) {
                return false;
            }
        }
        return true;
    }
}
