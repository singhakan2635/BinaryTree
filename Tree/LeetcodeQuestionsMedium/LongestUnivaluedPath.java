package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

public class LongestUnivaluedPath
{
    int count;
    public int longestUnivaluePath(TreeNode root)
    {
        count=0;
        if (root==null) return count;
        helper(root,root.val);
        return count;
    }
    private int helper(TreeNode node,int val)
    {
        if (node==null)
            return 0;
        /*if (node.val!=val)
            return 0;*/
        int left= helper(node.left,node.val);
        int right = helper(node.right,node.val);
        count = Math.max(count,left+right);
        if (node.val==val)
            return Math.max(left,right)+1;
        return 0;

    }
}
