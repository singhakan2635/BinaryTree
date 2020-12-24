package com.practise.Tree.LeetcodeQuestionsEasy;

import com.practise.Tree.TreeNode;

public class MergeTwoBinaryTrees
{
    TreeNode t1;
    TreeNode t2;

    public MergeTwoBinaryTrees(TreeNode t1, TreeNode t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    public TreeNode mergeTrees()
    {
        return helper(t1,t2);
    }
    private TreeNode helper(TreeNode node1, TreeNode node2)
    {
        if (node1==null && node2==null)
            return null;
        else if (node1==null && node2!=null)
            return node2;
        else if (node2==null && node1!=null)
            return node1;

        TreeNode root = new TreeNode(node1.val+node2.val);
        root.left = helper(node1.left,node2.left);
        root.right = helper(node2.right,node2.right);

        return root;


    }

    public TreeNode MergedTreeDFS2()
    {
        return helper2(t1,t2);
    }
    private TreeNode helper2(TreeNode node1, TreeNode node2)
    {
        if (node1==null) return node2;
        if (node2==null) return node1;

        node1.val += node2.val;
        node1.left = helper2(node1.left,node2.left);
        node1.right = helper2(node1.right,node2.right);

        return node1;
    }

    class Trees
    {
        TreeNode node1;
        TreeNode node2;

        public Trees(TreeNode node1, TreeNode node2) {
            this.node1 = node1;
            this.node2 = node2;
        }
    }
}
