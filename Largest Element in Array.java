/*
***Explanation:
        The given task is to find the largest element in an array 
        of integers.The approach used here is to iterate through 
        the array and maintain a variable to keep track of the 
        maximum element encountered so far.
        
Here's a step-by-step explanation of the approach and algorithm:

***Approach:

1] Initialize a variable maxElement with the minimum possible integer 
   value (Integer.MIN_VALUE). This ensures that any element in the 
   array will be greater than the initial value of maxElement.

***Algorithm:

1] Iterate through the array arr from index 0 to n-1, 
   where n is the size of the array.
2] For each element arr[i] at index i:
3] Check if arr[i] is greater than the current maxElement.
4] If it is, update the value of maxElement to arr[i]. 
   This step ensures that maxElement always holds the 
   maximum element encountered so far during the iteration.
5] After the loop completes, maxElement will contain the 
   largest element in the array.

***Time Complexity:

    The algorithm iterates through the entire array once, 
    so the time complexity is O(N), where N is the size 
    of the array.
    
***Space Complexity:

    The space complexity is O(1) because the algorithm uses 
    a constant amount of extra space, regardless of the 
    size of the input array. The space used by the maxElement 
    variable is independent of the size of the input array, 
    making it a constant space algorithm.
*/
//User function Template for Java

class Compute {
    public int largest(int arr[], int n) {
        // Initialize the maximum element with the minimum possible value
        int maxElement = Integer.MIN_VALUE;
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Check if the current element (arr[i]) is greater than the current maximum (maxElement)
            if (arr[i] > maxElement) {
                // If it is, update maxElement to the current element's value
                maxElement = arr[i];
            }
        }
        
        // After iterating through the entire array, maxElement will contain the largest element
        return maxElement;
    }
}
