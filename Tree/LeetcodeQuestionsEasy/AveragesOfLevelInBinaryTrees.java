package Tree.LeetcodeQuestionsEasy;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AveragesOfLevelInBinaryTrees
{
    public List<Double> averageOfLevels(TreeNode root)
    {
        List<Double> res = new ArrayList<>();
        if (root==null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int size=queue.size();
            int val = size;
            double sum=0;
            while (size-->0)
            {
                TreeNode curr = queue.poll();
                sum +=curr.val;
                if (curr.left!=null)
                    queue.offer(curr.left);
                if (curr.right!=null)
                    queue.offer(curr.right);
            }
            res.add(sum/val);
        }
        return res;
    }
}
