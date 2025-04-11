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