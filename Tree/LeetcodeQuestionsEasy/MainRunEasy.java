package Tree.LeetcodeQuestionsEasy;

import Tree.TreeBuilder;
import Tree.TreeNode;
import Tree.TreeTraversalDFS;

public class MainRunEasy
{
    public static void main(String[] args) {
        int[] inorder = new int[]{0,1,2,3,4,15,6,7,8};
        int[] postorder = new int[]{0,2,4,3,1,7,8,6,15};
        int[] preorder = new int[]{15,1,0,3,2,4,6,8,7};

        FromInorderandPostOrder bt = new FromInorderandPostOrder(inorder,postorder);
        TreeNode root = bt.createBinaryTree();

        TreeTraversalDFS traversalDFS = new TreeTraversalDFS();
        //traversalDFS.Inorder(root);
        /** Building tree from array*/
        /*
        Integer[] arr = new Integer[]{15,1,6,0,3,null, 8,null,null,2,4,null, null, 7, null, null};
        TreeBuilder treeBuilder = new TreeBuilder(arr);
        treeBuilder.root = treeBuilder.BuildTree(treeBuilder.root,0);

         */

        /**Level Order Binary Tree Traversal */
        /*
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal(treeBuilder.root);
        List<List<Integer>> res = levelOrderTraversal.LevelOrder();
        List<List<Integer>> res2 = levelOrderTraversal.levelOrder2();
        System.out.println("LevelOrder - "+res);
        System.out.println("LevelOrder2 - " + res2);

         */


        /** Find All The Lonely Nodes */
        Integer[] arr1 = new Integer[]{11,99,88,77,null,null,66,55,null,null,44,33,null,null,22};
        TreeBuilder treeBuilder = new TreeBuilder(arr1);
        treeBuilder.root = treeBuilder.BuildTree(treeBuilder.root,0);
        LonelyNodes lonelyNodes = new LonelyNodes(treeBuilder.root);
        System.out.println(lonelyNodes.getLonelyNodes());
        /** Using BFS */
        System.out.println(lonelyNodes.getLonelyNodesBFS());

        /** Merge Two Binary Tree into one */
        Integer[] tree1 = new Integer[]{1,3,2,5,null,null,null};
        Integer[] tree2 = new Integer[]{2,1,3,null,4,null,7};
        TreeBuilder treeBuilder1 = new TreeBuilder(tree1);
        TreeBuilder treeBuilder2 = new TreeBuilder(tree2);
        treeBuilder1.root = treeBuilder1.BuildTree(treeBuilder1.root,0);
        treeBuilder2.root = treeBuilder2.BuildTree(treeBuilder2.root, 0);
        MergeTwoBinaryTrees merge = new MergeTwoBinaryTrees(treeBuilder1.root,treeBuilder2.root);
        TreeNode node = merge.MergedTreeDFS2();
        traversalDFS.preorder(node);

        /** Diameter of a Binary Tree */
        Integer[] tree = new Integer[]{15,1,6,0,3,null, 8,null,null,2,4,null, null, 7, null, null};
        TreeBuilder treeBuilder3 = new TreeBuilder(tree);
        treeBuilder3.root = treeBuilder3.BuildTree(treeBuilder3.root, 0);
        DiameterofBinaryTree db = new DiameterofBinaryTree(treeBuilder3.root);
        System.out.println(db.diameterOfBinaryTree());

        /**Subtree of Another Tree */
        Integer[] tree_s = new Integer[]{1,0,1,0,1,0,1};
        Integer[] tree_t = new Integer[]{2,null,3,null,4,null,5,null,6};
        TreeBuilder build1 = new TreeBuilder(tree_t);
        build1.root =build1.BuildTree(build1.root, 0);

        /**Level Order traversal 2 */
        Integer[] treex = new Integer[]{3,9,20,null,null,15,7};
        TreeBuilder treeBuilder4 = new TreeBuilder(treex);
        treeBuilder4.root = treeBuilder4.BuildTree(treeBuilder4.root,0);
        LevelOrderTraversal2 level = new LevelOrderTraversal2();
        System.out.println(level.levelOrderBottom(treeBuilder4.root));

        /**PathSum Question BinaryTree using Recursion and BFS */
        Integer[] path = new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,1};
        TreeBuilder treeBuilder5 = new TreeBuilder(path);
        treeBuilder5.root = treeBuilder5.BuildTree(treeBuilder5.root, 0);
        PathSum sum = new PathSum();
        System.out.println(sum.hasPathSum(treeBuilder5.root,22));
        System.out.println(sum.pathSumBFS(treeBuilder5.root,22));

        /*BinaryTree Paths using Recursion and BFS */
        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        System.out.println(binaryTreePaths.binaryTreePaths(treeBuilder5.root));

        System.out.println(binaryTreePaths.BinaryTreepaths(treeBuilder5.root));

        /**Maximum Depth of the Binary Tree */
        MaximumDepthofBinaryTree maxDep = new MaximumDepthofBinaryTree();
        System.out.println(maxDep.maxDepth(treeBuilder5.root));
        System.out.println(maxDep.maxDepth(treeBuilder3.root));

        /**Sum of Left Leaves */
        SumOfLeftLeaves sum1 = new SumOfLeftLeaves();
        System.out.println(sum1.sumOfLeftLeaves(treeBuilder3.root));

        /** Sum of Root to Leaf in Binary */
        TreeBuilder treeBuilder6 = new TreeBuilder(tree_s);
        treeBuilder6.root = treeBuilder6.BuildTree(treeBuilder6.root, 0);
        sumofLeadtoRootBinary sumofLeadtoRootBinary =new sumofLeadtoRootBinary();
        System.out.println(sumofLeadtoRootBinary.sumRootToLeaf(treeBuilder6.root));


        /** Minimum Depth of Binary Tree */
        MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();
        System.out.println(minimumDepthOfBinaryTree.minDepthBFS(build1.root));

        /**Averages of Levels in Binary Trees */
        AveragesOfLevelInBinaryTrees averages = new AveragesOfLevelInBinaryTrees();
        System.out.println(averages.averageOfLevels(treeBuilder3.root));

        /** Second smallest element in the binary tree */
        SecondMinimumNodesOfBinaryTree seconf = new SecondMinimumNodesOfBinaryTree();
        System.out.println(seconf.findSecondMinimumValue(treeBuilder3.root));

        /** Leaf Similar Tree */
        LeafSimilarTree similarTree = new LeafSimilarTree();
        Integer[] root1 = new Integer[]{3,5,1,6,2,9,8,null,null,7,14};
        Integer[] root2 = new Integer[]{3,5,1,6,71,4,2,null,null,null,null,null,null,9,8};
        TreeBuilder build2 = new TreeBuilder(root1);
        TreeBuilder build3 = new TreeBuilder(root2);
        build2.root = build2.BuildTree(build2.root, 0);
        build3.root = build3.BuildTree(build3.root, 0);
        System.out.println(similarTree.leafSimilar(build2.root, build3.root));

    }
}