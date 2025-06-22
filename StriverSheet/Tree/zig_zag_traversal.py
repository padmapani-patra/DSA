class Solution:
    def zig_zag(self, root):
        curr_level = [root]
        next_level = []
        left_to_right = True
        res = []

        while curr_level:
            node = curr_level.pop()
            res.append(node.val)

            if left_to_right:
                if node.left:
                    next_level.append(node.left)
                if node.right:
                    next_level.append(node.right)
            else:
                if node.right:
                    next_level.append(node.right)
                if node.left:
                    next_level.append(node.left)
            
            if not curr_level:
                curr_level, next_level = next_level, curr_level
                left_to_right = not left_to_right
        return res
    

"""
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
  }
}

class Solution {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    boolean leftToRight = true;

    while (!queue.isEmpty()) {
      int size = queue.size();
      LinkedList<Integer> level = new LinkedList<>();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (leftToRight)
          level.addLast(node.val);
        else
          level.addFirst(node.val);

        if (node.left != null)
          queue.add(node.left);
        if (node.right != null)
          queue.add(node.right);
      }
      res.add(level);
      leftToRight = !leftToRight;
    }

    return res;
  }
}

"""