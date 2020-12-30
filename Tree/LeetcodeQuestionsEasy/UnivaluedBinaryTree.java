package Tree.LeetcodeQuestionsEasy;

import Tree.TreeNode;

public class UnivaluedBinaryTree
{
    int first,second;
    public boolean isUnivalTree(TreeNode root)
    {
        first = root.val;
        second = first;
        return helper(root);
    }
    private boolean helper(TreeNode node)
    {
        if (node==null)
            return true;
        if (node.val!=first)
        {
            second = node.val;
            return false;
        }
        return helper(node.left) && helper(node.right);
    }
}
