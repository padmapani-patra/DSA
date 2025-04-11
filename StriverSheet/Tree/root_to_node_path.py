class Solution:
    def root_to_node(self, root, target):
        if not root:
            return []
        path = []
        if self.find_path(root, path, target):
            return path
        return []
    
    def find_path(self, root, path, target):
        if not root:
            return False

        path.append(root.val)

        if target == root.val:
            return True
        
        if self.find_path(root.left, path, target) or self.find_path(root.right, path, target):
            return True
        path.pop()

        return False