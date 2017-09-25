package com.learning.trie;

public class WordSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String keys[] = {"the" , "a", "there", "answer", "any", "by" , "bye", "their"};
		TrieNode root = new TrieNode();
		for(int i = 0; i<keys.length ; i++) {
			insert(root, keys[i]);
		}
		
		if(search(root , "the"))
			System.out.println("the Present");
		else System.out.println("the Not present");
		if(search(root, "thaw"))
			System.out.println("thaw Present");
		else System.out.println("thaw Not present");
		
	}
	
	static void insert(TrieNode node, String key){
		for(char ch:key.toCharArray()) {
			int index = ch - 'a';
			if(node.children[index] == null) {
				node.children[index] = new TrieNode();
			}
			node = node.children[index];
		}
		node.isEndNode = true;
	}
	
	static boolean search(TrieNode node, String key) {
		for(char c:key.toCharArray()) {
			int index = c - 'a';
			if(node.children[index] == null) {
				return false;
			}
			node = node.children[index];
		}
		return (node != null && node.isEndNode);
	}

	static class TrieNode {
		TrieNode[] children;
		boolean isEndNode;
		
		TrieNode() {
			children = new TrieNode[26];
			isEndNode = false;
			for(int i=0;i<26;i++) {
				children[i]=null;
			}
		}
	}
}
