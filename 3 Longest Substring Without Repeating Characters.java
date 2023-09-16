/*
The task is to find the length of the longest substring in a given string s without repeating characters. The provided solution uses a sliding window approach with the help of a HashMap to keep track of character positions.

***Approach:
The approach used here is often referred to as the "sliding window" approach. It involves maintaining a window of characters in the string and a HashMap to keep track of the last seen positions of characters. The idea is to expand the window when a character is encountered that has not been seen before in the current window and shrink the window when a repeating character is found.

***Algorithm:

1.Initialize two pointers, i and j, both initially set to 0. These pointers represent the start and end of the current window.

2.Initialize a HashMap map to store characters as keys and their last seen positions as values.

3.Initialize a variable max to keep track of the maximum length of the substring without repeating characters, initially set to 0.

4.Iterate through the string s using the i pointer:

5.If the character at index i is already in the map (i.e., it's a repeating character), update j to be the maximum of its current value and the position of the character in the map plus 1. This effectively shrinks the window to exclude the repeating character.

6.Update the position of the character in the map to be the current index i.

7.Update max to be the maximum of its current value and i - j + 1, which represents the length of the current window without repeating characters.

8.After the loop, max will contain the length of the longest substring without repeating characters.

9.Return max as the result.

***Time Complexity:

The algorithm iterates through the input string s once, and for each character, it performs constant-time operations (inserting and updating HashMap entries). Therefore, the time complexity is O(N), where N is the length of the input string.
Space Complexity:

***The space complexity is O(min(N, M)), where N is the length of the input string and M is the size of the character set (number of distinct characters in the string). In the worst case, when all characters are distinct, the space complexity is O(N) due to the HashMap.
*/
class Solution {
    public int lengthOfLongestSubstring(String s)
    {
       if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}