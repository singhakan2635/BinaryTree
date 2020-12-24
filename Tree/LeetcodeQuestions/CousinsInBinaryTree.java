package com.practise.Tree.LeetcodeQuestionsEasy;

import com.practise.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CousinsInBinaryTree
{
    public boolean isCousins(TreeNode root, int x, int y)
    {
        Var[] vars = new Var[2];
        int count=0;
        if (root==null)
            return false;
        int l=0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int size=queue.size();
            while (size>0)
            {
                TreeNode curr = queue.poll();
                if (curr.left!=null)
                {
                    if(curr.left.val==x || curr.left.val==y)
                    {
                        vars[count++] = new Var(curr.left,l,curr);
                    }
                    queue.offer(curr.left);
                }

                if (curr.right!=null)
                {
                    if(curr.right.val==x || curr.right.val==y)
                    {
                        vars[count++] =new Var(curr.right,l,curr);
                    }
                    queue.offer(curr.right);
                }
                size--;
            }

            l++;
        }
        if (vars[0].parent==vars[1].parent)
            return false;
        if (vars[0].depth!=vars[1].depth)
            return false;
        return true;
    }
    class Var
    {
        TreeNode root;
        int depth;
        TreeNode parent;

        public Var(TreeNode root, int depth, TreeNode parent) {
            this.root = root;
            this.depth = depth;
            this.parent = parent;
        }
    }
}
