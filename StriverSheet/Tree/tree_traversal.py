def pre_order(root):
    if not root: return
    print(root.val)
    pre_order(root.left)
    pre_order(root.right)

def in_order(root):
    if not root: return
    in_order(root.left)
    print(root.val)
    in_order(root.right)

def post_order(root):
    if not root: return

    post_order(root.left)
    post_order(root.right)
    print(root.val)


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

# Example tree:
root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.left.left = TreeNode(4)
root.left.right = TreeNode(5)

# Traversals
print("Pre-order:")
pre_order(root)  # Output: 1 2 4 5 3

print("\nIn-order:")
in_order(root)  # Output: 4 2 5 1 3

print("\nPost-order:")
post_order(root)  # Output: 4 5 2 3 1