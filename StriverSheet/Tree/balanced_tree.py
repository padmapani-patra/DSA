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