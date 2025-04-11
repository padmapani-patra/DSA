class Solution:
    def count_nodes(self, root):
        if not root:
            return 0

        def left_height(node):
            height = 0
            while node:
                height += 1
                node = node.left
            return height

        def right_height(node):
            height = 0
            while node:
                height += 1
                node = node.right
            return height

        left = left_height(root.left)
        right = right_height(root.right)

        if left == right:
            return (1 << left) + 1

        return 1 + self.count_nodes(root.left) + self.count_nodes(root.right)
