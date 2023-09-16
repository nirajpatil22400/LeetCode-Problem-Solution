/*
This algorithm uses a HashMap to keep track of the cumulative sum of nodes encountered so far in the linked list. It iterates through the linked list twice: once to calculate the cumulative sum and store it in the HashMap, and then again to update the next pointers of nodes to remove zero-sum sequences.

Here's a step-by-step explanation of the approach:

1] Initialize a HashMap map to store the cumulative sum as keys and the corresponding node as values. Also, create a dummy node and set it as the head of the list. Initialize a variable sum to 0.

2] First Pass:

  i)   Iterate through the linked list using a pointer node.
  ii)  At each node, add its value to the sum.
  iii) Store the current sum value as a key in the map with the node as the corresponding   value. This records the cumulative sum at each node.
Second Pass:

3] Reset the sum to 0.
  i)  Iterate through the linked list again using the node pointer.
  ii) At each node, add its value to the sum.
 iii) Get the node associated with the cumulative sum of sum from the map. This node  represents the end of the subsequence with a zero sum.
  iv) Update the node.next pointer to skip the nodes between the current node and the node obtained from the map. This effectively removes the zero-sum subsequence.
  v) Return the dummy.next node, which is the head of the modified linked list without zero-sum sequences.

***Time Complexity:

The algorithm iterates through the linked list twice, each time in a single pass. Therefore, the time complexity is O(N), where N is the number of nodes in the linked list.
Space Complexity:

***The space complexity is O(N) because the HashMap map can store up to N unique cumulative sums and their corresponding nodes, where N is the number of nodes in the linked list.
*/
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int sum = 0;
        for (ListNode node = dummy; node != null; node = node.next) {
            sum += node.val;
            map.put(sum, node);
        }
        sum = 0;
        for (ListNode node = dummy; node != null; node = node.next) {
            sum += node.val;
            node.next = map.get(sum).next;
        }
        return dummy.next;
    }
}
