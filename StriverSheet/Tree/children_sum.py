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


class Solution:
    def changeTree(self, root):
        if root is None:
            return

        child = 0
        if root.left:
            child += root.left.val
        if root.right:
            child += root.right.val

        if child >= root.val:
            root.val = child
        else:
            if root.left:
                root.left.val = root.val
            elif root.right:
                root.right.val = root.val

        self.changeTree(root.left)
        self.changeTree(root.right)

        tot = 0
        if root.left:
            tot += root.left.val
        if root.right:
            tot += root.right.val

        if root.left or root.right:
            root.val = tot