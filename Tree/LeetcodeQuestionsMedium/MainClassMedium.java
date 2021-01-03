package Tree.LeetcodeQuestionsMedium;

import Tree.TreeBuilder;
import Tree.TreeNode;

public class MainClassMedium
{
    public static void main(String[] args) {

        Integer[] root1 = new Integer[]{3,5,1,6,2,9,8,null,null,7,14};
        TreeBuilder build2 = new TreeBuilder(root1);
        build2.root = build2.BuildTree(build2.root, 0);

        /**199. Binary Tree Right Side View */
        BinaryTreeRightSideView view = new BinaryTreeRightSideView();
        System.out.println(view.rightSideView(build2.root));

        /** 236. Lowest Common Ancestor of a Binary Tree */
        Integer[] ancestor = new Integer[]{3,5,1,6,2,0,8,null,null,7,4};
        TreeBuilder build4 = new TreeBuilder(ancestor);
        build4.root = build4.BuildTree(build4.root, 0);
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(4);

        /** 863. All Nodes Distance K in Binary Tree */
        Integer[] tree = new Integer[]{3,5,1,6,2,0,8,null,null,7,4};
        TreeBuilder build1 = new TreeBuilder(tree);
        build1.root = build1.BuildTree(build1.root, 0);
        TreeNode target = new TreeNode(5);
        AllNodesDistanceKinBinaryTree distanceKinBinaryTree = new AllNodesDistanceKinBinaryTree();
        System.out.println(distanceKinBinaryTree.distanceK(build1.root, target,2));

        /** 987. Vertical Order Traversal of a Binary Tree */
        Integer[] tree2 = new Integer[]{0,2,1,3,null,null,null,4,5,null,7,6,null,10,8,11,9};
        TreeBuilder builder1 = new TreeBuilder(tree2);
        builder1.root = builder1.BuildTree(builder1.root, 0);
        VerticalOrderTraversal traversal = new VerticalOrderTraversal();
        System.out.println(traversal.verticalTraversal(builder1.root));

        /** 103. Binary Tree Zigzag Level Order Traversal */
        Integer[] tree3 = new Integer[]{3,9,20,null,null,15,7};
        TreeBuilder builder2 = new TreeBuilder(tree3);
        builder2.root = builder2.BuildTree(builder2.root, 0);
        ZigZagLevel zigZagLevel = new ZigZagLevel();
        System.out.println(zigZagLevel.zigzagLevelOrder(builder2.root));
        System.out.println(zigZagLevel.zigzagLevelOrderDFS(builder2.root));

        /** 545. Boundary of Binary Tree */
        Integer[] tree4 = new Integer[]{1,2,3,4,5,6,null,null,null,7,8,9,10};
        TreeBuilder builder3 = new TreeBuilder(tree4);
        builder3.root = builder3.BuildTree(builder3.root, 0);
        BoundaryOfBinaryTrees boundary = new BoundaryOfBinaryTrees();
        System.out.println(boundary.boundaryOfBinaryTree(builder3.root));

        BoundaryOfBinaryTrees2 boundary1 = new BoundaryOfBinaryTrees2();
        System.out.println(boundary1.boundaryOfBinaryTree(builder3.root));

        /**437. Path Sum III */
        Integer[] tree5 = new Integer[]{10,5,-3,3,2,null,11,3,-2,null,1};
        TreeBuilder builder4 = new TreeBuilder(tree5);
        builder4.root = builder4.BuildTree(builder4.root,0);
        PathSumIII pathSumIII = new PathSumIII();
        System.out.println(pathSumIII.pathSum(builder4.root,8));
        System.out.println(pathSumIII.pathSum2(builder4.root,8));

        /**979. Distribute Coins in Binary Tree */
        Integer[] tree6 = new Integer[]{1,0,0,null,3};
        TreeBuilder treeBuilder = new TreeBuilder(tree6);
        treeBuilder.root = treeBuilder.BuildTree(treeBuilder.root, 0);
        DistributeTheCoinsInBinaryTree coins = new DistributeTheCoinsInBinaryTree();
        System.out.println("Coins Distribution");
        System.out.println(coins.distributeCoins(treeBuilder.root));


        Integer[] tree7 = new Integer[]{1,2,3,4,5,6,7};
        TreeBuilder2 builder = new TreeBuilder2(tree7);
        builder.root = builder.BuildTree(builder.root,0);
        PopulatingNextRightPointersinEachNode pointersinEachNode = new PopulatingNextRightPointersinEachNode();
        Node root = pointersinEachNode.connect(builder.root);
        builder.preorder(root);

        /** Path Sum 2 */
        System.out.println();
        System.out.println("PathSum2 ");
        Integer[] tree8 = new Integer[]{5,4,8,11,null,13,4,7,2,null,null,5,1};
        TreeBuilder builder5 =new TreeBuilder(tree8);
        builder5.root = builder5.BuildTree(builder5.root, 0);
        PathSum2 pathSum2 =new PathSum2();
        System.out.println(pathSum2.pathSum2(builder5.root, 22));

        /** 687. Longest Univalue Path */
        System.out.println("Longest Univalued Path");
        Integer[] tree9 = new Integer[]{1,4,5,4,4,5};
        TreeBuilder treeBuilder1 = new TreeBuilder(tree9);
        treeBuilder1.root = treeBuilder1.BuildTree(treeBuilder1.root, 0);
        LongestUnivaluedPath univaluedPath = new LongestUnivaluedPath();
        System.out.println(univaluedPath.longestUnivaluePath(treeBuilder1.root));


    }
}
