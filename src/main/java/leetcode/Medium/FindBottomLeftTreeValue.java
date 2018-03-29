package leetcode.Medium;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/find-bottom-left-tree-value
 */
public class FindBottomLeftTreeValue {

    int value;
    int level;
    int index;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0, 0);
        return value;
    }

    private void dfs(TreeNode root, int level, int index) {
        if(root == null) {
            return;
        }
        if(level > this.level) {
            this.level = level;
            this.index = index;
            this.value = root.val;
        }else if(level == this.level) {
            if(this.index >= index) {
                this.value = root.val;
            }
        }
        dfs(root.left, level + 1, index - 1);
        dfs(root.right, level + 1, index + 1);
    }

}
