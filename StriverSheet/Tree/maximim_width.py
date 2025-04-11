from collections import deque


class Solution:
    def maximum_width(self, root):
        max_length = 0
        queue = deque([root])
        while queue:
            level_length = len(queue)
            max_length = max(max_length, level_length)
            for _ in range(level_length):
                node = queue.popleft()

                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
                
            

