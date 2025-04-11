class Solution:
    def boundary_traversal(self, root):
        self.res = []
        if not root: return []
        if self.is_leaf(root):
            return [root]

        self.add_left_boundary(root.left)
        self.add_leaves(root)
        self.add_right_boundary(root.right)

    def is_leaf(self, root):
        return not root.left and not root.right
    
    def add_left_boundary(self, root):
        while root:
            if not self.is_leaf(root):
                self.res.append(root.val)
            if root.left:
                root = root.left
            else:
                root= root.right

    def add_leaves(self, root):
        if self.is_leaf(root):
            self.res.append(root.val)
        self.add_leaves(root.left)
        self.add_leaves(root.right)
    
    def add_right_boundary(self, root):
        while root:
            if not self.is_leaf(root):
                self.res.append(root.val)
            if root.right:
                root = root.right
            else:
                root= root.left
        