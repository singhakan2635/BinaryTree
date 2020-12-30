package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

import java.util.*;

public class ZigZagLevel
{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level=0;
        boolean reverse= false;
        while (!queue.isEmpty())
        {
            if (level%2!=0)
            {
                reverse= true;
            }
            else reverse = false;
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size-->0)
            {
                TreeNode curr = queue.poll();
                list.add(curr.val);
                if (curr.left!=null) queue.offer(curr.left);
                if (curr.right!=null) queue.offer(curr.right);
            }
            level++;
            if (reverse)
            {
                Collections.reverse(list);
            }
            res.add(list);

        }
        return res;
    }

    public List<List<Integer>> zigzagLevelOrderDFS(TreeNode root)
    {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        helper(root,0,res);
        return res;
    }
    private void helper(TreeNode node, int level, List<List<Integer>> res)
    {
        if (level>= res.size())
        {
            res.add(new ArrayList<>());
        }
        if (level%2==0)
            res.get(level).add(node.val);
        else
            res.get(level).add(0,node.val);

        if (node.left!=null) helper(node.left,level+1,res);
        if (node.right!=null) helper(node.right,level+1,res);
    }

}
