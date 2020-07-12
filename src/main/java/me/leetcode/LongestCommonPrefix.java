package me.leetcode;

import java.util.HashMap;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix l = new LongestCommonPrefix();
        System.out.println(l.longestCommonPrefix(new String[] {"flower","flow","flight"}));
        System.out.println(l.longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }

    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) return "";
        if (len == 1) return strs[0];

        int min = Integer.MAX_VALUE;
        Trie t = new Trie();
        t.insert(strs[0]);
        for (int i = 1; i < len; i++) {
            min = Math.min(min, t.findDuplicated(strs[i]));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
            sb.append(strs[0].charAt(i));
        }

        return sb.toString();
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;

        for (char c : word.toCharArray()) {
            current = current.getChildren().computeIfAbsent(c, w -> new TrieNode());
        }
        current.setEndOfWord(true);
    }

    public int findDuplicated(String word) {
        TrieNode current = root;

        int cnt = 0;
        for (char c : word.toCharArray()) {
            if (current.getChildren().containsKey(c)) {
                current = current.getChildren().get(c);
                cnt++;
            } else {
                return cnt;
            }
        }

        return cnt;
    }
}

class TrieNode {
    private HashMap<Character, TrieNode> children = new HashMap<>();
    private boolean endOfWord;
    private int count = 1;

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }

    public void increase() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
