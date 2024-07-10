class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        char_index = {}
        maxlength = 0
        left = 0
        
        for right, char in enumerate(s):#what is happening here is we are going over the list using Char and Right as a pointer
            if char in char_index and char_index[char] >= left:
                left = char_index[char] + 1 #if the char is already in the list and  >= to left then we know to move the pointer 1 past it 
            char_index[char] = right #then we set up the index by puting char at the right pointer
            maxlength = max(maxlength, right - left + 1)#then we set max to the greater of the 2 values
        
        return maxlength

solution = Solution()
print(solution.lengthOfLongestSubstring("abcabcbb") ==3)
print(solution.lengthOfLongestSubstring("bbbbb") == 1)
print(solution.lengthOfLongestSubstring("pwwkew") == 3)
