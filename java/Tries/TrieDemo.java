package Tries;

public class TrieDemo {

    public static class Trie {
        
        private static class TrieNode {
            private TrieNode[] children = new TrieNode[26]; // lower case English letters
            private boolean isEndOfWord = false;
        }

        private final TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        /**
         * Inserts a word into the Trie.
         * Time Complexity: O(L) where L is word length.
         */
        public void insert(String word) {
            TrieNode curr = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = c - 'a';
                if (curr.children[index] == null) {
                    curr.children[index] = new TrieNode();
                }
                curr = curr.children[index];
            }
            curr.isEndOfWord = true;
        }

        /**
         * Returns true if the word is exactly in the Trie.
         * Time Complexity: O(L)
         */
        public boolean search(String word) {
            TrieNode curr = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = c - 'a';
                if (curr.children[index] == null) return false;
                curr = curr.children[index];
            }
            return curr.isEndOfWord;
        }

        /**
         * Returns true if there is any word in the Trie that starts with the given prefix.
         * Time Complexity: O(P) where P is prefix length.
         */
        public boolean startsWith(String prefix) {
            TrieNode curr = root;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                int index = c - 'a';
                if (curr.children[index] == null) return false;
                curr = curr.children[index];
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        
        System.out.println("Inserting words: 'apple', 'app', 'banana'...");
        trie.insert("apple");
        trie.insert("app");
        trie.insert("banana");

        System.out.println("\nTesting exact search queries:");
        System.out.println("Search('apple')  : " + trie.search("apple")); // true
        System.out.println("Search('app')    : " + trie.search("app"));   // true
        System.out.println("Search('ap')     : " + trie.search("ap"));    // false
        System.out.println("Search('banana') : " + trie.search("banana")); // true
        System.out.println("Search('band')   : " + trie.search("band"));   // false

        System.out.println("\nTesting prefix startsWith queries:");
        System.out.println("startsWith('ap')   : " + trie.startsWith("ap"));   // true
        System.out.println("startsWith('ban')  : " + trie.startsWith("ban"));  // true
        System.out.println("startsWith('apple'): " + trie.startsWith("apple"));// true
        System.out.println("startsWith('cat')  : " + trie.startsWith("cat"));  // false
    }
}
