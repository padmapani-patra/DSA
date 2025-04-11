class Solution:
    def is_same(self, p, q):
        if not p and not q:
            return True
        if not p or not q:
            return False
        if p.val != q.val:
            return False
        
        return self.is_same(p.left, q.left) and self.is_same(p.right, q.right)
        