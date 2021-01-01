package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTree
{
    List<Integer> prorder;
    public void flatten(TreeNode root)
    {
        prorder = new ArrayList<>();
        helper(root);
        for (int i=1;i<prorder.size();i++)
        {
            root.right = new TreeNode(prorder.get(i));
            root.left =null;
            root = root.right;
        }

    }
    private void helper(TreeNode root)
    {
        if (root==null)
            return;
        prorder.add(root.val);
        helper(root.left);
        helper(root.right);
    }
    private TreeNode prev=null;
    public void flatten2(TreeNode root)
    {
        if (root==null)
            return;
        flatten2(root.right);
        flatten2(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

}
