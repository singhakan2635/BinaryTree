package com.practise.Tree;


import java.util.*;

public class TreeTraversalBFS
{
    Stack<TreeNode> stack;
    Deque<TreeNode> deque;
    Queue<TreeNode> queue;

    public void inOrder(TreeNode root)
    {
        stack = new Stack<>();
        TreeNode curr = root;

        while (!stack.empty() || curr!=null)
        {
            if (curr!=null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else
            {
                curr = stack.pop();
                System.out.print(curr.val+" ");
                curr = curr.right;
            }
        }

    }

    public void InOrderDeque(TreeNode root)
    {
        deque = new LinkedList<>();
        TreeNode curr = root;

        while (!deque.isEmpty() || curr!=null)
        {
            if (curr!=null)
            {
                deque.addLast(curr);
                curr = curr.left;
            }
            else
            {
                curr = deque.removeLast();
                System.out.print(curr.val+" ");
                curr = curr.right;
            }
        }
    }

    public void preorderDeque(TreeNode root)
    {
        deque = new LinkedList<>();
        TreeNode curr = root;
        deque.addLast(curr);
        while (!deque.isEmpty())
        {
            curr = deque.removeFirst();
            System.out.print(curr.val+" ");
            if (curr.left!=null)
            {
                deque.addLast(curr.left);
            }
            if (curr.right!=null)
            {
                deque.addLast(curr.right);
            }
        }
    }

    public void preorderQueue(TreeNode root)
    {
        queue = new LinkedList<>();
        TreeNode curr = root;
        queue.add(curr);
        while (!queue.isEmpty())
        {
            curr = queue.poll();
            System.out.print(curr.val+" ");
            if (curr.left!=null)
            {
                queue.add(curr.left);
            }
            if (curr.right!=null)
            {
                queue.add(curr.right);
            }
        }
    }

    /**
     * We would process the node and pop it off the stack in these 3 cases:
     *
     *    1. The node is a leaf node (no children)
     *    2. We just traverse up the tree from the left and no right child exist.
     *    3. We just traverse up the tree from the right.
     * @param root
     */

    public void postOrder(TreeNode root)
    {
        stack = new Stack<>();
        //TreeNode curr = root;
        stack.push(root);
        while (!stack.empty())
        {
            TreeNode curr = stack.peek();
            if (curr.left==null && curr.right==null)
            {
                TreeNode node = stack.pop();
                System.out.print(node.val+" ");
            }
            if (curr.right!=null)
            {
                stack.push(curr.right);
                curr.right =null;
            }
            if (curr.left!=null)
            {
                stack.push(curr.left);
                curr.left=null;
            }
        }
    }

    public void PostOrderDeque(TreeNode root)
    {
        deque = new ArrayDeque<>();
        deque.push(root);
        while (!deque.isEmpty())
        {
            //System.out.println("size - "+deque.size());
            TreeNode curr = deque.peek();
            if (curr.left==null && curr.right==null)
            {
                TreeNode node = deque.pop();
                System.out.print(node.val+" ");
            }
            if (curr.right!=null)
            {
                //System.out.println("right -"+curr.right.val);
                deque.push(curr.right);
                curr.right=null;
            }
            if (curr.left!=null)
            {
                deque.push(curr.left);
                curr.left=null;
            }

        }
    }
}
