package Tree.LeetcodeQuestionsEasy;

import Tree.TreeNode;

public class MaximumDepthofBinaryTree
{
    int max=0;
    public int maxDepth(TreeNode root)
    {
        helper(root);
        return max;
    }
    private int helper(TreeNode node)
    {
        if (node==null)
            return 0;
        int left = helper(node.left);
        int right = helper(node.right);
        max= Math.max(Math.max(left,right)+1,max);

        return Math.max(left,right)+1;
    }
}
