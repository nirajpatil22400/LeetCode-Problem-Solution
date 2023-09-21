/*
The provided Java code defines a Solution class with a static method 
isAnagram that checks whether two input strings, a and b, are anagrams 
of each other or not. Anagrams are words or phrases formed by rearranging 
the letters of another, using all the original letters exactly once.

Here's a step-by-step explanation of the approach, algorithm, 
and logic behind this code:

1. Initialize Character Count Arrays: The code initializes two arrays,
   count1 and count2, each of size 26. These arrays are used to store 
   the count (frequency) of each character in the English alphabet 
   (assuming the input strings consist of lowercase English letters only).
   The index in these arrays corresponds to the ASCII value of the character
   minus the ASCII value of 'a', so 'a' corresponds to index 0, 'b' to 
   index 1, and so on.

2. Count Character Frequencies in String a: A for loop iterates through 
   each racter of the first input string, a. Inside the loop, it calculates 
   the index for the character in the count1 array and increments the count
   at that index.

3. Count Character Frequencies in String b: A similar for loop iterates 
   through each character of the second input string, b. Inside the loop, 
   it calculates the index for the character in the count2 array and 
   increments the count at that index.

4. Comparing Frequency Arrays: After counting the frequencies of characters
   in both strings, the code compares the two frequency arrays, count1 and 
   count2, element by element. If any element in these arrays is not equal, 
   it means that the two input strings do not have the same character 
   frequencies, and hence, they are not anagrams. In such a case, the 
   function returns false.

5. Return Result: If the code completes the loop without finding any 
   differences in character frequencies, it means that the two input 
   strings are anagrams of each other. In this case, the function 
   returns true.

Time Complexity:

The time complexity of this algorithm is O(n), where n is the length of 
the longer of the two input strings. This is because both input strings 
are iterated through once to count the character frequencies, and then 
a single loop of constant length (26) is used to compare the two frequency 
arrays.

Space Complexity:

The space complexity is O(1) because the size of the count1 and count2 
arrays is fixed at 26, regardless of the length of the input strings. 
The space complexity does not depend on the size of the input strings.




Regenerate

*/
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
            
        // Initializing arrays to count the frequency of characters.
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Counting the frequency of the characters of the first string.
        for (int i = 0; i < a.length(); i++) {
            count1[a.charAt(i) - 'a']++;
        }

        // Counting the frequency of the characters of the second string.
        for (int i = 0; i < b.length(); i++) {
            count2[b.charAt(i) - 'a']++;
        }

        // Comparing both the arrays.
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }
}