from collections import defaultdict, deque


class Solution:
    def vertical_traversal(self, root):
        if not root:
            return []
        column_table = defaultdict(list)
        queue = deque([(root, 0)])

        while queue:
            node, hd = queue.popleft()
            column_table[hd].append(node.val)

            if node.left:
                queue.append((node.left, hd-1))
            if node.right:
                queue.append((node.right, hd+1))
            
        sorted_columns = sorted(column_table.items())
        result = [val for _, columns in sorted_columns for val in columns]
        return result