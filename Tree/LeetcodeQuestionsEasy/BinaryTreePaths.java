package Tree.LeetcodeQuestionsEasy;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreePaths
{

    public List<String> binaryTreePaths(TreeNode root)
    {
        List<String> res=  new ArrayList<>();
        if (root==null)
            return res;
        helper(res,root,root.val+"");
        return res;
    }
    private void helper(List<String> res,TreeNode node, String path)
    {
        if (node== null)
            return;
        if (node.left==null && node.right==null)
        {
            res.add(path);
        }
        if (node.left!=null)
            helper(res,node.left,path+"->"+node.left.val);
        if (node.right!=null)
            helper(res,node.right,path+"->"+node.right.val);
    }

    public List<String> BinaryTreepaths(TreeNode root)
    {
        LinkedList<String> res = new LinkedList<>();
        Queue<QueuePath> queue = new LinkedList<>();
        if (root==null) return res;
        queue.offer(new QueuePath(root,root.val+""));
        while (!queue.isEmpty())
        {
            QueuePath path = queue.poll();
            if (path.node.left==null && path.node.right==null)
            {
                res.add(path.s);
            }
            if (path.node.left!=null)
                queue.offer(new QueuePath(path.node.left,path.s+"->"+path.node.left.val));
            if (path.node.right!=null)
                queue.offer(new QueuePath(path.node.right,path.s+"->"+path.node.right.val));
        }
        return res;
    }
    class QueuePath
    {
        TreeNode node;
        String s;

        public QueuePath(TreeNode node, String s) {
            this.node = node;
            this.s = s;
        }
    }
}
