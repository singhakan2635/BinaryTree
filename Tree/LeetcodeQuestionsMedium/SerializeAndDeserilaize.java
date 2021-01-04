package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializeAndDeserilaize
{
    public String serialize(TreeNode root)
    {
        return helper(root,"");
    }
    private String helper(TreeNode node,String s)
    {
        if (node==null)
            s +="null,";
        else
        {
            s +=String.valueOf(node.val)+",";
            s = helper(node.left,s);
            s =helper(node.right,s);
        }
        return s;
    }
    public TreeNode deserialize(String data)
    {
        String[] arr = data.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(arr));

        return helperde(list);
    }
    private TreeNode helperde(List<String> list)
    {
        if (list.get(0).equals("null"))
        {
            list.remove(0);
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        node.left = helperde(list);
        node.right = helperde(list);
        return node;

    }

}
