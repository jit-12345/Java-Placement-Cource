import java.util.*;

public class Trie_1 {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

   public static void insert(String word){//O(L),L=length of largest word
    Node curr=root;
    for (int level = 0; level < word.length(); level++) {
        int idx=word.charAt(level)-'a';
        if (curr.children[idx]==null) {
            curr.children[idx]=new Node();
        }
         curr=curr.children[idx];
    }
    curr.eow=true;
   }
   public static boolean search(String key){
        Node curr=root;
        for (int i = 0; i < key.length(); i++) {
            int idx=key.charAt(i)-'a';
            if (curr.children[idx]==null) {
               return false; 
            }
            curr=curr.children[idx];
        }
    return curr.eow == true;//for the in the word 'e' curr.eow==true,so it return true 
   }
    public static boolean wordbreak(String key){
        if (key.length()==0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0,i)) && wordbreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        //String words[] = { "the", "a", "there", "their", "any", "thee" };
        String words[]={"i","love","india","my","westbengal"};
        for (int level = 0; level < words.length; level++) {
            insert(words[level]);
        }
       //System.out.println(search("the"));
       System.out.println(search("i"));
       System.out.println(search("love"));
       System.out.println(search("my"));
       System.out.println(search("india"));

       System.out.println(wordbreak("ilovemyindia"));
       
    }
}
