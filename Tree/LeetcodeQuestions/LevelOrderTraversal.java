package Tree.LeetcodeQuestions;

import Tree.TreeNode;

import java.util.*;

public class LevelOrderTraversal
{
    List<List<Integer>> res;
    TreeNode root;
    Queue<TreeNode> queue;
    int l =0;

    public LevelOrderTraversal(TreeNode root) {
        this.root = root;

    }

    public List<List<Integer>> LevelOrder()
    {
        res = new ArrayList<>();
        queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            res.add(new ArrayList<>());
            int size = queue.size();
            while(size>0 && !queue.isEmpty())
            {
                TreeNode curr = queue.poll();
                res.get(l).add(curr.val);

                if (curr.left!=null)
                {
                    queue.offer(curr.left);
                }
                if (curr.right!=null)
                {
                    queue.offer(curr.right);
                }
                size--;
            }
            l++;
        }
        return res;
    }

    public List<List<Integer>> levelOrder2()
    {
        res = new ArrayList<>();
        helper(root,0);
        return res;
    }

    private void helper(TreeNode node,int level)
    {
        if (level==res.size())
            res.add(new ArrayList<>());

        res.get(level).add(node.val);

        if (node.left!=null)
        {
            helper(node.left,level+1);
        }
        if (node.right!=null)
        {
            helper(node.right,level+1);
        }

    }






}
