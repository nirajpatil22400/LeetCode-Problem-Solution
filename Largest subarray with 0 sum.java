/*
Find the length of the largest subarray with 0 sum using hashmap:
Follow the below idea to solve the problem using this approach: 

Let us say prefixsum of array till index i is represented as Si .
Now consider two indices i and j (j > i) such that Si = Sj .

So, 
Si = arr[0] + arr[1] + . . . + arr[i]
Sj = arr[0] + arr[1] + . . . + arr[i] + arr[i+1] + . . . + arr[j]

Now if we subtract Si from Sj .
Sj – Si = (arr[0] + arr[1] + . . . + arr[i] + arr[i+1] + . . . + arr[j]) – (arr[0] + arr[1] + . . . + arr[i])
0 = (arr[0] – arr[0]) + (arr[1] – arr[1]) + . . . + (arr[i] – arr[i]) + arr[i+1] + arr[i+2] + . . . + arr[j]
0 = arr[i+1] + arr[i+2] + . . . + arr[j]

So we can see if there are two indices i and j (j > i) for which the prefix sum are same then the subarray
from i+1 to j has sum = 0.

We can use hashmap to store the prefix sum, and if we reach any index for which there is already a 
prefix with same sum, we will find a subarray with sum as 0. Compare the length of that subarray 
with the current longest subarray and update the maximum value accordingly.

Follow the steps mentioned below to implement the approach:

1]Create a variable (sum), length (max_len), and a hash map (hm) to store the sum-index pair as a key-value pair.
2]Traverse the input array and for every index, 
3]Update the value of sum = sum + array[i].
4]Check every index, if the current sum is present in the hash map or not.
5]If present, update the value of max_len to a maximum difference of two indices 
(current index and index in the hash-map) and max_len.
6]Else, put the value (sum) in the hash map, with the index as a key-value pair.
7]Print the maximum length (max_len).
Below is a dry run of the above approach: 
*/
class GfG
{
    int maxLen(int arr[], int n)
    {
         // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM
            = new HashMap<Integer, Integer>();
 
        int sum = 0; // Initialize sum of elements
        int max_len = 0; // Initialize result
 
        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to sum
            sum += arr[i];
 
            if (sum == 0)
                max_len = i + 1;
 
            // Look this sum in hash table
            Integer prev_i = hM.get(sum);
 
            // If this sum is seen before, then update
            // max_len if required
            if (prev_i != null)
                max_len = Math.max(max_len, i - prev_i);
            else // Else put this sum in hash table
                hM.put(sum, i);
        }
 
        return max_len;
    }
}
// Time Complexity: O(N)
// Auxiliary Space: O(N)