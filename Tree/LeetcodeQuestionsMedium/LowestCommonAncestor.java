package Tree.LeetcodeQuestionsMedium;

import Tree.TreeBuilder;
import Tree.TreeNode;

import java.util.*;

public class LowestCommonAncestor
{

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        if (p==root || q==root)
            return root;
        HashMap<TreeNode,TreeNode> parentsMap = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        parentsMap.put(root,null);
        queue.offer(root);
        while (!parentsMap.containsKey(p) || !parentsMap.containsKey(q))
        {
            TreeNode curr = queue.poll();
            if (curr.left!=null)
            {
                parentsMap.put(curr.left,curr);
                queue.offer(curr.left);
            }
            if (curr.right!=null)
            {
                parentsMap.put(curr.right,curr);
                queue.offer(curr.right);
            }
        }
        HashSet<TreeNode> parents = new HashSet<>();
        while (p!=null)
        {
            parents.add(p);
            p = parentsMap.get(p);
        }
        while (!parents.contains(q))
        {
            q = parentsMap.get(q);
        }
        return q;
    }
    private TreeNode ans;
    public TreeNode lowestCommonAncestorDFS(TreeNode root, TreeNode p, TreeNode q)
    {
        return helper(root,p,q);
    }
    private TreeNode helper(TreeNode node, TreeNode p, TreeNode q)
    {
        if (node==null)
            return null;
        if (node==p || node == q)
        {
            return node;
        }
        TreeNode left = helper(node.left,p,q);
        TreeNode right = helper(node.right,p,q);

        if (left!=null && right!=null)
            return node;

        if (left!=null)
            return left;
        else return right;
    }


}
