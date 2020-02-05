package me.study.trie;

public class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode current = root;

		for (char l : word.toCharArray()) {
			current = current.getChidren().computeIfAbsent(l, c -> new TrieNode());
		}
		current.setEndOfWord(true);
	}

	public boolean isEmpty() {
		return root == null;
	}

	public boolean containsNode(String word) {
		return find(word);
	}

	private boolean find(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.getChidren().get(ch);
			if (node == null) {
				return false;
			}
			current = node;
		}
		return current.isEndOfWord();
	}

	public void delete(String word) {
		delete(root, word, 0);
	}

	private boolean delete(TrieNode current, String word, int index) {
		if (index == word.length()) {
			if (!current.isEndOfWord()) {
				return false;
			}
			current.setEndOfWord(false);
			return current.getChidren().isEmpty();
		}
		char ch = word.charAt(index);
		TrieNode node = current.getChidren().get(ch);
		if (node == null) {
			return false;
		}

		boolean shouldDeleteCurrentNode = delete(node, word, index + 1) && !node.isEndOfWord();
		if (shouldDeleteCurrentNode) {
			current.getChidren().remove(ch);
			return current.getChidren().isEmpty();
		}

		return false;
	}
}
