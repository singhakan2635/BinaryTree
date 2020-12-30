package Tree.LeetcodeQuestionsEasy;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LonelyNodes
{
    TreeNode root;
    List<Integer> res;
    public LonelyNodes(TreeNode root)
    {
        this.root = root;
    }
    public List<Integer> getLonelyNodes()
    {
        this.res = new ArrayList<>();
        helper(root);
        return res;

    }
    private void helper(TreeNode node)
    {
        if (node==null)
        {
            return;
        }
        if (node.left!=null && node.right==null)
        {
            res.add(node.left.val);
        }
        if (node.left==null && node.right!=null)
        {
            res.add(node.right.val);
        }
        if (node.left!=null) helper(node.left);
        if (node.right!=null) helper(node.right);
    }

    public List<Integer> getLonelyNodesBFS()
    {
        this.res = new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            TreeNode node = queue.poll();

            if (node.left!=null && node.right==null)
            {
                res.add(node.left.val);
            }
            if (node.right!=null && node.left==null)
            {
                res.add(node.right.val);
            }
            if (node.left!=null) queue.offer(node.left);
            if (node.right!=null) queue.offer(node.right);

        }
        return res;
    }
}
