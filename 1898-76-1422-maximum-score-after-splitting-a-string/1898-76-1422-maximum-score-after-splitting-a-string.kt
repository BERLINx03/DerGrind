class Solution {
    fun maxScore(s: String): Int {
    var zeros = if(s.first() == '0')  1 else 0
    var ones = 0
    var max = -1
    for (one in 1..s.length - 1 )  if (s[one] == '1')  ones++
    for (num in 1..s.length - 1) {
        max = kotlin.math.max(max, zeros + ones)
        if (s[num] == '0') zeros++ else ones--
    }
    return max
    }
}