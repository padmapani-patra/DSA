from collections import deque


class Solution:
    def left_view(self, root):
        if not root:
            return []
        
        res = []
        queue = deque([root])

        while queue:
            node = queue.popleft()
            for i in range(len(queue)):
                if i == 0:
                    res.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

        return res