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
