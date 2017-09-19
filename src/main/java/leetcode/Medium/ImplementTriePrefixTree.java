package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/implement-trie-prefix-tree
 */
public class ImplementTriePrefixTree {

    public class TreeNode {
        TreeNode[] nodes;
        boolean end;

        public TreeNode(boolean end) {
            this.nodes = new TreeNode[26];
            this.end = end;
        }

        public TreeNode add(char x) {
            int idx = x - 'a';
            if(nodes[idx] != null) {
                if(!nodes[idx].end && end) {
                    nodes[idx].end = true;
                }
                return nodes[idx];
            }
            nodes[idx] = new TreeNode(false);
            return nodes[idx];
        }

        public TreeNode find(char x) {
            int idx = x - 'a';
            return nodes[idx];
        }

        public boolean isEnd() {
            return end;
        }

        public TreeNode add(char x, boolean end) {
            int idx = x - 'a';
            if(nodes[idx] != null) {
                return nodes[idx];
            }
            nodes[idx] = new TreeNode(end);
            return nodes[idx];
        }
    }

    TreeNode root;

    public ImplementTriePrefixTree() {
        this.root = new TreeNode(false);
    }

    public void insert(String word) {
        if(word == null) {
            return;
        }
        char[] chars = word.toCharArray();
        TreeNode cur = root;
        for (int i = 0; i < chars.length; i++) {
            cur = cur.add(chars[i], i == chars.length - 1);
        }
    }

    public boolean search(String word) {
        if(word == null) {
            return false;
        }
        TreeNode result = find(word.toCharArray());
        return result != null && result.isEnd();
    }

    public TreeNode find(char[] chars) {
        TreeNode cur = root;
        for (char x : chars) {
            cur = cur.find(x);
            if(cur == null) {
                return null;
            }
        }
        return cur;
    }

    public boolean startsWith(String prefix) {
        if(prefix == null) {
            return false;
        }
        return  find(prefix.toCharArray()) != null;
    }

}
