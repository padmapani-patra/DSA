from collections import deque


def level_order_traversal(root):
    if not root: return []
    res = []
    queue = deque([root])
    r = []


    while queue:
        l = len(queue)  # Number of nodes at the current level
        r = []  # Temporary list to hold values at the current level

        for _ in range(l):
            node = queue.popleft()
            r.append(node.val)
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        res.append(r)
    
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
  public List<Integer> levelOrderedTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null)
      return res;
    Queue<TreeNode> stack = new LinkedList<>();

    stack.add(root);
    while (!stack.isEmpty()) {
      int len = stack.size();
      for (int i = 0; i < len; i++) {
        TreeNode node = stack.poll();
        res.add(node.val);
        if (node.left != null)
          stack.add(node.left);
        if (node.right != null)
          stack.add(node.right);
      }
    }
    return res;
  }
}

"""