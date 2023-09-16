class Solution {
    public int findKthLargest(int[] nums, int k)
    {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
/*
The task is to find the kth largest element in an integer array nums. The provided solution sorts the array and then returns the kth largest element from the sorted array. However, it's possible to solve this problem without explicitly sorting the entire array.

Approach:
One common approach to finding the kth largest element without sorting the entire array is to use a min-heap (priority queue) of size k. We'll maintain this heap as we iterate through the input array, and it will always contain the k largest elements seen so far.

Algorithm:

Create a min-heap (priority queue) of size k. You can use a data structure like PriorityQueue in Java.

Iterate through the input array nums:

For each element num in nums, do the following:
If the size of the min-heap is less than k, add num to the min-heap.
If the size of the min-heap is already k, compare num with the smallest element in the min-heap (the root of the heap).
If num is greater than the smallest element in the min-heap, remove the smallest element from the min-heap and add num to it.
After iterating through the entire array, the min-heap will contain the k largest elements in nums, with the smallest of these k elements at the root of the heap.

The root of the min-heap will be the kth largest element in the array.

Time Complexity:

The time complexity of this approach is O(N * log(k)), where N is the length of the input array nums. This is because, in the worst case, we perform k insertions and deletions in the min-heap, and each of these operations takes O(log(k)) time.
Space Complexity:

The space complexity is O(k) because we are using a min-heap of size k to store the k largest elements seen so far.
*/