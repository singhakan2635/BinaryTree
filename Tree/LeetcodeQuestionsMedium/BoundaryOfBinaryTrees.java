package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BoundaryOfBinaryTrees
{
    List<Integer> inorder = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();

    public List<Integer> boundaryOfBinaryTree(TreeNode root)
    {
        List<Integer> res = new ArrayList<>();
        if (root ==null)
            return res;
        res.add(root.val);
        inorder(root.left);
        postorder(root.right);
        addLeft(root);
        addRight(root);
        for (Integer num: inorder)
        {
            if (set.contains(num) && !res.contains(num))
            {
                res.add(num);
            }
        }
        return res;
    }
    private void inorder(TreeNode node)
    {
        if (node==null) return;
        if (node.left==null && node.right==null)
            set.add(node.val);
        inorder.add(node.val);
        inorder(node.left);
        inorder(node.right);

    }
    private  void postorder(TreeNode node)
    {
        if (node==null) return;
        if (node.left==null && node.right==null)
            set.add(node.val);

        postorder(node.left);
        postorder(node.right);
        inorder.add(node.val);
    }
    private void addLeft(TreeNode node)
    {
        if (node==null)
            return;
        if (node.left!=null)
        {
            set.add(node.left.val);
            addLeft(node.left);
        }
        if (node.left==null && node.right!=null)
        {
            set.add(node.right.val);
            addLeft(node.right);
        }

    }
    private void addRight(TreeNode node)
    {
        if (node==null)
            return;
        if (node.right!=null)
        {
            set.add(node.right.val);
            addRight(node.right);
        }
        if (node.right==null && node.left!=null)
        {
            set.add(node.left.val);
            addRight(node.left);
        }
    }

}
