public class trieclient{
    public static void main(String[] arg){
		trie trie=new trie();
		trie.addWord("arts");
		trie.addWord("art");
		trie.addWord("bug");
		trie.addWord("boy");
		trie.addWord("sea");
		trie.addWord("seen");
		trie.addWord("see");
		trie.addWord("amit");
		trie.display();
		
		trie.search("art");
		trie.search("ar");
		trie.search("arts");
		
	}
}