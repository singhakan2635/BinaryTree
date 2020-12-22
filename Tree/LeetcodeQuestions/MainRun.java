package com.practise.Tree.LeetcodeQuestions;

import com.practise.Tree.TreeNode;
import com.practise.Tree.TreeTraversalDFS;

public class MainRun
{
    public static void main(String[] args) {
        int[] inorder = new int[]{0,1,2,3,4,15,6,7,8};
        int[] postorder = new int[]{0,2,4,3,1,7,8,6,15};
        int[] preorder = new int[]{15,1,0,3,2,4,6,8,7};

        FromInorderandPostOrder bt = new FromInorderandPostOrder(inorder,postorder);
        TreeNode root = bt.createBinaryTree();

        TreeTraversalDFS traversalDFS = new TreeTraversalDFS();
        traversalDFS.Inorder(root);

    }
}
