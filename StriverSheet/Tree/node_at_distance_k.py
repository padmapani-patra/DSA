from collections import deque


class Solution:
    def nodes_at_distance_k(self, root, target, k):
        parents = {}
        self.populate_parent(root, None, parents)
        return self.bfs_nodes_at_distance_k(target, k, parents)

    def populate_parent(self, node, parent, parents):
        if not node:
            return
        parents[node] = parent
        self.populate_parent(node.left, node, parents)
        self.populate_parent(node.right, node, parents)

    def bfs_nodes_at_distance_k(self, target, k, parents):
        queue = deque([target, 0])
        visited = set([target])

        result = []
        while queue:
            node, dist = queue.popleft()

            if dist == k:
                result.append(node.val)

            if dist >= k:
                continue
            
            for neigh in [node.left, node.right, parents[node]]:
                visited.add(neigh)
                queue.append((neigh, dist+1))

        return result


"""


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
  }
}

class Solution {
  public List<Integer> nodeAtDistanceK(TreeNode root, TreeNode target, int k) {
    Map<TreeNode, TreeNode> parents = new HashMap<>();
    populateParents(root, null, parents);

    return bfsAtDistanceK(target, k, parents);
  }

  public void populateParents(TreeNode node, TreeNode parent, Map<TreeNode, TreeNode> parents) {
    if (node == null)
      return;
    parents.put(node, parent);
    populateParents(node.left, node, parents);
    populateParents(node.right, node, parents);
  }

  public List<Integer> bfsAtDistanceK(TreeNode target, int k, Map<TreeNode, TreeNode> parents) {
    List<Integer> res = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    Set<TreeNode> visited = new HashSet<>();
    queue.add(target);
    visited.add(target);
    int distance = 0;

    while (!queue.isEmpty()) {
      int size = queue.size();
      if (k == distance) {
        for (TreeNode node : queue) {
          res.add(node.val);
        }
        break;
      }

      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();

        for (TreeNode neighbor : Arrays.asList(node.left, node.right, parents.get(node))) {
          if (neighbor != null && !visited.contains(neighbor)) {
            visited.add(neighbor);
            queue.add(neighbor);
          }
        }

      }

      distance++;
    }

    return res;
  }
}
"""