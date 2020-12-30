package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

import java.util.*;

public class AllNodesDistanceKinBinaryTree
{
    Map<TreeNode,List<TreeNode>> map;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K)
    {
        map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        if (root==null || K<0) return res;
        buildTree(root,null);
        if (!map.containsKey(target)) return res;
        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        visited.add(target);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            if (K==0)
            {
                while (size-->0)
                {
                    res.add(queue.poll().val);
                }
                return res;
            }
            while (size-->0)
            {
                TreeNode curr = queue.poll();
                for (TreeNode vertex: map.get(curr))
                {
                    if (visited.contains(vertex)) continue;
                    visited.add(vertex);
                    queue.add(vertex);

                }
            }
            K--;
        }
        return res;
    }
    private void buildTree(TreeNode node, TreeNode parent)
    {
        if (node==null)
            return;
        if (!map.containsKey(node))
        {
            map.put(node,new ArrayList<>());
            if (parent!=null)
            {
                map.get(node).add(parent);
                map.get(parent).add(node);
            }
            buildTree(node.left,node);
            buildTree(node.right,node);
        }
    }
}
