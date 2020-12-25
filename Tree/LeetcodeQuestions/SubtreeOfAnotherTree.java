package Tree.LeetcodeQuestions;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SubtreeOfAnotherTree
{

    public SubtreeOfAnotherTree() {
    }


    public boolean isSubtree(TreeNode s, TreeNode t)
    {
        if (s==null || t==null)
            return false;
        if (s==null && t==null)
            return true;
        if (s.val==t.val)
            return helper(s,t);
        else
        {
            return helper(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
        }
    }

    private boolean helper(TreeNode s,TreeNode t)
    {
        if (s==null && t==null)
            return true;
        if (s==null || t==null)
            return false;

        return (s.val==t.val) && helper(s.left,t.left) && helper(s.right,t.right);
    }

    public boolean isSubtreeBFS(TreeNode s,TreeNode t)
    {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(s);
        while (!queue.isEmpty())
        {
            TreeNode curr = queue.poll();
            if (helper(curr,t))
            {
                return true;
            }
            if (curr.left!=null)
                queue.offer(curr.left);
            if (curr.right!=null)
                queue.offer(curr.right);
        }
        return false;
    }
}
