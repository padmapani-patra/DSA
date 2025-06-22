def is_balanced(root):
    def check_balance(node):
        if not node:
            return -1

        left_height = check_balance(node.left)
        if left_height == -1:
            return -1

        right_height = check_balance(node.right)
        if right_height == -1:
            return -1
    
        if abs(left_height-right_height) > 1:
            return -1

        return 1 + max(left_height, right_height)

    return check_balance(root) != -1 


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
  public int checkBalanced(TreeNode node) {
    if (node == null)
      return -1;
    int left = checkBalanced(node.left);
    if (left == -1)
      return -1;
    int right = checkBalanced(node.right);
    if (right == -1)
      return -1;
    if (Math.abs(left - right) > 1)
      return -1;

    return 1 + Math.max(left, right);
  }

  public boolean isBalanced(TreeNode root) {
    return checkBalanced(root) != -1;
  }
}
"""