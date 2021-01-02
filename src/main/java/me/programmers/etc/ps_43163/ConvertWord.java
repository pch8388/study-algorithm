package me.programmers.etc.ps_43163;

public class ConvertWord {
    static boolean[] visited;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        final int answer = findWord(begin, target, words, 0);
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }

    private int findWord(String begin, String target, String[] words, int count) {
        if (begin.equals(target)) {
            return count;
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (visited[i]) continue;
            int check = 0;
            String word = words[i];
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) != word.charAt(j)) {
                    check++;
                }

                if (check > 1) {
                    break;
                }
            }

            if (check == 1) {
                visited[i] = true;
                result = Math.min(result, findWord(word, target, words, count + 1));
                visited[i] = false;
            }
        }

        return result;
    }
}
