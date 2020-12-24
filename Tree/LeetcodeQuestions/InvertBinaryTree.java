package com.practise.Tree.LeetcodeQuestionsEasy;

import com.practise.Tree.TreeNode;


public class InvertBinaryTree
{
    public TreeNode invertTree(TreeNode root)
    {
        if (root==null) return null;
        else
        {
            return helper(root);
        }
    }
    private TreeNode helper(TreeNode node1)
    {
        if (node1==null)
            return null;
        TreeNode node2 = new TreeNode(node1.val);
        //node2.val = node1.val;
        node2.left = helper(node1.right);
        node2.right = helper(node1.left);

        return node2;
    }
}
