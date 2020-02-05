package me.study.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	private HashMap<Character, TrieNode> chidren = new HashMap<>();
	private String content;
	private boolean isWord;

	public Map<Character, TrieNode> getChidren() {
		return chidren;
	}

	public void setEndOfWord(boolean isEnd) {
		isWord = isEnd;
	}

	public boolean isEndOfWord() {
		return isWord;
	}
}
