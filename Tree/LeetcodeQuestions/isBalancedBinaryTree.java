package com.practise.Tree.LeetcodeQuestionsEasy;

import com.practise.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class isBalancedBinaryTree
{
    int max=0;
    public boolean isBalanced(TreeNode root)
    {
        if (root==null)
            return true;
        if (Math.abs(height(root.left)-height(root.right))>1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int minDepth(TreeNode node)
    {
        if (node==null)
            return 0;
        Queue<queueDepth> queue = new LinkedList<>();
        queue.offer(new queueDepth(node,0));
        while (!queue.isEmpty())
        {
            queueDepth curr = queue.poll();
            if (curr.node.left==null && curr.node.right==null)
                return curr.depth;
            if (curr.node.left!=null)
                queue.offer(new queueDepth(curr.node.left,curr.depth+1));
            if (curr.node.right!=null)
                queue.offer(new queueDepth(curr.node.right,curr.depth+1));

        }
        return 0;
    }
    private int maxDepth(TreeNode node)
    {
        if (node==null)
            return 0;
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        max= Math.max(Math.max(left,right)+1,max);

        return Math.max(left,right)+1;
    }
    class queueDepth
    {
        TreeNode node;
        int depth;

        public queueDepth(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    private int height(TreeNode node)
    {
        if (node==null)
            return -1;

        return 1+ Math.max(height(node.left),height(node.right));
    }

}
