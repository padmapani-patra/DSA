def pre_in_post_traversal(root):
    ins, pre, post = [], [], []

    stack = [(root, 1)]

    while stack:
        node, state = stack.pop()

        if state == 1:
            pre.append(node.val)
            stack = 2
            stack.append((node, state))
            if node.left: stack.append((node.left,1))
        elif state == 2:
            ins.append(node.val)
            stack = 3
            stack.append((node, state))
            if node.right: stack.append((node.right, 1))
        else:
            post.append(node.val)
