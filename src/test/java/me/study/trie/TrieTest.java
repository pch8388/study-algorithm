package me.study.trie;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrieTest {

	@Test
	public void trie_try() {
		Trie trie = createExampleTrie();

		assertThat(trie.isEmpty()).isFalse();
		assertThat(trie.containsNode("3")).isFalse();
		assertThat(trie.containsNode("vida")).isFalse();
		assertThat(trie.containsNode("life")).isTrue();
	}

	@Test
	public void trie_delete() {
		Trie trie = createExampleTrie();

		assertThat(trie.containsNode("Programming")).isTrue();

		trie.delete("Programming");
		assertThat(trie.containsNode("Programming")).isFalse();
	}

	private Trie createExampleTrie() {
		Trie trie = new Trie();

		trie.insert("Programming");
		trie.insert("is");
		trie.insert("a");
		trie.insert("way");
		trie.insert("of");
		trie.insert("life");

		return trie;
	}
}