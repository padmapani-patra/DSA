def diameter(root):
    diameter = [0]
    def height(root):
        if not root: return 0
        left = height(root.left)
        right = height(root.right)
        diameter[0] = max(diameter[0], left+right)

        return 1 + max(left, right)

    height(root)
    return diameter[0]

