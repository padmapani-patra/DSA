# Python

```python
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if not list1: return list2
        if not list2: return list1

        curr = res = ListNode()
        while list1 and list2:
            if list1.val < list2.val:
                curr.next = list1
                list1 = list1.next
                curr = curr.next
            else:
                curr.next = list2
                list2 = list2.next
                curr = curr.next
        
        if list1: curr.next = list1
        if list2: curr.next = list2

        return res.next
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
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function(list1, list2) {
    if(!list1) return list2;
    if(!list2) return list1;

    let curr = new ListNode();
    let res = curr;

    while(list1 && list2){
        if (list1.val < list2.val){
            curr.next = list1;
            list1 = list1.next;
            curr = curr.next;
        }
            
        else{
            curr.next = list2
            list2 = list2.next
            curr = curr.next
        }
    }

    if (list1) curr.next = list1
    if (list2) curr.next = list2

    return res.next
};
```

<br />
<br />
<br />

# JAVA
```java

```