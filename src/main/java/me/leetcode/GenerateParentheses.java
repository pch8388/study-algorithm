package me.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        int openCount = 1;
        int closeCount = 0;

        List<String> result = new ArrayList<>();

        dfs(result, n, 1, "(", openCount, closeCount);
        return result;
    }

    void dfs(List<String> result, int n, int index, String str, int openCount, int closeCount) {
        if (str.length() == n * 2) {
            result.add(str);
            return;
        }

        for (int i = index; i < n * 2; i++) {
            if (openCount + 1 <= n) {
                // open 추가
                dfs(result, n, i + 1, str + "(", openCount + 1, closeCount);
            }

            if (openCount >= closeCount + 1) {
                // close 추가
                dfs(result, n, i + 1, str + ")", openCount, closeCount + 1);
            }
        }

    }
}
