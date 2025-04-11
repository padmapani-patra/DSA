# Python

```python
class Solution:
    def numDecodings(self, s: str) -> int:
        if not s or s[0] == '0': 
            return 0  # If the string starts with '0', it's invalid
        
        n = len(s)
        dp = [0] * (n + 1)  
        dp[0], dp[1] = 1, 1  # Base cases: empty string and first character

        for i in range(2, n + 1):
            one_digit = int(s[i-1])    # Last one digit
            two_digits = int(s[i-2:i]) # Last two digits
            
            if 1 <= one_digit <= 9:
                dp[i] += dp[i-1]  # Single-digit decoding is valid
            
            if 10 <= two_digits <= 26:
                dp[i] += dp[i-2]  # Two-digit decoding is valid

        return dp[n]
```

<br />
<br />
<br />

# JS

```

<br />
<br />
<br />

# JAVA
```java

```