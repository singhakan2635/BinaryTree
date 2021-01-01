package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

public class DistributeTheCoinsInBinaryTree
{
    int count;
    public int distributeCoins(TreeNode root)
    {
        if (root==null) return 0;
        helper(root);
        return count;
    }
    private int helper(TreeNode root)
    {
        if (root==null)
            return 0;

        int coin = helper(root.left) + helper(root.right);

        if (root.val==0) coin-=1;
        else
        {
            coin +=root.val-1;
        }
        count +=Math.abs(coin);
        return coin;
    }
}
