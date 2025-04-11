from collections import deque


class Solution:
    def right_view(self, root):
        if not root:
            return []
        
        res = []
        queue = deque([root])

        while queue:
            length = len(queue)
            for i in range(length):
                node = queue.popleft()
                if i == length-1:
                    res.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

        return res