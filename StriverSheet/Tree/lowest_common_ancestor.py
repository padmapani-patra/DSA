class Solution:
    def lowest_common_ancestor(self, root, p, q):
        if not root:
            return None
        
        if root.data in [p, q]:
            return root
        
        left = self.lowest_common_ancestor(root.left, p, q)
        right = self.lowest_common_ancestor(root.right, p, q)

        if left and right:
            return root
            
        return left if left else right