def iterative_Pre_order_traversal(root):
    if not root: return
    stack = [root]
    res = []
    while stack:
        node = stack.pop()
        res.append(node.val)
        if node.right: stack.append(node.right)
        if node.left: stack.append(node.left)

    return res

def iterative_post_order_traversal(root):
    if not root:
        return []
    stack = [root]
    res = []
    while stack:
        node = stack.pop()
        res.append(node.val)  # Append to result in reverse order
        if node.left:
            stack.append(node.left)
        if node.right:
            stack.append(node.right)
    return res[::-1] 

def iterative_in_order_traversal(root):
    if not root: return
    stack = []
    res = []
    curr = root
    while stack or curr:
        while curr:
            stack.append(curr)
            curr = curr.left
        curr = stack.pop()
        res.append(curr.val)
        curr = curr.right
    return res




# import java.util.ArrayList;
# import java.util.List;
# import java.util.Stack;

# class TreeNode {
#   int val;
#   TreeNode left;
#   TreeNode right;

#   TreeNode(int val) {
#     this.val = val;
#   }
# }

# class Solution {
#   public List<Integer> preOrder(TreeNode root) {
#     List<Integer> res = new ArrayList<>();
#     if (root == null)
#       return res;
#     Stack<TreeNode> stack = new Stack<>();
#     stack.push(root);

#     while (!stack.isEmpty()) {
#       TreeNode node = stack.pop();
#       res.add(node.val);

#       if (node.right != null)
#         stack.push(node.right);
#       if (node.left != null)
#         stack.push(node.left);
#     }
#     return res;
#   }

#   public List<Integer> postOrder(TreeNode root) {
#     List<Integer> res = new ArrayList<>();
#     if (root == null)
#       return res;
#     Stack<TreeNode> stack = new Stack<>();
#     Stack<TreeNode> output = new Stack<>();
#     stack.push(root);

#     while (!stack.isEmpty()) {
#       TreeNode node = stack.pop();
#       output.push(node);

#       if (node.right != null)
#         stack.push(node.right);
#       if (node.left != null)
#         stack.push(node.left);
#     }

#     while (!output.isEmpty()) {
#       res.add(output.pop().val);
#     }

#     return res;
#   }

#   public List<Integer> inOrder(TreeNode root) {
#     List<Integer> res = new ArrayList<>();
#     if (root == null)
#       return res;
#     Stack<TreeNode> stack = new Stack<>();
#     TreeNode curr = root;
#     while (!stack.isEmpty() || curr != null) {
#       while (curr != null) {
#         stack.push(curr);
#         curr = curr.left;
#       }

#       curr = stack.pop();
#       res.add(curr.val);
#       curr = curr.right;
#     }
#     return res;
#   }
# }