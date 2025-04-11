class Solution:
    def max_path_sum(self, root):
        self.max_sum = float('-inf')
        self.calculate_max_sum(root)
        return self.max_sum
    
    def calculate_max_sum(self, root):
        if not root:
            return 0
        
        left = self.calculate_max_sum(root.left)
        right = self.calculate_max_sum(root.right)

        curr_sum = root.val + left + right
        self.max_sum = max(self.max_sum, curr_sum)

        return root.val + max(left, right)
    
