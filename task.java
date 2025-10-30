//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
public class task {
public boolean hasDuplicate (int[] nums) {
    java.util.HashSet<Integer> set = new java.util.HashSet<>();
    for (int num : nums) {
        if (set.contains(num)) {
            return true;
        }
        set.add(num);
    }
    return false;
} 
}