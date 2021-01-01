package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

import java.util.HashMap;

public class PathSumIII
{

    //int count=0;

    public int pathSum2(TreeNode root,int sum)
    {
        if (root==null) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        return helperHashMap(root,sum, 0, map);
    }

    private int helperHashMap(TreeNode node, int targetSum, int currSum, HashMap<Integer,Integer> map)
    {
        if (node==null) return 0;
        currSum +=node.val;
        int res = map.getOrDefault(currSum-targetSum,0);
        map.put(currSum,map.getOrDefault(currSum, 0)+1);

        res += helperHashMap(node.left,targetSum,currSum,map);
        res += helperHashMap(node.right,targetSum,currSum,map);
        map.put(currSum,map.get(currSum)-1);
        return  res;
    }

    public int pathSum(TreeNode root, int sum)
    {

        if (root==null ||sum==0)
            return 0;


        return helper(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    private int helper(TreeNode node, int sum)
    {
        int count=0;
        if (node==null)
            return count;
        if (sum==node.val)
            count++;
        count+=helper(node.left,sum-node.val);
        count+=helper(node.right,sum-node.val);
        return count;
    }
}
