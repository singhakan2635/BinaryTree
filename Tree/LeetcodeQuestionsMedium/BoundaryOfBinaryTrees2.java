package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoundaryOfBinaryTrees2
{
    List<Integer> res;
    private boolean isLeaf(TreeNode node)
    {
        if (node==null) return false;
        return node.left==null && node.right==null;
    }
    public List<Integer> boundaryOfBinaryTree(TreeNode root)
    {
        res = new ArrayList<>();
        if (root==null)
            return res;
        if (!isLeaf(root))
            res.add(root.val);
        addLeft(root.left);
        addLeaves(root);
        Stack<Integer> stack = new Stack<>();
        addRight(root.right,stack);
        while (!stack.empty())
        {
            res.add(stack.pop());
        }
        return res;

    }
    private void addLeft(TreeNode node)
    {
        if (node==null)
            return;
        if (!isLeaf(node))
            res.add(node.val);
        if (node.left!=null)
            addLeft(node.left);
        else addLeft(node.right);
    }
    private void addLeaves(TreeNode node)
    {
        if (isLeaf(node))
        {
            res.add(node.val);
        }
        if (node.left!=null) addLeaves(node.left);
        if (node.right!=null) addLeaves(node.right);
    }
    private void addRight(TreeNode node, Stack<Integer> stack)
    {
        if (node==null) return;
        if (!isLeaf(node))
        {
            stack.push(node.val);
        }
        if (node.right!=null)
            addRight(node.right,stack);
        else
            addRight(node.left,stack);


    }
}
