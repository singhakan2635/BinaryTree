package Tree.LeetcodeQuestionsEasy;

import Tree.TreeNode;

public class sumofLeadtoRootBinary
{
    private int sum;
    public int sumRootToLeaf(TreeNode root)
    {
        sum=0;
        helper(root,root.val+"");
        return sum;
    }
    private void helper(TreeNode node, String path)
    {
        if (node==null)
            return;
        if (node.left==null && node.right==null)
        {
            sum += Integer.parseInt(path,2);
        }
        if (node.left!=null)
            helper(node.left,path+node.left.val);
        if (node.right!=null)
            helper(node.right,path+node.right.val);

    }

}
