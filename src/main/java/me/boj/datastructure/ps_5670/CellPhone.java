package me.boj.datastructure.ps_5670;

import java.util.HashMap;
import java.util.Map;

public class CellPhone {

	static double findDictionaryCount(String[] strings) {
		Trie trie = new Trie();
		for (String s : strings) {
			trie.insert(s);
		}

		int sum = 0;
		for (String s : strings) {
			sum += trie.contains(s);
		}

		return (double)sum / strings.length;
	}
}

class Trie {
	private final TrieNode root;

	public Trie() {
		this.root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode current = root;

		for (char l : word.toCharArray()) {
			current = current.getChildren().computeIfAbsent(l, c -> new TrieNode());
		}
		current.setEndOfWord(true);
	}

	public int contains(String word) {
		return find(word);
	}

	private int find(String word) {
		TrieNode current = root;
		int cnt = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.getChildren().get(ch);
			int x = current.getChildren().size();
			if (node == null) {
				return -1;
			}
			current = node;
			if (x > 1) {
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
	private int childrenCnt;
	private boolean isWord;

	public Map<Character, TrieNode> getChildren() {
		return children;
	}

	public void setEndOfWord(boolean isWord) {
		this.isWord = isWord;
	}

	public boolean isEndOfWord() {
		return isWord;
	}

	public void increaseChildren() {
		this.childrenCnt++;
	}

	public int getChildrenCnt() {
		return childrenCnt;
	}

	public boolean isWord() {
		return isWord;
	}
}