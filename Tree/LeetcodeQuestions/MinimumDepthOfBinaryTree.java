package com.practise.Tree.LeetcodeQuestionsEasy;

import com.practise.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree
{
    public int minDepth(TreeNode root)
    {
        return helper(root);
    }
    private int helper(TreeNode node)
    {
        if (node==null)
            return 0;
        if (node.left==null && node.right==null)
            return 1;
        int min = Integer.MAX_VALUE;
        if (node.left!=null)
            min = Math.min(helper(node.left),min);
        if (node.right!=null)
            min = Math.min(helper(node.right),min);

        return min+1;
    }

    public int minDepthBFS(TreeNode root)
    {
        Queue<queueDepth> queue = new LinkedList<>();
        if (root==null)
            return 0;
        queue.offer(new queueDepth(root,1));
        while (!queue.isEmpty())
        {
            queueDepth curr = queue.poll();
            if (curr.node!=null)
            {
                if (curr.node.right==null && curr.node.left==null)
                    return curr.depth;
                if (curr.node.left!=null)
                    queue.offer(new queueDepth(curr.node.left,curr.depth+1));
                if (curr.node.right!=null)
                    queue.offer(new queueDepth(curr.node.right,curr.depth+1));
            }

        }
        return 0;
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
}
