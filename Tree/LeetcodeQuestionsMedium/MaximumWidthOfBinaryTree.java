package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree
{
    public int widthOfBinaryTree(TreeNode root)
    {
        int ans =0;
        if (root==null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            ans =Math.max(ans,size);
            while (size-->0)
            {
                TreeNode curr = queue.poll();
                if (curr!=null)
                {
                    if (curr.left!=null)
                        queue.offer(curr.left);
                    else queue.offer(null);
                    if (curr.right!=null)
                        queue.offer(curr.right);
                    else queue.offer(null);
                }
                //if (cu)
            }
        }
        return 0;
    }
}
