package me.boj.bruteforce.ps_1963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Path {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        searchPrime();

        while (t-- > 0) {
            for (int i = 0; i < 10000; i++) {
                visited[i] = -1;
            }

            final StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            visit(x);

            if (visited[y] != -1) {
                System.out.println(visited[y]);
            } else {
                System.out.println("Impossible");
            }
        }
    }

    static boolean[] prime = new boolean[10000];
    static int[] visited = new int[10000];

    private static void visit(int number) {
        Queue<String> q = new LinkedList<>();
        q.add(String.valueOf(number));
        visited[number] = 0;

        while (!q.isEmpty()) {
            String y = q.remove();
            for (int i = 3; i >= 0; i--) {
                for (int j = 0; j <= 9; j++) {
                    int k = modX(y, i, j);
                    if (k >= 1000 && !prime[k] && visited[k] == -1) {
                        visited[k] = visited[Integer.parseInt(y)] + 1;
                        q.add(String.valueOf(k));
                    }
                }
            }
        }
    }

    private static int modX(String s, int i, int j) {
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < 4; x++) {
            if(x == i) sb.append(j);
            else sb.append(s.charAt(x));
        }
        return Integer.parseInt(sb.toString());
    }

    private static void searchPrime() {
        for (int i = 2; i * i <= 9999; i++) {
            if (prime[i]) continue;

            for (int j = 2 * i; j <= 9999; j += i) {
                prime[j] = true;
            }
        }
    }
}
