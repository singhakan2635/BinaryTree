package com.practise.Tree.LeetcodeQuestionsEasy;

import com.practise.Tree.TreeNode;

public class SameTree
{
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        return helper(p,q);
    }
    private boolean helper(TreeNode p, TreeNode q)
    {
        if (p==null && q==null)
            return true;
        if (p==null || q==null)
            return false;
        return (p.val==q.val) && helper(p.left,q.left) && helper(p.right,q.right);
    }
}
