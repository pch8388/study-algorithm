package me.codility.lesson4;

public class PermCheck {
    public int solution(int[] A) {
        int len = A.length;
        boolean[] visited = new boolean[len + 1];
        for (int i : A) {
            if (len < i) return 0;
            if (visited[i]) return 0;
            visited[i] = true;
        }
        return 1;
    }
}
