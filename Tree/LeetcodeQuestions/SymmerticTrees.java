package com.practise.Tree.LeetcodeQuestions;

import com.practise.Tree.TreeNode;

public class SymmerticTrees
{
    TreeNode root;

    public SymmerticTrees(TreeNode root) {

    }
    public boolean isSymmetric(TreeNode root) {
        this.root = root;
        return helper(root,root);
    }
    private boolean helper(TreeNode t1, TreeNode t2)
    {
        if (t1==null && t2==null)
            return true;
        if (t1==null || t2==null)
            return false;
        boolean x = t1.val==t2.val;
        boolean l = helper(t1.left,t2.right);
        boolean r = helper(t1.right,t2.left);

        return x && l && r;

    }
}
