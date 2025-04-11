class Solution:
    def check_children_sum_property(self, root):
        if not root or (not root.left and not root.right):
            return True
        left = root.left.data if root.left else 0
        right = root.right.data if root.right else 0

        if root.data == left+right:
            return self.check_children_sum_property(root.left) and self.check_children_sum_property(root.right)
        
        else:
            return False