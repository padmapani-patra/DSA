class Solution:
    def symmetric(self, root):
        def is_same(left, right):
            if not left and not right:
                return True
            if not left or not right:
                return False
            
            return (
                    left.val == right.val and
                    is_same(left.left, right.right) and
                    is_same(left.right, right.left)
                )
        return is_same(root.left, root.right) if root else True