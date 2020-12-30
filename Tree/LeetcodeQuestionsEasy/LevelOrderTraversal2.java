package Tree.LeetcodeQuestionsEasy;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal2
{
    //List<List<Integer>> res;
    public List<List<Integer>> levelOrderBottom(TreeNode root)
    {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            while (size>0)
            {
                TreeNode curr= queue.poll();
                if (curr!=null)
                    temp.add(curr.val);
                if (curr.left!=null)
                    queue.offer(curr.left);
                if (curr.right!=null)
                    queue.offer(curr.right);
                size--;
            }
            res.add(0,temp);
        }
        return res;
    }
}
