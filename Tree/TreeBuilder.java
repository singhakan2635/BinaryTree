package com.practise.Tree;

public class TreeBuilder
{
    TreeNode root;
    private Integer[] a;
    public TreeBuilder(Integer[] tree)
    {
        this.a= new Integer[tree.length];
        this.a = tree;
        //this.root = BuildTree(root,0);
    }

    public TreeNode BuildTree(TreeNode root, int index)
    {
        if (index>=a.length)
        {
            return root;
        }
        if (a[index]!=null)
        {
            TreeNode temp = new TreeNode(a[index]);
            root = temp;
            root.left = BuildTree(root.left,2*index+1);
            root.right = BuildTree(root.right,2*(index+1));
        }
        return root;

    }
}
