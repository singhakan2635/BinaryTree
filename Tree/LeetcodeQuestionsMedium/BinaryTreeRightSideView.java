package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView
{
    List<Integer> res;
    int max=-1;
    public List<Integer> rightSideView(TreeNode root)
    {
        res = new ArrayList<>();
        if (root==null)
            return res;
        res.add(root.val);
        helper(root,0);
        return res;
    }
    private void helper(TreeNode root,int depth)
    {
        if (root==null)
            return;
        if (root.right!=null && depth>max)
        {
            max = Math.max(max,depth);
            res.add(root.right.val);
        }
        if (root.right==null && root.left!=null && depth>max)
        {
            max = Math.max(max,depth);
            res.add(root.left.val);
        }
        if (root.right!=null)
            helper(root.right,depth+1);
        if (root.left!=null)
        {
            helper(root.left,depth+1);
        }
    }
}
