package Tree.LeetcodeQuestionsEasy;

import Tree.TreeNode;

public class SecondMinimumNodesOfBinaryTree
{
    int[] arr;
    public int findSecondMinimumValue(TreeNode root)
    {
        arr = new int[]{-1,-1};
        arr[0] =root.val;
        prorderTraversal(root);

        return arr[1];

    }
    private void prorderTraversal(TreeNode root)
    {
        if (root==null)
            return;
        if (root.val<arr[0])
            arr[0] = root.val;
        else if (root.val> arr[0] && (arr[1]<0 || root.val<arr[1]))
            arr[1]=root.val;

        prorderTraversal(root.left);
        prorderTraversal(root.right);
    }
}
