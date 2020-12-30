package Tree.LeetcodeQuestionsEasy;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class DiameterofBinaryTree
{
    TreeNode root;
    int max;

    public DiameterofBinaryTree(TreeNode root) {
        this.root = root;
        max=0;
    }

    public int diameterOfBinaryTree()
    {
        helper(root);
        return max;
    }

    private int helper(TreeNode node)
    {
        if (node==null)
            return 0;

        int left = helper(node.left);
        int right = helper(node.right);

        max = Math.max(left+right,max);
        //System.out.println("Max is now "+max);

        return Math.max(left,right)+1;

    }

    public int diameterBFS()
    {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int max=0,max2 = 0;
        while (!queue.isEmpty())
        {
            int left=0,right=0;
            TreeNode curr = queue.poll();
            if (curr.left!=null)
            {
                left+=1;
                queue.offer(curr.left);
            }
            if (curr.right!=null)
            {
                right+=1;
                queue.offer(curr.right);
            }
            max = Math.max(left+right,max);
            max2 = Math.max(max,Math.max(left,right)+1);

        }
        return max2;
    }


}
