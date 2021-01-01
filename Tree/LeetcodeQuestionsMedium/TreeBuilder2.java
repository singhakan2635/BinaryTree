package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

public class TreeBuilder2
{
    public Node root;
    private Integer[] a;
    public TreeBuilder2(Integer[] tree)
    {
        this.a= new Integer[tree.length];
        this.a = tree;
        //this.root = BuildTree(root,0);
    }

    public Node BuildTree(Node root, int index)
    {
        if (index>=a.length)
        {
            return root;
        }
        if (a[index]!=null)
        {
            Node temp = new Node(a[index]);
            root = temp;
            root.left = BuildTree(root.left,2*index+1);
            root.right = BuildTree(root.right,2*(index+1));
        }
        return root;

    }

    public void preorder(Node root)
    {
        if (root!=null)
        {
            System.out.print(root.val+" ");
            if (root.next==null)
                System.out.print("# ");
            preorder(root.left);
            preorder(root.right);

        }
    }
}
