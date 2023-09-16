import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate through the string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // Push opening brackets onto the stack
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    // If the stack is empty, there's no corresponding opening bracket
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    // Mismatched brackets
                    return false;
                }
            }
        }
        
        // If the stack is empty, all brackets were matched
        return stack.isEmpty();
    }
}
/*Stack-Based Approach: 
This is the method used in the code. It uses a stack data structure to keep track of opening brackets as it iterates through the input string. When a closing bracket is encountered, it checks if it matches the most recent opening bracket on the stack. This approach is efficient and has a time complexity of O(n), where n is the length of the input string.

Algorithm Explanation:
We use a stack to keep track of the opening brackets as we traverse the input string from left to right.
For each character c in the input string s:
If c is an opening bracket ('(', '{', or '['), we push it onto the stack.
If c is a closing bracket (')', '}', or ']'), we need to check if it matches the most recent opening bracket on the stack.
If the stack is empty, there is no corresponding opening bracket, so we return false.
Otherwise, we pop the top element from the stack and check if it matches the current closing bracket c. If they don't match (e.g., ']' with '{'), we return false.
After processing the entire string, if the stack is empty, it means that all opening brackets were matched with closing brackets, and we return true. Otherwise, if the stack is not empty, there are unmatched opening brackets, and we return false.
Time Complexity:

The time complexity of this algorithm is O(n), where n is the length of the input string s. This is because we iterate through the string once, and each character is processed in constant time (pushing and popping from the stack takes O(1) time).

Space Complexity:

The space complexity is O(n) in the worst case. This happens when the input string contains only opening brackets (e.g., "(((("). In this case, the stack will have to store all the opening brackets, and its size will be proportional to the length of the input string.

Step-by-Step Execution:

Let's walk through an example with the input string "()[]{}":

Initialize an empty stack: stack = []
Start iterating through the input string: s = "()[]{}"
Character '(' encountered, push onto the stack: stack = ['(']
Character ')' encountered, pop and match with the top of the stack: stack = []
Character '[' encountered, push onto the stack: stack = ['[']
Character ']' encountered, pop and match with the top of the stack: stack = []
Character '{' encountered, push onto the stack: stack = ['{']
Character '}' encountered, pop and match with the top of the stack: stack = []
After processing the entire string, the stack is empty, so we return true.
The algorithm correctly identifies that the input string contains valid parentheses and returns true.

*/





