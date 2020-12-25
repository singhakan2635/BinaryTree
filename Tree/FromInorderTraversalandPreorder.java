package Tree;

import java.util.HashMap;

public class FromInorderTraversalandPreorder
{
    private int[] inorder;
    private int[] preorder;
    private HashMap<Integer,Integer> iorderIndex;
    private int preIndex;
    public FromInorderTraversalandPreorder(int[] inorder, int[] preorder)
    {
        this.inorder = inorder;
        this.preorder = preorder;
        this.iorderIndex = new HashMap<>();
    }

    public TreeNode createsBinaryTree()
    {
        this.preIndex=0;
        for (int i=0;i<inorder.length;i++)
        {
            iorderIndex.put(inorder[i],i);
        }
        return(helper(0, inorder.length));
    }

    private TreeNode helper(int left, int right)
    {
        if (left==right )
        {
            return null;
        }
            int rootVal = preorder[preIndex];
            preIndex++;

            //int rootIndex = inorder(rootVal);
            int rootIndex = iorderIndex.get(rootVal);
            TreeNode root = new TreeNode(rootVal);
            root.left = helper(left,rootIndex);
            root.right = helper(rootIndex+1,right);

            return root;


    }
    /*
    private int inorder(int val)
    {
        for (int i=0;i<inorder.length;i++)
        {
            if (inorder[i]==val)
                return i;
        }
        return 0;
    }
     */

}
