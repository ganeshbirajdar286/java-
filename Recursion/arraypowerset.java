import java.util.*;

public class arraypowerset {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int nums[] = {1, 2,3}; // Reduced to 2 elements for brevity
        generateSubsets(new ArrayList<>(), nums, 0, result);
    }
    
    public static void generateSubsets(List<Integer> current, int[] nums, int idx, List<List<Integer>> result) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(current)); // Create a deep copy (snapshot) because 'current' is mutable and will change during backtracking.
            System.out.println(result);
            return;
        }
        // Option 1: Include the number
        current.add(nums[idx]);
        generateSubsets(current, nums, idx + 1, result);

        // Backtrack: Remove the number to explore Option 2
        current.remove(current.size() - 1);

        // Option 2: Exclude the number
        generateSubsets(current, nums, idx + 1, result);
    }
}

//this is eg  for  understanding  deep copy 

// import java.util.*;

// class Main {
//     public static void main(String[] args) {
//         List<String> myOriginal = new ArrayList<>();
//         myOriginal.add("Milk");

//         // 1. THIS IS A REFERENCE (The "Mirror")
//         // Both variables point to the same physical object in memory.
//         List<String> reference = myOriginal; 

//         // 2. THIS IS A COPY (The "Photo")
//         // We create a brand new object and copy the items into it.
//         List<String> copy = new ArrayList<>(myOriginal); 

//         // Now, let's "Backtrack" (remove Milk)
//         myOriginal.remove(0);

//         System.out.println("Original: " + myOriginal); // Output: []
//         System.out.println("Reference: " + reference); // Output: [] (It changed!)
//         System.out.println("Copy: " + copy);           // Output: [Milk] (It stayed safe!)
//     }
// }>