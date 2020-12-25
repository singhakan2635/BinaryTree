package Tree.LeetcodeQuestions;

import Tree.TreeNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SecondMinimumNodesOfBinaryTree
{
    PriorityQueue<TreeNode> heap;
    public int findSecondMinimumValue(TreeNode root)
    {
        heap = new PriorityQueue<>(2, new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                return o1.val-o2.val;
            }
        });
        TreeNode x = heap.poll();
        TreeNode y = heap.poll();
        return y.val;

    }
    private void prorderTraversal(TreeNode root)
    {
        if (root==null)
            return;
        heap.add(root);
        prorderTraversal(root.left);
        prorderTraversal(root.right);
    }
}
