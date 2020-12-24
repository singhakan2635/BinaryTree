package com.practise.Tree.LeetcodeQuestionsEasy;

import com.practise.Tree.TreeNode;

import java.util.HashMap;

public class FromInorderandPostOrder
{
    private int[] inorder;
    private int[] postOrder;
    private int postIndex;
    private HashMap<Integer,Integer> map;

    public FromInorderandPostOrder(int[] inorder,int[] postOrder)
    {
        this.inorder=inorder;
        this.postOrder = postOrder;
        this.postIndex=postOrder.length-1;
        map = new HashMap<>();
    }

    public TreeNode createBinaryTree()
    {
        for (int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return helper(0,inorder.length);
    }

    private TreeNode helper(int left, int right)
    {
        if (left==right)
            return null;

        int rootVal = postOrder[postIndex--];
        TreeNode root = new TreeNode(rootVal);
        int index = map.get(rootVal);
        root.right = helper(index+1,right);
        root.left = helper(left,index);

        return root;
    }


}
