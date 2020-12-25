package Tree;

public class MainClass
{
    public static void main(String[] args)
    {
        Integer[] arr = new Integer[]{15,1,6,0,3,null, 8,null,null,2,4,null, null, 7, null, null};
        TreeBuilder tree = new TreeBuilder(arr);
        tree.root = tree.BuildTree(tree.root,0);

        TreeTraversalDFS traversal = new TreeTraversalDFS();
        System.out.print("Inorder Traversal - ");
        traversal.Inorder(tree.root);
        System.out.println();

        System.out.print("Preorder Traversal - ");
        traversal.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal - ");
        traversal.postorder(tree.root);
        System.out.println();

        TreeTraversalBFS traversalBFS = new TreeTraversalBFS();
        System.out.print("Inorder Traversal - ");
        traversalBFS.inOrder(tree.root);
        System.out.println();

        System.out.print("Inorder Deque - ");
        traversalBFS.InOrderDeque(tree.root);
        System.out.println();

        System.out.print("Preorder Traversal - ");
        traversalBFS.preorderDeque(tree.root);
        System.out.println();

        System.out.print("Preorder Traversal Queue - ");
        traversalBFS.preorderQueue(tree.root);
        System.out.println();

        System.out.print("PostOrder Traversal - ");
        //traversalBFS.postOrder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal - ");
        traversalBFS.PostOrderDeque(tree.root);
        System.out.println();



        int[] inorder = new int[]{0,1,2,3,4,15,6,7,8};
        int[] preorder = new int[]{15,1,0,3,2,4,6,8,7};

        FromInorderTraversalandPreorder bt = new FromInorderTraversalandPreorder(inorder,preorder);
        tree.root = bt.createsBinaryTree();

        TreeTraversalDFS traversal1 = new TreeTraversalDFS();
        System.out.print("Inorder Traversal - ");
        traversal1.Inorder(tree.root);
        System.out.println();



    }
}
