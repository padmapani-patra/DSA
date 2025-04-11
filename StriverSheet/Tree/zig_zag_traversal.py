class Solution:
    def zig_zag(self, root):
        curr_level = [root]
        next_level = []
        left_to_right = True
        res = []

        while curr_level:
            node = curr_level.pop()
            res.append(node.val)

            if left_to_right:
                if node.left:
                    next_level.append(node.left)
                if node.right:
                    next_level.append(node.right)
            else:
                if node.right:
                    next_level.append(node.right)
                if node.left:
                    next_level.append(node.left)
            
            if not curr_level:
                curr_level, next_level = next_level, curr_level
                left_to_right = not left_to_right
        return res