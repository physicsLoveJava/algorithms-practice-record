package leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/add-and-search-word-data-structure-design
 */
public class AddAndSearchWordDataStructureDesign {

    public static class TreeNode {
        private TreeNode[] nodes;
        private boolean end;

        public TreeNode(boolean end) {
            nodes = new TreeNode[26];
            this.end = end;
        }

        public TreeNode add(char aChar, boolean end) {
            int idx = aChar - 'a';
            TreeNode node = nodes[idx];
            if(node != null) {
                if(!node.end && end) {
                    node.end = true;
                }
                return node;
            }
            nodes[idx] = new TreeNode(end);
            return nodes[idx];
        }

        public TreeNode find(char aChar) {
            int idx = aChar - 'a';
            return nodes[idx];
        }

        public boolean isEnd() {
            return end;
        }

        public TreeNode[] getChildren() {
            List<TreeNode> list = new ArrayList<TreeNode>();
            for (int i = 0; i < nodes.length; i++) {
                if(nodes[i] != null) {
                    list.add(nodes[i]);
                }
            }
            return list.toArray(new TreeNode[0]);
        }
    }

    private TreeNode root;

    public AddAndSearchWordDataStructureDesign() {
        root = new TreeNode(false);
    }

    public void addWord(String word) {
        if(word == null) {
            return;
        }
        if(!search(word)) {
            char[] chars = word.toCharArray();
            TreeNode cur = root;
            for (int i = 0; i < chars.length; i++) {
                if(cur != null) {
                    cur = cur.add(chars[i], i == chars.length - 1);
                }
            }
        }
    }

    public boolean search(String word) {
        if(word == null) {
            return false;
        }
        char[] chars = word.toCharArray();
        return search(chars, 0, root);
    }

    private boolean search(char[] chars, int start, TreeNode node) {
        if(start == chars.length) {
            return node != null && node.isEnd();
        }
        TreeNode cur = node;
        for (int i = start; i < chars.length; i++) {
            if(chars[i] == '.') {
                TreeNode[] nodes = cur.getChildren();
                for (int j = 0; j < nodes.length; j++) {
                    if(search(chars, i + 1, nodes[j])) {
                        return true;
                    }
                }
                return false;
            }else {
                cur = cur.find(chars[i]);
                if(cur == null) {
                    return false;
                }
            }
        }
        return cur != null && cur.isEnd();
    }

}
