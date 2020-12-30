package Tree.LeetcodeQuestionsEasy;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PathSum
{
    public boolean hasPathSum(TreeNode root, int sum)
    {
        if (root==null)
            return false;
        return helper(root,sum);
    }
    private boolean helper(TreeNode node, int new_sum)
    {
        new_sum -= node.val;
        if (node.left==null && node.right==null)
            return (new_sum==0);
        return helper(node.left,new_sum) || helper(node.right,new_sum);
    }

    public boolean pathSumBFS(TreeNode root,int sum)
    {
        if (root==null)
            return false;
        Queue<QueueVar> queue = new LinkedList<>();
        queue.offer(new QueueVar(root,sum));
        //int new_sum =-1;
        while (!queue.isEmpty())
        {
            QueueVar var = queue.poll();
            //new_sum = var.s;
            var.s -=var.node.val;
            if (var.node.right==null && var.node.left==null && var.s==0)
                return true;
            if (var.node.left!=null)
                queue.offer(new QueueVar(var.node.left,var.s));
            if (var.node.right!=null)
                queue.offer(new QueueVar(var.node.right,var.s));
        }
        return false;
    }
    class QueueVar
    {
        TreeNode node;
        int s;

        public QueueVar(TreeNode node, int s) {
            this.node = node;
            this.s = s;
        }
    }
}
