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

