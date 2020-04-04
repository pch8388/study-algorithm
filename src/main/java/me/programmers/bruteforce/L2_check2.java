package me.programmers.bruteforce;

public class L2_check2 {
    public int solution(int n) {
        int cnt = binaryCount(n);
        int ans = n;
        do {
            ans++;
        } while (binaryCount(ans) != cnt);
        return ans;
    }

    private int binaryCount(int x) {
        int count = 0;
        while (x != 0) {
            if (x % 2 == 1) count++;
            x /= 2;
        }

        return count;
    }
}
