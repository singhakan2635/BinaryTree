package Tree.LeetcodeQuestions;

import Tree.TreeNode;

public class SumOfLeftLeaves
{
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root)
    {
        //int sum=0;
        helper(root);
        return sum;
    }
    private void helper(TreeNode node)
    {
        if (node==null)
            return;
        if (node.left!=null && node.left.left==null && node.left.right==null)
            sum +=node.left.val;
        if (node.left!=null)
            helper(node.left);
        if (node.right!=null)
            helper(node.right);


    }
}
