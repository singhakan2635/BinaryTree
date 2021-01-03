package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

public class MaxPathSum
{
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root)
    {
        if (root==null)
            return ans;
        helper(root);
        return ans;
    }
    private int helper(TreeNode node)
    {
        if (node==null)
            return 0;
        int left = Math.max(helper(node.left),0);
        int right = Math.max(helper(node.right),0);

        ans = Math.max(ans,left+right+node.val);
        return node.val+Math.max(left,right);
    }
}
