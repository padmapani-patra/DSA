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
        

"""

class Solution {
  List<Integer> res = new ArrayList<>();

  public List<Integer> boundaryTraversal(TreeNode root) {
    if (root == null)
      return new ArrayList<>();
    if (isLeaf(root))
      return new ArrayList<>(root.val);
    addLeftNodes(root);
    addleaves(root);
    addRightNdoes(root);
    return res;

  }

  public boolean isLeaf(TreeNode node) {
    if (node.left == null && node.right == null)
      return true;
  }

  public void addLeftNodes(TreeNode root) {
    while (root != null) {
      if (!isLeaf(root))
        res.add(root.val);
      if (root.left != null)
        root = root.left;
      else
        root = root.right;
    }
  }

  public void addleaves(TreeNode root) {
    if (root == null)
      return;
    if (isLeaf(root)) {
      res.add(root.val);
      return;
    }
    addleaves(root.left);
    addleaves(root.right);
  }

  public void addRightNdoes(TreeNode root) {
    List<Integer> temp = new ArrayList<>(); // Temporary list to store right boundary nodes
    while (root != null) {
      if (!isLeaf(root))
        temp.add(root.val); // Add non-leaf nodes
      root = (root.right != null) ? root.right : root.left; // Move to the next right boundary node
    }

    // Add right boundary nodes in reverse order
    for (int i = temp.size() - 1; i >= 0; i--) {
      res.add(temp.get(i));
    }
  }
}

"""