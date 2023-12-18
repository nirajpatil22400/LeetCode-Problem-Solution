

import java.util.Scanner;

class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        int n = nums.length;
        int[] result = new int[2];

        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
}

public class Main
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = scanner.nextInt();

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        if (result[0] == -1 && result[1] == -1) {
            System.out.println("No two sum solution found");
        } else {
            System.out.println("The two indices are: " + result[0] + " and " + result[1]);
        }
    }
}



