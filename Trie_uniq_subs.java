import java.util.*;

public class Trie_uniq_subs {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = (word.charAt(i) - 'a');
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
        
    }

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }
        return count + 1;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                // backtrack
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        // this is for unique substrings

        // String str="ababa";
        // for (int i = 0; i < str.length(); i++) {
        // insert(str.substring(i));
        // }
        // System.out.println(countNode(root));

        // this is for longest word off all prefixes

        String words[] = { "a", "banana", "app", "ap", "apply", "apple" };
        for (int i = 0; i < words.length; i++) {
            
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
