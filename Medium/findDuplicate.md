`So, by first detecting the cycle, we ensure that there is a loop in the "linked list" structure, and then by finding the start of that cycle, we pinpoint the duplicate number.`

<br />
<br />

# Python

```python
class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        slow = fast = nums[0]

        while True:
            slow = nums[slow]
            fast = nums[nums[fast]]
            if slow == fast:
                break

        slow = nums[0]
        while slow != fast:
            slow = nums[slow]
            fast = nums[fast]

        return slow

```

<br />
<br />
<br />

# JS

```js
/**
 * @param {number[]} nums
 * @return {number}
 */
var findDuplicate = function (nums) {
  let slow = nums[0];
  let fast = nums[0];

  do {
    slow = nums[slow];
    fast = nums[nums[fast]];
  } while (slow != fast);

  slow = nums[0];
  while (fast != slow) {
    slow = nums[slow];
    fast = nums[fast];
  }
  return slow;
};
```

<br />
<br />
<br />

# JAVA

```java

```
