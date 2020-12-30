package Tree.LeetcodeQuestionsMedium;

import Tree.TreeNode;

import java.util.*;

public class VerticalOrderTraversal
{
    public List<List<Integer>> verticalTraversal(TreeNode root)
    {
        Map<Integer,List<CoorQueue>> treeMap = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        int min=0,max=0;
        Queue<CoorQueue> queues = new LinkedList<>();
        queues.add(new CoorQueue(root,0,0));
        while (!queues.isEmpty())
        {
            CoorQueue curr = queues.poll();
            min = Math.min(min,curr.x);
            max = Math.max(max,curr.x);
            if (!treeMap.containsKey(curr.x))
            {
                treeMap.put(curr.x, new ArrayList<>());
            }
            treeMap.get(curr.x).add(curr);
            if (curr.node.left!=null)
            {
                queues.offer(new CoorQueue(curr.node.left, curr.x-1 , curr.y+1));
            }
            if (curr.node.right!=null)
            {
                queues.offer(new CoorQueue(curr.node.right,curr.x+1, curr.y+1));
            }
        }

        for (int i=min;i<=max;i++)
        {
            Collections.sort(treeMap.get(i), new Comparator<CoorQueue>() {
                @Override
                public int compare(CoorQueue o1, CoorQueue o2)
                {
                    if (o1.y==o2.y)
                    {
                        return o1.node.val-o2.node.val;
                    }
                    return 0;
                }
            });
            List<Integer> list = new ArrayList<>();
            for (int j=0;j< treeMap.get(i).size();j++)
            {
                list.add(treeMap.get(i).get(j).node.val);
            }
            res.add(list);
        }

        return res;

    }
    class CoorQueue
    {
        TreeNode node;
        int x;
        int y;

        public CoorQueue(TreeNode node, int x,int y) {
            this.node = node;
            this.x = x;
            this.y = y;
        }
    }
}
