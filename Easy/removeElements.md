# Python

```python
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        if not head: return None

        node = head

        while node and node.next:
            if node.next.val == val:
                node.next = node.next.next
            else:
                node = node.next

        return head if head.val != val else head.next
```

<br />
<br />
<br />

# JS
```js
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function(head, val) {
    if (!head) return null;
    
    let node = head;

    while(node && node.next){
        if (node.next.val == val) node.next = node.next.next;
        else node = node.next
    }

    return head.val != val ? head : head.next;
};
```

<br />
<br />
<br />

# JAVA
```java

```