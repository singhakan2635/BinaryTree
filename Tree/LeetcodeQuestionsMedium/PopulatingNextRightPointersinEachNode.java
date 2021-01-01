package Tree.LeetcodeQuestionsMedium;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PopulatingNextRightPointersinEachNode
{
    public Node connect(Node root)
    {
        Queue<Node> queue = new LinkedList<>();
        if (root==null)
            return null;
        root.next =null;
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            while (size>0)
            {
                Node node = queue.poll();
                if (size>1)
                    node.next = queue.peek();
                else
                    node.next =null;
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
                size--;
            }


        }
        return root;
    }

}
