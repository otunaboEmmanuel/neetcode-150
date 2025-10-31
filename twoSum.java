import java.util.Map;

public class twoSum {
    public static int[] twoSumm(int[] nums, int target) {
        Map<Integer, Integer> indice = new java.util.HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
		    if(indice.containsKey(diff)){
		int j = indice.get(diff);
		return(j<i) ? new int[]{j, i} : new int[]{i, j};	
	}
	indice.put(nums[i],i); 
}
    return new int[0];
 
}
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumm(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); 
    }

}
