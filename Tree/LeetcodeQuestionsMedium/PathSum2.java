package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

import java.util.*;

public class PathSum2
{
    public List<List<Integer>> pathSum(TreeNode root, int sum)
    {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,root.val+"",root.val));
        while (!queue.isEmpty())
        {
            Pair curr = queue.poll();
            if (curr.t==sum && (curr.getNode().left==null && curr.getNode().right==null))
            {
                Scanner scanner = new Scanner(curr.s);
                List<Integer> list = new ArrayList<>();
                while (scanner.hasNextInt())
                {
                    list.add(scanner.nextInt());
                }
                res.add(list);
            }
            if (curr.node.left!=null)
            {
                queue.offer(new Pair(curr.getNode().left, curr.getS()+" "+curr.node.left.val, curr.getT()+curr.getNode().left.val ));
            }
            if (curr.getNode().right!=null)
            {
                queue.offer(new Pair(curr.getNode().right, curr.getS()+" "+curr.node.right.val, curr.getT()+curr.getNode().right.val ));
            }
        }
        return res;
    }
    class Pair
    {
        TreeNode node;
        String s;
        int t;

        public Pair(TreeNode node, String s, int t) {
            this.node = node;
            this.s = s;
            this.t = t;
        }

        public TreeNode getNode() {
            return node;
        }

        public String getS() {
            return s;
        }

        public int getT() {
            return t;
        }
    }
    List<List<Integer>> res;
    public List<List<Integer>> pathSum2(TreeNode root, int sum)
    {
        this.res = new ArrayList<>();
        if (root==null)
            return res;
        List<Integer> list =new ArrayList<>();
        list.add(root.val);
        helper(root,list,sum-root.val);
        return res;
    }
    private void helper(TreeNode node, List<Integer> templist, int sum)
    {

        if (sum==0 && node.left==null && node.right==null)
        {
            res.add(templist);
        }
        if (node.left!=null)
        {
            templist.add(node.left.val);
            System.out.println("Templist in left "+templist);
            helper(node.left,templist,sum-node.left.val);
            templist.remove(templist.size()-1);
        }
        if (node.right!=null)
        {
            templist.add(node.right.val);
            System.out.println("Templist in Right "+templist);
            helper(node.right,templist,sum-node.right.val);
            templist.remove(templist.size()-1);
        }



    }

}
