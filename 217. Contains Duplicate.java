/*
***Approach:
            1. Initialize a boolean variable flag to false, which will be used to indicate whether 
               duplicates are found or not.
            2. Create a HashMap called hm to store elements from the input array as keys and their 
               counts as values.
            3. Iterate through the input array nums using a for-each loop.
            4. For each element x in the array, check if it is already present in the HashMap (hm) 
               using the containsKey method:
            5. If it's not present (i.e., it's the first occurrence), add it to the HashMap with a 
               count of 1.
            6. If it's already present (i.e., it's a duplicate), increment its count in the HashMap
               by 1.
            7. After populating the HashMap with counts, iterate through the keys of the 
               HashMap(hm.keySet()).
            8. For each key x, check if its associated count is greater than 1. If so, set the flag to true,                  indicating that duplicates are found.
            
***Algorithm:

             1. The algorithm uses a HashMap to store the counts of each unique element in the array.
             2. It iterates through the array once to populate the HashMap and then iterates through 
                the HashMap keys to check for duplicates.
             3. If any element has a count greater than 1, it sets the flag to true.


***Time Complexity:

                  1. The first loop that populates the HashMap iterates through the entire nums array, 
                     which takes O(n) time, where n is the length of the array.
                  2. The second loop iterates through the keys of the HashMap, which can have at most 
                     n unique elements.
                  3. So, the overall time complexity is O(n).
Space Complexity:
                 1. The space complexity depends on the number of unique elements in the input array. 
                     In the worst case, if all elements are unique, the HashMap will have n key-value 
                     pairs.
                     
                 2. Therefore, the space complexity is O(n).
                 3. This code efficiently solves the problem with a time complexity of O(n) and a
                    space   complexity of O(n), where n is the length of the input array.






*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // here i have took flage as false. 
                // if duplicate element is greater than 1 it will change to true.
                boolean flag = false;
                // creating hashmap
                HashMap<Integer,Integer> hm = new HashMap<>();
                // here we used for each loop
                // we itereting over the nums array
                for(int x: nums)
                        {
                                // in hashmap there is one method containsKey which gives boolean value,
                                // we checking that if map hm is empty then fill key and value,
                                // first time element comes store in map it will be value 1.
                                if(!hm.containsKey(x))
                                        hm.put(x,1);
                                else
                                        // and then time come when the duplicate element seen, 
                                        // else it check the element is duplicate its preivous, 
                                        // value took we add 1 in that ,it get increase by 1.
                                        hm.put(x,hm.get(x)+1);
                        }
                // here we iterate over the hashmap by keySet
                for(Integer x : hm.keySet())
                        {
                                // we checking if element value is greater than 1 
                                // falg get change to true if not it will remain false.
                                if(hm.get(x) > 1)
                                {
                                        flag = true;
                                }
                        }
                return flag;
    }
}
