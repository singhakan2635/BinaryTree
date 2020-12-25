package Tree;

public class TreeTraversalDFS
{

    public void Inorder(TreeNode root)
    {
        if (root!=null)
        {
            Inorder(root.left);
            System.out.print(root.val +" ");
            Inorder(root.right);
        }
    }

    public void preorder(TreeNode root)
    {
        if (root!=null)
        {
            System.out.print(root.val+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder(TreeNode root)
    {
        if (root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val+" ");
        }
    }
}
