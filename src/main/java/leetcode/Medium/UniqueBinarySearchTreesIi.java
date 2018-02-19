package leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/unique-binary-search-trees-ii
 */
public class UniqueBinarySearchTreesIi {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public List<TreeNode> generateTrees(int n) {
        if(n < 1) {
            return new ArrayList<>();
        }
        return construct(1, n);
    }

    private List<TreeNode> construct(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if(start > end) {
            list.add(null);
            return list;
        }
        for (int i = start; i <= end ; i++) {
            List<TreeNode> leftList = construct(start, i - 1);
            List<TreeNode> rightList = construct(i + 1, end);
            for (TreeNode leftNode : leftList) {
                for (TreeNode rightNode : rightList) {
                    TreeNode node = new TreeNode(i);
                    node.left = leftNode;
                    node.right = rightNode;
                    list.add(node);
                }
            }
        }
        return list;
    }

}
