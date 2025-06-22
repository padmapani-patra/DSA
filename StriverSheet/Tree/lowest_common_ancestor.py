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
    
"""

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
  }
}

class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
    if (root == null)
      return null;

    if (root.val == p || root.val == q)
      return root;

    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if (left != null && right != null)
      return root;
    return left != null ? left : right;
  }
}
"""