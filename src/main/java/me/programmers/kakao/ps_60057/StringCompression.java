package me.programmers.kakao.ps_60057;

public class StringCompression {
    public int solution(String s) {
        int len = s.length();
        int maxSize = s.length() / 2;
        int answer = len;

        // i => 압축 시도할 문자열 개수 , j => 순회
        for (int i = 1; i <= maxSize; i++) {
            // 이전 문자, 현재 문자, 결과문자
            String prev = "", next = "", result = "";
            int count = 1;
            for (int j = 0; j * i <= len; j++) {
                int start = i * j;   // 0, 2, 4, 6, 8
                int end = Math.min((i * j) + i, len); // 2, 4, 6, 8
                prev = next;
                next = s.substring(start, end);

                if (next.equals(prev)) {
                    count++;
                } else {
                    result += getResult(prev, count);
                    count = 1;
                }
            }
            result += getResult(next, count);
            answer = Math.min(answer, result.length());
        }

        return answer;
    }

    private String getResult(String prev, int count) {
        return count > 1 ? count + prev : prev;
    }
}
