from collections import deque


class Solution:
    def top_view(self, root):
        top_view = {}

        queue = deque([(root, 0)])

        while queue:
            node, hd = queue.popleft()

            if hd not in top_view:
                top_view[hd] = node.val
            
            if node.left:
                queue.append((node.left, hd-1))
            if node.right:
                queue.append((node.right, hd+1))
        
        sorted_top = sorted(top_view.items())
        result = [val for _, val in sorted_top]
        return result
    

"""
class Solution {
    public List<Integer> topView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>(); // Return an empty list if the tree is empty
        }

        // Map to store the first node at each horizontal distance (hd)
        Map<Integer, Integer> topViewMap = new TreeMap<>();

        // Queue to perform level-order traversal
        // Each element in the queue is a pair of (node, horizontal distance)
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            TreeNode node = current.node;
            int hd = current.hd;

            // If this horizontal distance is not already in the map, add it
            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, node.val);
            }

            // Add the left and right children to the queue with updated horizontal distances
            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }

        // Extract the values from the map in sorted order of keys (horizontal distances)
        return new ArrayList<>(topViewMap.values());
    }

    // Helper class to store a node and its horizontal distance
    private static class Pair {
        TreeNode node;
        int hd;

        Pair(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
}
"""