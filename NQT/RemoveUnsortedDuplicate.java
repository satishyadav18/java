import java.util.ArrayList;

// Solution class
class Solution {
    // Function to remove duplicates from an array
    public ArrayList<Integer> removeDuplicates(int[] arr) {
        // Result list to store unique elements
        ArrayList<Integer> result = new ArrayList<>();

        // Traverse each element in arr
        for (int i = 0; i < arr.length; i++) {
            // Flag to check if element already exists in result
            boolean found = false;

            // Check for duplicates in result
            for (int j = 0; j < result.size(); j++) {
                if (arr[i] == result.get(j)) {
                    found = true;
                    break;
                }
            }

            // If not found, add to result
            if (!found) {
                result.add(arr[i]);
            }
        }

        // Return the result list
        return result;
    }
}

// Main class
public class RemoveUnsortedDuplicate {
    public static void main(String[] args) {
        // Input array
        int[] arr = {4, 5, 4, 2, 2, 3, 1};

        // Create Solution object
        Solution sol = new Solution();

        // Call removeDuplicates
        ArrayList<Integer> result = sol.removeDuplicates(arr);

        // Print result
        System.out.print("Array after removing duplicates: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
