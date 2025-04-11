from collections import deque


def level_order_traversal(root):
    if not root: return []
    res = []
    queue = deque([root])
    r = []


    while queue:
        l = len(queue)  # Number of nodes at the current level
        r = []  # Temporary list to hold values at the current level

        for _ in range(l):
            node = queue.popleft()
            r.append(node.val)
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        res.append(r)
    
    return res


    