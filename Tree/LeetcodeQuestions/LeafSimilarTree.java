package Tree.LeetcodeQuestions;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeafSimilarTree
{
    public boolean leafSimilar(TreeNode root1, TreeNode root2)
    {
        List<String> s1 = new ArrayList<>();
        List<String> s2 =new ArrayList<>();
        helper(root1,s1);
        helper(root2,s2);
        System.out.println("s1 is "+s1);
        System.out.println("s2 is "+s2);
        return s1.equals(s2);
    }
    private void helper(TreeNode node,List list)
    {
        if (node==null)
            return;
        if (node.left==null && node.right==null)
            list.add(node.val);
        helper(node.left,list);
        helper(node.right,list);
    }

}
