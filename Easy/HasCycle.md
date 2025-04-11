# Python

```python
class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        slow = head
        fast = head
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow: return True
        return False
```

<br />
<br />
<br />

# JS
```js
var hasCycle = function(head) {
    let slow = head;
    let fast = head;

    while(fast && fast.next){
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) return true;
    }
    return false;
};
```

<br />
<br />
<br />

# JAVA
```java
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Use two pointers: slow and fast
        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move slow pointer by 1 step
            fast = fast.next.next;      // Move fast pointer by 2 steps

            if (slow == fast) {         // If they meet, there is a cycle
                return true;
            }
        }

        return false; // If fast reaches the end, there is no cycle
    }
}
```