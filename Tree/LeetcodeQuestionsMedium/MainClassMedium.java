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


    }
}
