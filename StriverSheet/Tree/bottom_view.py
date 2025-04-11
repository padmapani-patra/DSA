from collections import deque


class Solution:
    def bottom_view(self, root):
        bottom_view = {}

        queue = deque([(root, 0)])

        while queue:
            node, hd = queue.popleft()

            bottom_view[hd] = node.val
            
            if node.left:
                queue.append((node.left, hd-1))
            if node.right:
                queue.append((node.right, hd+1))
        
        sorted_top = sorted(bottom_view.items())
        result = [val for _, val in sorted_top]
        return result